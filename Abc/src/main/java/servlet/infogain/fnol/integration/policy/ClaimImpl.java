package com.infogain.fnol.integration.claim;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.guidewire.cc.ws.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.PCClaimSearchIntegrationAPI;
import com.guidewire.cc.ws.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.PCClaimSearchIntegrationAPIPortType;
import com.guidewire.cc.ws.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.SearchForClaimsResponse.Return;
import com.guidewire.cc.ws.gw.webservice.cc.cc800.pcintegration.pcentities.pcclaimdetail.PCClaimDetail;
import com.guidewire.cc.ws.gw.webservice.cc.cc800.pcintegration.pcentities.pcclaimsearchcriteria.PCClaimSearchCriteria;
import com.guidewire.cc.ws.gw.webservice.cc.cc800.pcintegration.pcentities.pcclaimsearchcriteria.PCClaimSearchCriteria.PolicyNumbers;
import com.guidewire.cc.ws.gw.webservice.cc.cc801.claim.activityapi.activityapi.ActivityAPI;
import com.guidewire.cc.ws.gw.webservice.cc.cc801.claim.activityapi.activityapi.ActivityAPIPortType;
import com.guidewire.cc.ws.gw.webservice.cc.cc801.claim.activityapi.activityapi.GetNotificationsByPolicyNoResponse;
import com.guidewire.cc.ws.gw.webservice.cc.cc801.claim.activityapi.activityapi.WsiAuthenticationException_Exception;
import com.guidewire.cc.ws.gw.webservice.cc.cc801.claim.activityapi.activitydtonotification.ActivityDTONotification;
import com.guidewire.cc.ws.gw.webservice.cc.cc801.claim.claimapi.ClaimAPI;
import com.guidewire.cc.ws.gw.webservice.cc.cc801.claim.claimapi.ClaimAPIPortType;
import com.guidewire.cc.ws.gw.webservice.cc.cc801.dto.activitydto.ActivityDTO;
import com.guidewire.cc.ws.gw.webservice.cc.cc801.dto.claimdto.ClaimDTO;
import com.guidewire.cc.ws.gw.webservice.cc.cc801.dto.documentdto.DocumentDTO;
import com.guidewire.cc.ws.gw.webservice.cc.cc801.dto.exposuredto.ExposureDTO;
import com.guidewire.cc.ws.gw.webservice.cc.cc801.dto.notedto.NoteDTO;
import com.guidewire.ws.soapheaders.TransactionId;
import com.infogain.fnol.core.FNOLLogger;
import com.infogain.fnol.model.ClaimsData;
import com.sun.xml.ws.api.message.Headers;
import com.sun.xml.ws.developer.WSBindingProvider;

//import org.acord.standards.pcSurety.acord1.xml.ACORDType;

public class ClaimImpl implements IClaim {

	@FNOLLogger
	Logger logger;
	@Autowired
	Properties appProps;

	@Override
	public String importAcordClaimFromXML(String aCORDInput)throws Exception {
		// TODO Auto-generated method stub
		try{
		
		String claimresult = this.getClaimAPIPort().importAcordClaimFromXML(aCORDInput);
		
		logger.info("claimresult  " + claimresult);
			
		return claimresult;
	}catch(Exception ex){
		logger.info("Exception in claim save:"+ex);
		ex.printStackTrace();
		throw ex;
	}
		//return null;
	}
	

	

	@Override
	public Return searchForClaims(String policyNumber) throws Exception {
		Return result = null;
		List<ClaimsData> allClaims = null;

		try {
			PCClaimSearchCriteria criteria = new PCClaimSearchCriteria();

			// java.util.Date beginDate = new SimpleDateFormat("yyyy-MM-dd").
			// parse("2014-02-02");//temp hardcoded

			// ---the code below not needed after GW DB drop and
			// recreation(11-7-16)-----

			/*
			 * java.util.Date beginDate = new java.util.Date();
			 * 
			 * DatatypeFactory df = DatatypeFactory.newInstance();
			 * GregorianCalendar gc = new GregorianCalendar();
			 * gc.setTimeInMillis(beginDate.getTime()); XMLGregorianCalendar
			 * xMLGregorianCalendarBegin = df .newXMLGregorianCalendar(gc);
			 * 
			 * java.util.Date endDate = new java.util.Date(); DatatypeFactory
			 * df2 = DatatypeFactory.newInstance(); GregorianCalendar gc2 = new
			 * GregorianCalendar(); gc.setTimeInMillis(endDate.getTime());
			 * XMLGregorianCalendar xMLGregorianCalendarEnd = df2
			 * .newXMLGregorianCalendar(gc2);
			 */

			// criteria.setBeginDate(xMLGregorianCalendarBegin);
			// criteria.setEndDate(xMLGregorianCalendarEnd);

			// ---------------------------------------------------
			// criteria.setLob("AUTO");
			PolicyNumbers policyNumbers = new PolicyNumbers();
			policyNumbers.getEntry().add(policyNumber);
			criteria.setPolicyNumbers(policyNumbers);
			// criteria.setStatus("Open");
			result = this.getPCClaimSearchIntegrationAPIPort().searchForClaims(
					criteria);
		} catch (Exception ex) {
			logger.info("Exception in claim search  " + ex);
			ex.printStackTrace();
			throw ex;
		}
		return result;
	}
	
	@Override
	public PCClaimDetail getClaimByClaimNumber(String claimNumber)throws Exception {
		PCClaimDetail claimDetail = null;
		try {
			claimDetail = this.getPCClaimSearchIntegrationAPIPort().getClaimByClaimNumber(claimNumber);
					
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
		
		return claimDetail;
	}
	
	@Override
	public ClaimDTO getDtoForClaim(String claimId)throws Exception {
		ClaimDTO claimDTO = null;
		try {
			claimDTO = this.getClaimAPIPort().getDtoForClaim(claimId);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} 
		return claimDTO;
	}
	@Override
	public String createDocument(DocumentDTO documentDTO)throws Exception {
		String docId = null;
		try {
			docId = this.getClaimAPIPort().createDocument(documentDTO);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} 
		return docId;
	}
	@Override
	public String createJournal(NoteDTO noteDTO)throws Exception {
		String jourId = null;
		try {
			jourId = this.getClaimAPIPort().createNote(noteDTO);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} 
		return jourId;
	}
	
	@Override
	public String createActivity(ActivityDTO activityDTO)throws Exception {
		String actId = null;
		try {
			actId =  this.getClaimAPIPort().createActivity(activityDTO);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} 
		return actId;
	}
	@Override
	public List<ActivityDTO> getActivityByClaimID(String id)throws Exception {
		List<ActivityDTO> dtos = null;
		try {
			com.guidewire.cc.ws.gw.webservice.cc.cc801.claim.activityapi.activityapi.GetActivityByClaimIDResponse.Return result = this.getActivityAPI().getActivityByClaimID(id);
			dtos = result.getEntry();
		} catch (WsiAuthenticationException_Exception e) {
			e.printStackTrace();
			throw e;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	return dtos;
	}

	@Override
	public ExposureDTO getDtoForExposure(String exposureId)throws Exception {
		ExposureDTO exposureDTO = null;
		try {
			exposureDTO = this.getClaimAPIPort().getDtoForExposure(exposureId);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} 
		return exposureDTO;
	}
	
	@Override
	public boolean isFlagged(String claimId)throws Exception {
		boolean flagged = false;
		try {
			flagged = this.getClaimAPIPort().isFlagged(claimId);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} 
		return flagged;
	}
	
	@Override
	public List<ActivityDTONotification> getNotifications(String PolicyNo)throws Exception {
		List<ActivityDTONotification> dtoNotifications = null;
		try {
			GetNotificationsByPolicyNoResponse.Return result = this.getActivityAPI().getNotificationsByPolicyNo(PolicyNo);
			dtoNotifications = result.getEntry();
		
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} 
		return dtoNotifications;
	}
	
	@Override
	public boolean updateSeenNotification(String activityId)throws Exception {
		boolean isSeen = false;
		try {
			isSeen = this.getActivityAPI().updateActivitySeen(activityId);		
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} 
		return isSeen;
	}
	
	private PCClaimSearchIntegrationAPIPortType getPCClaimSearchIntegrationAPIPort() throws MalformedURLException {
		String claimURL = appProps.getProperty("pcClaimIntegr.ws.url");//"http://localhost:8080/cc/ws/gw/webservice/cc/cc800/pcintegration/PCClaimSearchIntegrationAPI?WSDL";
		PCClaimSearchIntegrationAPI pcClaimSearchIntegrationAPI = new PCClaimSearchIntegrationAPI(
				new URL(claimURL));
		PCClaimSearchIntegrationAPIPortType claimSearchAPIPortType = pcClaimSearchIntegrationAPI
				.getPCClaimSearchIntegrationAPISoap11Port();
		BindingProvider bp = (BindingProvider) claimSearchAPIPortType;
		Map<String, Object> context = bp.getRequestContext();
		String username = "su";
		String password = "gw";
		context.put(javax.xml.ws.BindingProvider.USERNAME_PROPERTY,
				username);
		context.put(javax.xml.ws.BindingProvider.PASSWORD_PROPERTY,
				password);

		TransactionId transactionId = new TransactionId();
		// double rand = (Math.random()) * 10000;
		Random generator = new Random();
		int rand = generator.nextInt(9999) + 10000;
		transactionId.setValue("" + rand);

		context.put("transaction_id", transactionId);

		WSBindingProvider bp1 = (WSBindingProvider) claimSearchAPIPortType;
		bp1.setOutboundHeaders(Headers.create(new QName(
				"http://guidewire.com/ws/soapheaders", "transaction_id"),
				transactionId.getValue()));
		
		return claimSearchAPIPortType;
	}
	
	private ClaimAPIPortType getClaimAPIPort() throws MalformedURLException {
		String claimURL = appProps.getProperty("claim.ws.url");//"http://localhost:8080/cc/ws/gw/webservice/cc/cc801/claim/ClaimAPI?WSDL";
	    ClaimAPI claimAPI= new ClaimAPI(new URL(claimURL));
	    ClaimAPIPortType claimAPIPortType = claimAPI.getClaimAPISoap11Port();
		BindingProvider bp = (BindingProvider) claimAPIPortType;
		Map<String, Object> context = bp.getRequestContext();
		String username = "su";
		String password = "gw";
		context.put(javax.xml.ws.BindingProvider.USERNAME_PROPERTY, username);
		context.put(javax.xml.ws.BindingProvider.PASSWORD_PROPERTY, password);

		TransactionId transactionId = new TransactionId();
		//double rand = (Math.random()) * 10000;
		Random generator = new Random();
		int rand = generator.nextInt(9999) + 10000 ;
		transactionId.setValue(""+rand);
		
		context.put("transaction_id", transactionId);
		
		WSBindingProvider bp1 = (WSBindingProvider)claimAPIPortType;
		bp1.setOutboundHeaders(
		  Headers.create(new QName("http://guidewire.com/ws/soapheaders", "transaction_id"),transactionId.getValue())
		);
		
		return claimAPIPortType;
	}
	
	//new method to get activity api- Vikas(7-7-16)   under test
	private ActivityAPIPortType getActivityAPI() throws Exception {
		String activityURL = appProps.getProperty("activity.ws.url");//"http://localhost:8080/cc/ws/gw/webservice/cc/cc801/claim/activityapi/ActivityAPI?WSDL";
		ActivityAPI activityAPI= new ActivityAPI(new URL(activityURL));	    
	    ActivityAPIPortType activityAPIPortType = activityAPI.getActivityAPISoap11Port();
		BindingProvider bp = (BindingProvider) activityAPIPortType;
		Map<String, Object> context = bp.getRequestContext();
		String username = "su";
		String password = "gw";
		context.put(javax.xml.ws.BindingProvider.USERNAME_PROPERTY, username);
		context.put(javax.xml.ws.BindingProvider.PASSWORD_PROPERTY, password);

		TransactionId transactionId = new TransactionId();
		//double rand = (Math.random()) * 10000;
		Random generator = new Random();
		int rand = generator.nextInt(9999) + 10000 ;
		transactionId.setValue(""+rand);
		
		context.put("transaction_id", transactionId);
		
		WSBindingProvider bp1 = (WSBindingProvider)activityAPIPortType;
		bp1.setOutboundHeaders(
		  Headers.create(new QName("http://guidewire.com/ws/soapheaders", "transaction_id"),transactionId.getValue())
		);
		
		return activityAPIPortType;
	}
	
	public Logger getLogger() {
		return logger;
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}

	public Properties getAppProps() {
		return appProps;
	}

	public void setAppProps(Properties appProps) {
		this.appProps = appProps;
	}
		
}
