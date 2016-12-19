package com.infogain.fnol.controller;

import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.imageio.ImageIO;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import noNamespace.ACORDDocument;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.util.Base64Utils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.guidewire.cc.typekey.DocumentSection;
import com.guidewire.cc.typekey.DocumentSecurityType;
import com.guidewire.cc.typekey.DocumentStatusType;
import com.guidewire.cc.typekey.DocumentType;
import com.guidewire.cc.typekey.NoteSecurityType;
import com.guidewire.cc.typekey.NoteTopicType;
import com.guidewire.cc.ws.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.SearchForClaimsResponse.Return;
import com.guidewire.cc.ws.gw.webservice.cc.cc800.pcintegration.pcentities.pcclaim.PCClaim;
import com.guidewire.cc.ws.gw.webservice.cc.cc800.pcintegration.pcentities.pcclaimdetail.PCClaimDetail;
import com.guidewire.cc.ws.gw.webservice.cc.cc801.claim.activityapi.activitydtonotification.ActivityDTONotification;
import com.guidewire.cc.ws.gw.webservice.cc.cc801.dto.activitydto.ActivityDTO;
import com.guidewire.cc.ws.gw.webservice.cc.cc801.dto.claimdto.ClaimDTO;
import com.guidewire.cc.ws.gw.webservice.cc.cc801.dto.claiminfodto.ClaimInfoDTO;
import com.guidewire.cc.ws.gw.webservice.cc.cc801.dto.documentdto.DocumentDTO;
import com.guidewire.cc.ws.gw.webservice.cc.cc801.dto.exposuredto.ExposureDTO;
import com.guidewire.cc.ws.gw.webservice.cc.cc801.dto.notedto.NoteDTO;
import com.guidewire.pc.ccintegration.CCPerson;
import com.guidewire.pc.ws.gw.webservice.pc.pc800.ccintegration.ccpolicysearchintegration.RetrievePolicyResponse;
import com.infogain.fnol.core.FNOLLogger;
import com.infogain.fnol.integration.claim.ClaimImpl;
import com.infogain.fnol.integration.claim.IClaim;
import com.infogain.fnol.integration.policy.IPolicy;
import com.infogain.fnol.integration.policy.PolicyImpl;
import com.infogain.fnol.model.ClaimStageDTO;
import com.infogain.fnol.model.ClaimsData;
import com.infogain.fnol.model.ClaimsList;
import com.infogain.fnol.model.FnolJsonDTO;
import com.infogain.fnol.model.ImageDemoData;
import com.infogain.fnol.model.JournalData;
import com.infogain.fnol.model.NotificationDTO;
import com.infogain.fnol.model.NotifyDTO;
import com.infogain.fnol.model.StagesDTO;
import com.infogain.fnol.transformation.AcordTransform;
import com.infogain.fnol.util.FNOLUtil;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

@Controller
@RequestMapping("/claim")
@Api(value="/claim",description="Restful Webservice for claim related functionalities")
public class ClaimController {

	@Autowired
	Properties appProps;

	@FNOLLogger
	Logger logger;

	// #####################service to save a claim############################
	@ApiOperation(value="Save FNOL", notes="This API saves First Notice of loss")
	@RequestMapping(value = "/save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Map<String, Object> save(@RequestBody FnolJsonDTO fnolJSONDTO,
			BindingResult result) {
		String errorMsg = null;
		String claimresult = null;
		try {

			AcordTransform transform = new AcordTransform();
			ACORDDocument aCORDDocument = transform
					.parseXMLtoAcord(fnolJSONDTO);

			IClaim claim = getClaimAPI(logger, appProps);

			logger.info("Final Document sending to CC   "
					+ aCORDDocument.toString());

			claimresult = claim.importAcordClaimFromXML(aCORDDocument
					.toString());

		} catch (Exception ex) {
			logger.info("Exception in claim save  " + ex);
			errorMsg = ex.getMessage();
		}

		if (result.hasErrors()) {
			return FNOLUtil.getResponse(
					appProps.getProperty("response.code.error"),
					appProps.getProperty("error.saveClaim"), errorMsg);
		} else {

			Map<String, String> resposeMap = new HashMap<String, String>();
			resposeMap.put("claimID", claimresult);

			return FNOLUtil.getResponse(
					appProps.getProperty("response.code.success"),
					appProps.getProperty("success.saveClaim"), resposeMap);
		}
	}

	// ##############################################################################

	// ###############service to get all claims against a policy-Vikas(15-06-16)#################
	@ApiOperation(value = "Search Claims", notes = "Returns claims against a policy no.")
	@RequestMapping(value = "/searchClaims/{policyNumber}", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Map<String, Object> searchClaims(@PathVariable String policyNumber) {
		String errorMsg = null;
		ClaimsData allClaims = null;
		Return result = null;
		try {

			// *******calling policy service to get insured
			// details and expiry date-Vikas(20-6-16)******
			IPolicy ws = new PolicyImpl();
			((PolicyImpl) ws).setAppProps(appProps);
			((PolicyImpl) ws).setLogger(logger);
			RetrievePolicyResponse.Return policyResult = ws
					.retrievePolicy(policyNumber);

			if (policyResult == null) {
				throw new Exception("Invalid policy");
			}

			CCPerson insured = (CCPerson) policyResult.getEnvelope()
					.getCCPolicy().getInsured();
			String firstName = insured.getFirstName();
			String lastName = insured.getLastName();
			// **********************************************************

			IClaim searchClaims = getClaimAPI(logger, appProps);

			result = searchClaims.searchForClaims(policyNumber);

			List<PCClaim> claims = result.getEntry();

			allClaims = new ClaimsData();
			List<ClaimsList> claimsList = new ArrayList<ClaimsList>();

			if (!claims.isEmpty()) {
				allClaims.setPolicyNumber(claims.get(0).getPolicyNumber());
				allClaims.setPolicyType(claims.get(0).getPolicyTypeName());
				allClaims.setInsured(firstName + " " + lastName);
				allClaims.setExpiryDate(policyResult.getEnvelope()
						.getCCPolicy().getExpirationDate().toString());

				for (PCClaim pcClaim : claims) {
					ClaimsList data = new ClaimsList();

					PCClaimDetail claimDetail = searchClaims
							.getClaimByClaimNumber(pcClaim.getClaimNumber());

					data.setHighRiskIndicator(searchClaims
							.isFlagged(claimDetail.getClaimPublicID()));

					data.setClaimNumber(pcClaim.getClaimNumber());
					data.setLossDate(pcClaim
							.getLossDate()
							.toString()
							.substring(
									0,
									pcClaim.getLossDate().toString()
											.lastIndexOf("T")));
					data.setRemainingReserves(pcClaim.getRemainingReserves()
							.toString());
					data.setStatus(pcClaim.getStatus());
					data.setTotalIncurred(pcClaim.getTotalIncurred().toString());

					claimsList.add(data);
				}

			}
			allClaims.setClaims(claimsList);

		} catch (Exception ex) {
			logger.info("Exception in claim search  " + ex);
			errorMsg = ex.getMessage();
		}

		if (result != null) {
			return FNOLUtil.getResponse(
					appProps.getProperty("response.code.success"),
					appProps.getProperty("success.claimSearch"), allClaims);
		}

		else {
			return FNOLUtil.getResponse(
					appProps.getProperty("response.code.error"),
					appProps.getProperty("error.validatedPolicy"), errorMsg);
		}

	}

	// #######################################################################

	// #######################################################################
	// service to get a claim detail of a claim by claim
	// the fields for Paid,FuturePayment can be obtained here
	// -Vikas(15-06-16)
	@ApiOperation(value = "Get Claim Detail", notes = "Returns claim details against a claim no.")
	@RequestMapping(value = "/getClaimDetail/{claimNumber}", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Map<String, Object> getClaimDetail(@PathVariable String claimNumber) {
		String errorMsg = null;
		PCClaimDetail pcClaimDetail = null;
		try {

			IClaim getClaim = getClaimAPI(logger, appProps);
			pcClaimDetail = getClaim.getClaimByClaimNumber(claimNumber);

		} catch (Exception ex) {
			logger.info("Exception in claim save  " + ex);
			errorMsg = ex.getMessage();
		}

		if (pcClaimDetail != null) {
			return FNOLUtil.getResponse(
					appProps.getProperty("response.code.success"),
					appProps.getProperty("success.claimSearch"), pcClaimDetail);
		} else {
			return FNOLUtil.getResponse(
					appProps.getProperty("response.code.error"),
					appProps.getProperty("error.searchClaim"), errorMsg);
		}

	}

	// ###############################################################################################

	// #################service to get a claim detail of a claim by claim
	// ID-Vikas(15-06-16)################
	@ApiOperation(value = "Get Claim By ID", notes = "Returns claim details by claim ID")
	@RequestMapping(value = "/getClaimByID/{claimID}", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Map<String, Object> getClaimByID(@PathVariable String claimID) {
		String errorMsg = null;
		ClaimInfoDTO claimInfoDTO = null;
		ClaimDTO claimDTO = null;
		try {
			IClaim api = getClaimAPI(logger, appProps);

			claimDTO = api.getDtoForClaim(claimID);

		} catch (Exception ex) {
			logger.info("Exception in getClaimByID  " + ex);
			errorMsg = ex.getMessage();
		}
		if (claimDTO != null) {
			return FNOLUtil.getResponse(
					appProps.getProperty("response.code.success"),
					appProps.getProperty("success.claimSearch"), claimDTO);
		} else {
			return FNOLUtil.getResponse(
					appProps.getProperty("response.code.error"),
					appProps.getProperty("error.searchClaim"), errorMsg);
		}
	}

	// #############################################################################################

	// ########### service to upload document like an image for a claim #####################
	@ApiOperation(value = "Upload Document", notes = "Upload documents(images) against a claim")
	@RequestMapping(value = "/uploadDocument", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Map<String, Object> uploadDocument(
			@RequestBody ImageDemoData imageData, BindingResult result) {
		String errorMsg = null;
		String createdDoc = null;
		Map<String, String> mimetypes = new HashMap<String, String>();
		mimetypes.put("jpg", "image/jpeg");
		mimetypes.put("png", "image/png");
		mimetypes.put("jpeg", "image/jpeg");
		mimetypes.put("bmp", "image/bmp");
		mimetypes.put("gif", "image/gif");

		// -----------------saving file in local directory----------------

		try {
			String fileName = imageData.getImageName();

			// code added to resolve filename conflicts-Vikas(29.7.16)

			Date now = new Date();

			// get the extension type of file('.' included)
			String type = fileName.substring(fileName.lastIndexOf("."));
			String ext = type.substring(1);

			fileName = fileName.replace(type, "-" + now.getTime() + type);

			// Path where the uploaded file will be stored.
			String path = appProps.getProperty("document.path") + fileName;

			// Now create the output file on the server.
			File outputFile = new File(path);
			outputFile.createNewFile();

			byte[] imageFileBytes = Base64Utils.decodeFromString(imageData
					.getImage());
			BufferedImage img = ImageIO.read(new ByteArrayInputStream(
					imageFileBytes));
			if (img != null) {
				ImageIO.write(img, ext, outputFile);
				img.flush();
			}
			// **********************************************

			IClaim api = getClaimAPI(logger, appProps);

			DocumentDTO documentDTO = new DocumentDTO();
			documentDTO.setAuthor("Super User");
			documentDTO.setClaimID(imageData.getClaimId());

			Date dateMod = new Date();
			DatatypeFactory df = DatatypeFactory.newInstance();
			GregorianCalendar gc = new GregorianCalendar();
			gc.setTimeInMillis(dateMod.getTime());
			XMLGregorianCalendar xMLGregorianCalendarMod = df
					.newXMLGregorianCalendar(gc);
			documentDTO.setDateModified(xMLGregorianCalendarMod);

			documentDTO.setDescription("desc");
			documentDTO.setDMS(Boolean.TRUE);

			documentDTO.setName(fileName);
			documentDTO.setMimeType(mimetypes.get(ext));
			documentDTO.setRecipient("recpt");
			documentDTO.setSection(DocumentSection.MEDICAL);
			documentDTO.setSecurityType(DocumentSecurityType.UNRESTRICTED);
			documentDTO.setStatus(DocumentStatusType.DRAFT);
			documentDTO.setType(DocumentType.FNOL); // will change later

			createdDoc = api.createDocument(documentDTO);
			// **********************************************

		} catch (Exception e) {
			logger.info("Exception in uploadDocument  " + e);
			errorMsg = e.getMessage();
		}

		if (createdDoc != null) {
			Map<String, Object> out = new HashMap<String, Object>();
			out.put("docId", createdDoc);
			return FNOLUtil.getResponse(
					appProps.getProperty("response.code.success"),
					appProps.getProperty("success.createdDoc"), out);
		} else {
			return FNOLUtil.getResponse(
					appProps.getProperty("response.code.error"),
					appProps.getProperty("error.createdDoc"), errorMsg);
		}
	}

	// ########################################################################################

	// ##################new method to upload any file against a claim
	// same as above method-vikas- (20.7.16)
	// #########################
	@ApiOperation(value = "Upload File", notes = "Upload documents(pdf,doc,etc.) against a claim")
	@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> uploadFileHandler(
			@RequestParam("fileName") String fileName,
			@RequestParam("claimId") String claimId,
			@RequestParam("file") MultipartFile file) {
		String errorMsg = null;
		String createdDoc = null;
		if (!file.isEmpty()) {
			// save file on disk---------------------
			try {
				System.out.println("content type is::::::::   "
						+ file.getContentType());
				byte[] bytes = file.getBytes();
				Date now = new Date();
				// get the extension type of file('.' included)
				String type = fileName.substring(fileName.lastIndexOf("."));
				fileName = fileName.replace(type, "-" + now.getTime() + type);
				String path = appProps.getProperty("document.path") + fileName;

				// Create the file on server
				File serverFile = new File(path);
				BufferedOutputStream stream = new BufferedOutputStream(
						new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.close();
				// ------------------------------------

				IClaim api = getClaimAPI(logger, appProps);

				DocumentDTO documentDTO = new DocumentDTO();
				documentDTO.setAuthor("Super User");
				documentDTO.setClaimID(claimId);

				Date dateMod = new Date();
				DatatypeFactory df = DatatypeFactory.newInstance();
				GregorianCalendar gc = new GregorianCalendar();
				gc.setTimeInMillis(dateMod.getTime());
				XMLGregorianCalendar xMLGregorianCalendarMod = df
						.newXMLGregorianCalendar(gc);
				documentDTO.setDateModified(xMLGregorianCalendarMod);

				documentDTO.setDescription("desc");
				documentDTO.setDMS(Boolean.TRUE);

				documentDTO.setName(fileName);
				documentDTO.setMimeType(file.getContentType());

				documentDTO.setRecipient("recpt");
				documentDTO.setSection(DocumentSection.MEDICAL);
				documentDTO.setSecurityType(DocumentSecurityType.UNRESTRICTED);
				documentDTO.setStatus(DocumentStatusType.DRAFT);
				documentDTO.setType(DocumentType.FNOL); // will change later

				createdDoc = api.createDocument(documentDTO);

			} catch (Exception e) {
				logger.info("Exception in uploadDocument  " + e);
				errorMsg = e.getMessage();
			}
		}

		if (createdDoc != null) {
			Map<String, Object> out = new HashMap<String, Object>();
			out.put("docId", createdDoc);
			return FNOLUtil.getResponse(
					appProps.getProperty("response.code.success"),
					appProps.getProperty("success.createdDoc"), out);
		} else {
			return FNOLUtil.getResponse(
					appProps.getProperty("response.code.error"),
					appProps.getProperty("error.createdDoc"), errorMsg);
		}
	}

	// ######################################################

	// ############service to create a note against a claimId-Vikas(29.6.16)####################
	@ApiOperation(value = "Create Journal", notes = "Create journals(notes) against a claim")
	@RequestMapping(value = "/createJournal", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Map<String, Object> createJournal(
			@RequestBody JournalData journalData, BindingResult result) {
		String errorMsg = null;
		NoteDTO noteDTO = null;
		String notePublicId = null;
		try {
			IClaim api = getClaimAPI(logger, appProps);

			Date dateMod = new Date();
			DatatypeFactory df = DatatypeFactory.newInstance();
			GregorianCalendar gc = new GregorianCalendar();
			gc.setTimeInMillis(dateMod.getTime());
			XMLGregorianCalendar xMLGregorianCalendarMod = df
					.newXMLGregorianCalendar(gc);

			noteDTO = new NoteDTO();
			noteDTO.setClaimID(journalData.getClaimID());
			noteDTO.setBody(journalData.getBody());
			noteDTO.setAuthoringDate(xMLGregorianCalendarMod);
			if (journalData.getConfidential() != null
					&& journalData.getConfidential().trim()
							.equalsIgnoreCase("yes")) {
				noteDTO.setConfidential(true);
			} else {
				noteDTO.setConfidential(false);
			}
			noteDTO.setCreateTime(xMLGregorianCalendarMod);
			noteDTO.setSecurityType(NoteSecurityType.PUBLIC);
			noteDTO.setSubject(journalData.getSubject());
			noteDTO.setTopic(NoteTopicType.valueOf(journalData.getTopic()
					.trim().toUpperCase()));

			notePublicId = api.createJournal(noteDTO);
		} catch (Exception ex) {
			logger.info("Exception in uploadDocument  " + ex);
			errorMsg = ex.getMessage();
		}
		if (notePublicId != null) {
			Map<String, Object> out = new HashMap<String, Object>();
			out.put("noteId", notePublicId);
			return FNOLUtil.getResponse(
					appProps.getProperty("response.code.success"),
					appProps.getProperty("success.createdJournal"), out);
		} else {
			return FNOLUtil.getResponse(
					appProps.getProperty("response.code.error"),
					appProps.getProperty("error.createdJournal"), errorMsg);
		}
	}

	// ##############################################################################

	// ########### method to get get activities by claim ID-Vikas(07-07-16)############
	@ApiOperation(value = "Get Activity By ID", notes = "get activities against a claim")
	@RequestMapping(value = "/getActivityByID/{claimID}", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Map<String, Object> getActivities(@PathVariable String claimID) {
		String errorMsg = null;
		List<com.infogain.fnol.model.ActivityDTO> activities = null;
		try {
			IClaim api = getClaimAPI(logger, appProps);

			List<ActivityDTO> activityList = api.getActivityByClaimID(claimID);

			if (activityList != null) {
				activities = new ArrayList<com.infogain.fnol.model.ActivityDTO>();
				for (ActivityDTO activityDTO : activityList) {
					com.infogain.fnol.model.ActivityDTO act = new com.infogain.fnol.model.ActivityDTO();
					act.setCreatedDate(activityDTO.getCreateTime().toString());
					act.setStatus(activityDTO.getActivityStatus());
					act.setSubject(activityDTO.getSubject());
					// here we are getting due date in Description field of
					// activityDTO
					String dateStr = activityDTO.getDescription();
					DateFormat formatter = new SimpleDateFormat(
							"E MMM dd HH:mm:ss Z yyyy");
					if (dateStr != null && dateStr != "") {
						Date dueDate = (Date) formatter.parse(dateStr);
						if (new Date().after(dueDate)) {
							act.setHighRiskIndicator(true);
						}
					}
					activities.add(act);
				}
			}

		} catch (Exception ex) {
			logger.info("error fetching activities::::" + ex);
			errorMsg = ex.getMessage();
		}

		if (activities != null) {
			return FNOLUtil.getResponse(
					appProps.getProperty("response.code.success"),
					appProps.getProperty("success.activitySearch"), activities);
		} else {
			return FNOLUtil.getResponse(
					appProps.getProperty("response.code.error"),
					appProps.getProperty("error.activitySearch"), errorMsg);
		}
	}

	// #####################################################################################

	// #################Demo method to get and display status by claim
	// ID-Vikas(18-07-16)################
	
	@RequestMapping(value = "/getStates/{claimID}", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Map<String, Object> getStatus(@PathVariable String claimID) {
		String errorMsg = null;
		StagesDTO stagesDTO = null;
		ClaimDTO claimDTO = null;
		List<ClaimStageDTO> stageList = null;
		ExposureDTO exposureDTO = null;
		try {
			IClaim api = getClaimAPI(logger, appProps);
			claimDTO = api.getDtoForClaim(claimID);
			exposureDTO = api.getDtoForExposure(claimDTO.getExposureIDs()
					.getEntry().get(0));
			PCClaimDetail claimDetail = api.getClaimByClaimNumber(claimDTO
					.getClaimNumber());

			stagesDTO = new StagesDTO();
			stagesDTO.setClaimNo(claimDTO.getClaimNumber());
			stagesDTO.setPolicyNo(claimDetail.getPcClaim().getPolicyNumber());

			stageList = new ArrayList<ClaimStageDTO>();

			ClaimStageDTO claimStage = new ClaimStageDTO();
			claimStage.setClaimStage("claim");
			claimStage.setColour("grey");
			stageList.add(claimStage);

			claimStage = new ClaimStageDTO();
			claimStage.setClaimStage("exposure");
			claimStage.setColour("green");
			stageList.add(claimStage);

			claimStage = new ClaimStageDTO();
			claimStage.setClaimStage("reserve");
			claimStage.setColour("grey");
			stageList.add(claimStage);

			claimStage = new ClaimStageDTO();
			claimStage.setClaimStage("cheque");
			claimStage.setColour("grey");
			stageList.add(claimStage);

			stagesDTO.setStagesList(stageList);

		} catch (Exception ex) {
			logger.info("error fetching activities::::" + ex);
			errorMsg = ex.getMessage();
		}
		if (stagesDTO != null) {
			return FNOLUtil.getResponse(
					appProps.getProperty("response.code.success"),
					appProps.getProperty("success.activitySearch"), stagesDTO);
		} else {
			return FNOLUtil.getResponse(
					appProps.getProperty("response.code.error"),
					appProps.getProperty("error.activitySearch"), errorMsg);
		}
	}

	// #############################################################################################

	// ############# method to get notifications -Vikas(25-07-16)############
	@ApiOperation(value = "Notifications", notes = "get notifications for claims against a policy no.")
	@RequestMapping(value = "/notifications/{policyNo}", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Map<String, Object> notifications(@PathVariable String policyNo) {
		String errorMsg = null;
		List<NotificationDTO> notes = new ArrayList<NotificationDTO>();
		List<ActivityDTONotification> notificationResult = null;
		NotifyDTO notifyDTO = null;
		try {
			IClaim api = getClaimAPI(logger, appProps);

			notificationResult = api.getNotifications(policyNo);
			notifyDTO = new NotifyDTO();
			notifyDTO.setPolicyNo(policyNo);

			for (ActivityDTONotification activityDTONotification : notificationResult) {
				NotificationDTO dto = null;
				List<ActivityDTO> activities = activityDTONotification
						.getActivities().getEntry();
				for (ActivityDTO activityDTO : activities) {
					dto = new NotificationDTO();
					dto.setClaimNo(activityDTONotification.getClaimNumber());
					dto.setSubject(activityDTO.getSubject());
					dto.setBody(activityDTO.getDescription());
					dto.setDate(activityDTO.getCreateTime().toString());
					dto.setActivityId(activityDTO.getPublicID());
					dto.setFlag("");
				}
				notes.add(dto);
			}
			notifyDTO.setNotifications(notes);
		} catch (Exception ex) {
			logger.info("error fetching activities::::" + ex);
			errorMsg = ex.getMessage();
		}

		if (notifyDTO != null) {
			return FNOLUtil.getResponse(
					appProps.getProperty("response.code.success"),
					appProps.getProperty("success.activitySearch"), notifyDTO);
		} else {
			return FNOLUtil.getResponse(
					appProps.getProperty("response.code.error"),
					appProps.getProperty("error.activitySearch"), errorMsg);
		}

	}

	// ####################################################################################

	// ################# method to mark seen notifications-Vikas(2-8-16)################
	@ApiOperation(value = "Update Seen", notes = "mark seen notifications by their ID")
	@RequestMapping(value = "/updateSeen/{activityId}", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Map<String, Object> updateSeen(@PathVariable String activityId) {
		String errorMsg = null;
		boolean seen = false;
		try {
			IClaim api = getClaimAPI(logger, appProps);
			seen = api.updateSeenNotification(activityId);
		} catch (Exception ex) {
			logger.info("error in updateSeen::::" + ex);
			errorMsg = ex.getMessage();
		}

		if (errorMsg == null) {
			return FNOLUtil.getResponse(
					appProps.getProperty("response.code.success"),
					appProps.getProperty("success.updateNotification"), seen);
		} else {
			return FNOLUtil.getResponse(
					appProps.getProperty("response.code.error"),
					appProps.getProperty("error.updateNotification"), errorMsg);
		}

	}

	// ###################################################################################

	// get Claim api to call web services
	private IClaim getClaimAPI(Logger logger, Properties appProps) {
		IClaim api = new ClaimImpl();
		((ClaimImpl) api).setAppProps(appProps);
		((ClaimImpl) api).setLogger(logger);
		return api;
	}

}
