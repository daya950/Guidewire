package servlet.infogain.fnol.integration.policy;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.BindingProvider;


import servlet.guidewire.pc.ccintegration.CCPCFilteringCriteria;
import servlet.guidewire.pc.ccintegration.CCPCSearchCriteria;
import servlet.guidewire.pc.ws.gw.webservice.pc.pc800.ccintegration.ccpolicysearchintegration.CCPolicySearchIntegration;
import servlet.guidewire.pc.ws.gw.webservice.pc.pc800.ccintegration.ccpolicysearchintegration.CCPolicySearchIntegrationPortType;
import servlet.guidewire.pc.ws.gw.webservice.pc.pc800.ccintegration.ccpolicysearchintegration.RetrievePolicyResponse.Return;
import servlet.guidewire.pc.ws.gw.webservice.pc.pc800.ccintegration.ccpolicysearchintegration.SearchForPoliciesResponse;

public class PolicyImpl {


	public Return retrievePolicy(String policyNumber)throws Exception {
		
		Map<String, String> map1 = new HashMap<String, String>();
		Return result = null;
		try {
			CCPCFilteringCriteria ccPCFilteringCriteria = new CCPCFilteringCriteria();

			SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		    Date now = new Date();
		    String strDate = sdfDate.format(now);

			DatatypeFactory df = DatatypeFactory.newInstance();
			GregorianCalendar gc = new GregorianCalendar();
			XMLGregorianCalendar xMLGregorianCalendar = df.newXMLGregorianCalendar(gc);
			result = this.getPCPort().retrievePolicy(
					policyNumber, xMLGregorianCalendar, ccPCFilteringCriteria);
		} catch (Exception ex) {
			throw ex;
		}
		return result;
	}
	
	public SearchForPoliciesResponse.Return searchPolicy(String policyNumber)throws Exception {
		
		Map<String, String> map1 = new HashMap<String, String>();
		SearchForPoliciesResponse.Return result = null;
		try {
			CCPCFilteringCriteria ccPCFilteringCriteria = new CCPCFilteringCriteria();
			Date currentDate = new Date();
			DatatypeFactory df = DatatypeFactory.newInstance();
			GregorianCalendar gc = new GregorianCalendar();
			gc.setTimeInMillis(currentDate.getTime());
			XMLGregorianCalendar xMLGregorianCalendar = df
					.newXMLGregorianCalendar(gc);
			CCPCSearchCriteria ccPCSearchCriteria = new CCPCSearchCriteria();
			
			ccPCSearchCriteria.setPolicyNumber(policyNumber);
			ccPCSearchCriteria.setIncludeArchived(Boolean.FALSE);
			
			result = this.getPCPort().searchForPolicies(
					ccPCSearchCriteria, ccPCFilteringCriteria);
		} catch (Exception ex) {
			throw ex;
		}
		return result;
	}
	
	private CCPolicySearchIntegrationPortType getPCPort() throws MalformedURLException{
		String policyURL = "http://115.112.147.13:8180/pc/ws/gw/webservice/pc/pc800/ccintegration/CCPolicySearchIntegration?WSDL";
			CCPolicySearchIntegration ccPolicySearchIntegration = new CCPolicySearchIntegration(
					new URL(policyURL));
			CCPolicySearchIntegrationPortType ccPolicySearchIntegrationSoap11PortType = ccPolicySearchIntegration
					.getCCPolicySearchIntegrationSoap11Port();
			BindingProvider bp = (BindingProvider) ccPolicySearchIntegrationSoap11PortType;
			Map<String, Object> context = bp.getRequestContext();
			String username = "su";
			String password = "gw";
			context.put(javax.xml.ws.BindingProvider.USERNAME_PROPERTY, username);
			context.put(javax.xml.ws.BindingProvider.PASSWORD_PROPERTY, password);
			
			return ccPolicySearchIntegrationSoap11PortType;
	}
}
