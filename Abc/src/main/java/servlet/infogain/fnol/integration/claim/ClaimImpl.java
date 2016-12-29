package servlet.infogain.fnol.integration.claim;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import noNamespace.ACORDDocument;
import servlet.guidewire.cc.typekey.ClaimState;
import servlet.guidewire.cc.ws.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.PCClaimSearchIntegrationAPI;
import servlet.guidewire.cc.ws.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.PCClaimSearchIntegrationAPIPortType;
import servlet.guidewire.cc.ws.gw.webservice.cc.cc801.claim.activityapi.activityapi.ActivityAPI;
import servlet.guidewire.cc.ws.gw.webservice.cc.cc801.claim.activityapi.activityapi.ActivityAPIPortType;
import servlet.guidewire.cc.ws.gw.webservice.cc.cc801.claim.claimapi.ClaimAPI;
import servlet.guidewire.cc.ws.gw.webservice.cc.cc801.claim.claimapi.ClaimAPIPortType;
import servlet.guidewire.cc.ws.gw.webservice.cc.cc801.dto.claimdto.ClaimDTO;
import servlet.guidewire.ws.soapheaders.TransactionId;
import servlet.infogain.fnol.model.FnolJsonDTO;
import servlet.infogain.fnol.transformation.AcordTransform;

import com.sun.xml.ws.api.message.Headers;
import com.sun.xml.ws.developer.WSBindingProvider;


public class ClaimImpl {

	public ClaimState getClaimStatus(String claimNo)throws Exception {
		ClaimState result;
		try {
			result = this.getClaimAPIPort().getClaimState(this.getClaimAPIPort().findPublicIDByClaimNumber(claimNo));		
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} 
		return result;
	}
	
	/*public ClaimDTO save(FnolJsonDTO fnolJSONDTO) {
		String errorMsg = null;
		String claimresult = null;
		ClaimDTO claimDTO = null;
		try {

			AcordTransform transform = new AcordTransform();
			ACORDDocument aCORDDocument = transform.parseXMLtoAcord(fnolJSONDTO);
			claimresult = this.getClaimAPIPort().importAcordClaimFromXML(aCORDDocument.toString());
			claimDTO = this.getClaimAPIPort().getDtoForClaim("cc:128");
		} catch (Exception ex) {
			errorMsg = ex.getMessage();
		}
		return claimDTO;
	}*/
	
	public String save(FnolJsonDTO fnolJSONDTO) {
		String errorMsg = null;
		String claimresult = null;
		try {

			AcordTransform transform = new AcordTransform();
			ACORDDocument aCORDDocument = transform.parseXMLtoAcord(fnolJSONDTO);
			claimresult = this.getClaimAPIPort().importAcordClaimFromXML(aCORDDocument.toString());
		} catch (Exception ex) {
			errorMsg = ex.getMessage();
		}
		return claimresult;
	}
	
	private PCClaimSearchIntegrationAPIPortType getPCClaimSearchIntegrationAPIPort() throws MalformedURLException {
		String claimURL = "http://115.112.147.13:8080/cc/ws/gw/webservice/cc/cc800/pcintegration/PCClaimSearchIntegrationAPI?WSDL";
		PCClaimSearchIntegrationAPI pcClaimSearchIntegrationAPI = new PCClaimSearchIntegrationAPI(new URL(claimURL));
		PCClaimSearchIntegrationAPIPortType claimSearchAPIPortType = pcClaimSearchIntegrationAPI.getPCClaimSearchIntegrationAPISoap11Port();
		BindingProvider bp = (BindingProvider) claimSearchAPIPortType;
		Map<String, Object> context = bp.getRequestContext();
		String username = "su";
		String password = "gw";
		context.put(javax.xml.ws.BindingProvider.USERNAME_PROPERTY,username);
		context.put(javax.xml.ws.BindingProvider.PASSWORD_PROPERTY,password);
		TransactionId transactionId = new TransactionId();
		Random generator = new Random();
		int rand = generator.nextInt(9999) + 10000;
		transactionId.setValue("" + rand);
		context.put("transaction_id", transactionId);
		WSBindingProvider bp1 = (WSBindingProvider) claimSearchAPIPortType;
		bp1.setOutboundHeaders(Headers.create(new QName("http://guidewire.com/ws/soapheaders", "transaction_id"),transactionId.getValue()));
		
		return claimSearchAPIPortType;
	}
	
	private ClaimAPIPortType getClaimAPIPort() throws MalformedURLException {
		String claimURL = "http://115.112.147.13:8080/cc/ws/gw/webservice/cc/cc801/claim/ClaimAPI?WSDL";
	    ClaimAPI claimAPI= new ClaimAPI(new URL(claimURL));
	    ClaimAPIPortType claimAPIPortType = claimAPI.getClaimAPISoap11Port();
		BindingProvider bp = (BindingProvider) claimAPIPortType;
		Map<String, Object> context = bp.getRequestContext();
		String username = "su";
		String password = "gw";
		context.put(javax.xml.ws.BindingProvider.USERNAME_PROPERTY, username);
		context.put(javax.xml.ws.BindingProvider.PASSWORD_PROPERTY, password);

		TransactionId transactionId = new TransactionId();
		Random generator = new Random();
		int rand = generator.nextInt(9999) + 10000 ;
		transactionId.setValue(""+rand);
		
		context.put("transaction_id", transactionId);
		
		WSBindingProvider bp1 = (WSBindingProvider)claimAPIPortType;
		bp1.setOutboundHeaders(Headers.create(new QName("http://guidewire.com/ws/soapheaders", "transaction_id"),transactionId.getValue()));
		
		return claimAPIPortType;
	}
	
	private ActivityAPIPortType getActivityAPI() throws Exception {
		String activityURL = "http://115.112.147.13:8080/cc/ws/gw/webservice/cc/cc801/claim/activityapi/ActivityAPI?WSDL";
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
		bp1.setOutboundHeaders(Headers.create(new QName("http://guidewire.com/ws/soapheaders", "transaction_id"),transactionId.getValue()));
		
		return activityAPIPortType;
	}
}
