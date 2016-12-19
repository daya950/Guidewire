package servlet.infogain.fnol.transformation;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import noNamespace.ACORDDocument;
import noNamespace.ACORDType;
import noNamespace.AddrType;
import noNamespace.AssignedIdentifier;
import noNamespace.AutoLossInfoType;
import noNamespace.C10;
import noNamespace.C25;
import noNamespace.C255;
import noNamespace.C32;
import noNamespace.C4;
import noNamespace.C40;
import noNamespace.C50;
import noNamespace.C60;
import noNamespace.C64;
import noNamespace.CInfinite;
import noNamespace.CURRENCY;
import noNamespace.ClaimsNotificationAddRqType;
import noNamespace.ClaimsOccurrenceType;
import noNamespace.ClaimsPartyType;
import noNamespace.ClaimsReportedType;
import noNamespace.ClaimsSvcRqType;
import noNamespace.CoverageType;
import noNamespace.Coverages;
import noNamespace.Date;
import noNamespace.DateTime;
import noNamespace.Decimal;
import noNamespace.FinancialStatementInfoType;
import noNamespace.GeneralPartyInfoType;
import noNamespace.InsuredOrPrincipalInfoType;
import noNamespace.InsuredOrPrincipalType;
import noNamespace.LineOfBusiness;
import noNamespace.Long;
import noNamespace.LossRunInqInfoType;
import noNamespace.NameInfoType;
import noNamespace.OpenEnum;
import noNamespace.PCPOLICY;
import noNamespace.PersonInfoType;
import noNamespace.PersonNameType;
import noNamespace.PrincipalInfoType;
import noNamespace.QuestionAnswerType;
import noNamespace.QuestionOccurrenceInfoType;
import noNamespace.Response;
import noNamespace.ResponseIndicator;
import noNamespace.Time;
//import noNamespace.VehInfoType;

import noNamespace.VehInfoType;

import servlet.infogain.fnol.model.FnolJsonDTO;
import servlet.infogain.fnol.model.Question;

public class AcordTransform {

	private static Map codeMap = new HashMap();
	{
		codeMap.put("Animal", "animal");
		codeMap.put("Collision while turning left", "leftcollision");
		codeMap.put("Collision with bicycle", "bikecollision");
		codeMap.put("Collision with fixed object", "fixedobjcoll");
		codeMap.put("Collision with motor vehicle", "vehcollision");
		codeMap.put("Collision with other object", "otherobjcoll");
		codeMap.put("Collision with pedestrian", "pedcollision");
		codeMap.put("Collision with train or bus", "trainbuscoll");

		codeMap.put("Damadge in loading or unloading", "loadingdamage");
		codeMap.put("Fire", "fire");
		codeMap.put("Glass breakage", "glassbreakage");
		codeMap.put("Malicious mischief and vandalism", "vandalism");
		codeMap.put("Rare-end collision", "rearend");
		codeMap.put("Riot and civil commotion", "riotandcivil");
		codeMap.put("Rollover", "rollover");
		codeMap.put("Theft auto or other part", "theftparts");
		codeMap.put("Theft of entire vehicle", "theftentire");

	}

	/**
	 * Parses plain xml to Acord type xml
	 * 
	 * @param xml
	 * @return xml formatted in acord type
	 */
	public ACORDDocument parseXMLtoAcord(FnolJsonDTO fnolJsonDTO)
			throws Exception {

		ACORDDocument aCORDDocument = ACORDDocument.Factory.newInstance();
		ACORDType aCORDType = aCORDDocument.addNewACORD();
		ClaimsSvcRqType claimsSvcRqType = aCORDType.addNewClaimsSvcRq();
		claimsSvcRqType.setRqUID("623d2114-ac18-371d-6abf-a59f4b6f2edd");
		AssignedIdentifier assignedIdentifier = AssignedIdentifier.Factory
				.newInstance();
		assignedIdentifier.setId("ID021995");
		assignedIdentifier.setStringValue("Infogain");
		claimsSvcRqType.setSPName(assignedIdentifier);

		ClaimsNotificationAddRqType claimsNotificationAddRqType = claimsSvcRqType
				.addNewClaimsNotificationAddRq();
		claimsNotificationAddRqType
				.setRqUID("623d2114-ac18-371d-6abf-a59f4b6f2edd");
		OpenEnum curCd = claimsNotificationAddRqType.addNewCurCd();
		curCd.setId("usd");
		curCd.setStringValue(fnolJsonDTO.getPolicyDetails().getPolicyCurrency());
		DateTime datetime = DateTime.Factory.newInstance();
		datetime.setId("ID021996");
	
		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		java.util.Date now = new java.util.Date();
		String strDate = sdfDate.format(now);

		String strDate1 = strDate.replace(" ", "T");

		datetime.setStringValue(strDate1);
		claimsNotificationAddRqType.setTransactionRequestDt(datetime);

		// -----------------adding vehicle details---------------------
		AutoLossInfoType autoLossInfoType = claimsNotificationAddRqType.addNewAutoLossInfo();
		
		VehInfoType vehicleInfo = autoLossInfoType.addNewVehInfo();
		C10 licPlate = vehicleInfo.addNewLicensePlateNumber();
		licPlate.setStringValue(fnolJsonDTO.getVehicleInfoDTO()
				.getLicensePlate());
		C50 model = vehicleInfo.addNewModel();
		model.setStringValue(fnolJsonDTO.getVehicleInfoDTO().getModel());
		C50 make = vehicleInfo.addNewManufacturer();
		make.setStringValue(fnolJsonDTO.getVehicleInfoDTO().getMake());
		Long year = vehicleInfo.addNewModelYear();
		year.setStringValue(fnolJsonDTO.getVehicleInfoDTO().getYear());
		// C60 state = vehicleInfo.addNewRegistration().addNewStateProv();
		// state.setStringValue(fnolJsonDTO.getVehicleInfoDTO().getState());

		vehicleInfo.addNewRegistration().addNewStateProv();
		// -------------------------------------------------------------------

		// ----------------adding exposures&incident against a vehicle----------

		CoverageType coverageType = autoLossInfoType.addNewCoverage();

		Coverages coverages = coverageType.addNewCoverageCd();

		coverages.setStringValue("AUTO");

		coverageType.addNewCoverageDesc().setStringValue("PACollision");
		// --------------------------------------------------------------------

		// --------------adding policy details---------------------------
		PCPOLICY pcPOLICY = claimsNotificationAddRqType.addNewPolicy();

		C25 c25 = C25.Factory.newInstance();
		c25.setId("5656");
		c25.setStringValue(fnolJsonDTO.getPolicyDetails().getPolicyNumber());
		pcPOLICY.setPolicyNumber(c25);

		C4 c4 = C4.Factory.newInstance();
		c4.setId("ID023385");
		c4.setStringValue("01");
		pcPOLICY.setPolicyVersion(c4);
		LineOfBusiness lob = LineOfBusiness.Factory.newInstance();
		lob.setStringValue(fnolJsonDTO.getPolicyDetails().getLineOfBusiness());
		pcPOLICY.setLOBCd(lob);

		// ----------adding question&answer----------
		this.populateQuestionAnswer(fnolJsonDTO, pcPOLICY);
		// ------------------------------------------

		Date date1 = Date.Factory.newInstance();
		date1.setId("ID027259");
		date1.setStringValue(fnolJsonDTO.getLossDetailDTO()
				.getLossVehicleDate());

		Time time1 = Time.Factory.newInstance();
		time1.setId("ID027260");
		time1.setStringValue(fnolJsonDTO.getLossDetailDTO()
				.getLossVehicleTime());

		ClaimsOccurrenceType claimsOccurrenceType = claimsNotificationAddRqType
				.addNewClaimsOccurrence();

		// ------------adding insured or principal - Vikas(21.6.16)-----------
		InsuredOrPrincipalType insuredOrPrincipalType = claimsNotificationAddRqType
				.addNewInsuredOrPrincipal(); 
		GeneralPartyInfoType generalPartyInfoType = insuredOrPrincipalType
				.addNewGeneralPartyInfo();
		AddrType addrType = generalPartyInfoType.addNewAddr();
		C64 addr1 = addrType.addNewAddr1();
		addr1.setStringValue("addr1 abc");
		C64 addr2 = addrType.addNewAddr2();
		addr2.setStringValue("addr2 abc");
		C32 city = addrType.addNewCity();
		city.setStringValue("Noida");
		C60 country = addrType.addNewCountry();
		country.setStringValue("US");
		OpenEnum state = addrType.addNewStateProvCd();
		state.setStringValue("CA");

		Date effectiveDate = generalPartyInfoType.addNewEffectiveDt();
		effectiveDate.setStringValue("2015-07-12");

		NameInfoType infoType = generalPartyInfoType.addNewNameInfo();
		PersonNameType personNameType = infoType.addNewPersonName();
		C40 givenName = personNameType.addNewGivenName();
		givenName.setStringValue("Ray");
		C40 surname = personNameType.addNewSurname();
		surname.setStringValue("Newton");

		InsuredOrPrincipalInfoType insuredOrPrincipalInfoType = insuredOrPrincipalType
				.addNewInsuredOrPrincipalInfo();
		PrincipalInfoType principalInfoType = insuredOrPrincipalInfoType
				.addNewPrincipalInfo();
		FinancialStatementInfoType financialStatementInfoType = principalInfoType
				.addNewFinancialStatementInfo();
		CURRENCY cashAmt = financialStatementInfoType.addNewCashAmt();
		Decimal amt = cashAmt.addNewAmt();
		amt.setStringValue("5000");
		CURRENCY curLiability = financialStatementInfoType
				.addNewCurrentLiabilitiesAmt();
		Decimal liab = curLiability.addNewAmt();
		liab.setStringValue("4000");

		insuredOrPrincipalInfoType.addNewInsuredOrPrincipalRoleCd()
				.setStringValue("Insured");
		// ---------------------------------------------------

		// ----------------adding incidence and exposures--------------

	
		// -----------------------------------------------------------

		// code below sets reportedBy name coming from json(not geeting set in AcordFNOLMapper)-Vikas
		claimsOccurrenceType.setId(fnolJsonDTO.getLossDetailDTO()
				.getLossVehicleReportBy());

		ClaimsReportedType claimsReportedType = claimsOccurrenceType
				.addNewClaimsReported();

		claimsReportedType.setId("ID027256");
		claimsReportedType.setReportedByRef("ID027256");
		claimsReportedType.setReportedToRef("ID027256");

		DateTime claimsReportedDateTime = DateTime.Factory.newInstance();
		claimsReportedDateTime.setId("ID027257");

		claimsReportedDateTime.setStringValue(strDate1);

		AssignedIdentifier reportAssignedIdentifier = AssignedIdentifier.Factory
				.newInstance();
		reportAssignedIdentifier.setId("ID027258");
		reportAssignedIdentifier.setStringValue("12345");

		claimsReportedType.setReportedDt(claimsReportedDateTime);
		claimsReportedType.setReportNumber(reportAssignedIdentifier);

		claimsOccurrenceType.setLossDt(date1);
		claimsOccurrenceType.setLossTime(time1);

		AddrType lossLocAddr = claimsOccurrenceType.addNewAddr();

		C64 lossAddr1 = lossLocAddr.addNewAddr1();
		String lossvehloc = fnolJsonDTO.getLossDetailDTO().getLossVehicleLocation();
		String st = fnolJsonDTO.getVehicleInfoDTO().getState();
		if (lossvehloc == null && st == null) {
			lossAddr1.setStringValue(fnolJsonDTO.getLossDetailDTO()
					.getLossVehicleAddr());
		}else{
		lossAddr1.setStringValue(fnolJsonDTO.getLossDetailDTO()
				.getLossVehicleAddr()
				+ ","
				+ fnolJsonDTO.getLossDetailDTO().getLossVehicleLocation()
				+ ","
				+ fnolJsonDTO.getVehicleInfoDTO().getState());

		}
		// setting city& state detail manually--the code is generating exception
		// in guidewire but shows on UI
		// C32 lossCity = lossLocAddr.addNewCity();
		// lossCity.setStringValue("Noida2");
		// OpenEnum lossState = lossLocAddr.addNewStateProvCd();
		// lossState.setStringValue("CA");

		CInfinite incidentceDesc = claimsOccurrenceType.addNewIncidentDesc();
		incidentceDesc.setStringValue(fnolJsonDTO.getLossDetailDTO()
				.getLossVehicleIncidentDesc());

		C255 whereOccurred = claimsOccurrenceType.addNewWhereOccurredDesc();
		whereOccurred.setStringValue((String) codeMap.get(fnolJsonDTO
				.getLossDetailDTO().getWhereOccurredDesc()));

		CInfinite damageDesc = claimsOccurrenceType.addNewDamageDesc();
		damageDesc.setStringValue(fnolJsonDTO.getLossDetailDTO()
				.getDamageDesc());

		return aCORDDocument;

	}

	private PCPOLICY populateQuestionAnswer(FnolJsonDTO fnolJsonDTO,
			PCPOLICY pcPOLICY) {

		if (fnolJsonDTO.getQuestionnaire().getQuestionsList() == null || 
				fnolJsonDTO.getQuestionnaire().getQuestionsList().isEmpty()) {
			return pcPOLICY;
		}
		
		for (Question question : fnolJsonDTO.getQuestionnaire()
				.getQuestionsList()) {
			QuestionAnswerType questionAnswerType = pcPOLICY
					.addNewQuestionAnswer();
			
			C255 explanation = questionAnswerType.addNewExplanation();
			explanation.setStringValue(question.getQuestionParamName());

			Response yesNoCD = questionAnswerType.addNewYesNoCd();
			yesNoCD.setStringValue(question.getAnswer().trim().toUpperCase());

		}

		return null;
	}

}
