package com.infogain.fnol.integration.claim;

import java.util.List;

import com.guidewire.cc.ws.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.SearchForClaimsResponse.Return;
import com.guidewire.cc.ws.gw.webservice.cc.cc800.pcintegration.pcentities.pcclaimdetail.PCClaimDetail;
import com.guidewire.cc.ws.gw.webservice.cc.cc801.claim.activityapi.activitydtonotification.ActivityDTONotification;
import com.guidewire.cc.ws.gw.webservice.cc.cc801.dto.activitydto.ActivityDTO;
import com.guidewire.cc.ws.gw.webservice.cc.cc801.dto.claimdto.ClaimDTO;
import com.guidewire.cc.ws.gw.webservice.cc.cc801.dto.claiminfodto.ClaimInfoDTO;
import com.guidewire.cc.ws.gw.webservice.cc.cc801.dto.documentdto.DocumentDTO;
import com.guidewire.cc.ws.gw.webservice.cc.cc801.dto.exposuredto.ExposureDTO;
import com.guidewire.cc.ws.gw.webservice.cc.cc801.dto.notedto.NoteDTO;

public interface IClaim {
	public String importAcordClaimFromXML(String xml)throws Exception;
	public Return searchForClaims(String policyNumber)throws Exception;
	public PCClaimDetail getClaimByClaimNumber(String claimNumber)throws Exception;
	public ClaimDTO getDtoForClaim(String claimId)throws Exception;
	public String createDocument(DocumentDTO documentDTO)throws Exception;
	public String createJournal(NoteDTO noteDTO)throws Exception;
	public String createActivity(ActivityDTO activityDTO)throws Exception;
	public List<ActivityDTO> getActivityByClaimID(String claimId)throws Exception;
	public ExposureDTO getDtoForExposure(String exposureId)throws Exception;
	public boolean isFlagged(String claimId)throws Exception;
	public List<ActivityDTONotification> getNotifications(String PolicyNo)throws Exception;
	public boolean updateSeenNotification(String activityId)throws Exception;
}
