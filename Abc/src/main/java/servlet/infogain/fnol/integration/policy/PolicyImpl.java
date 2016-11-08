package main.java.servlet.infogain.fnol.integration.policy;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.BindingProvider;

import org.slf4j.Logger;
//import org.springframework.beans.factory.annotation.Autowired;

import main.java.servlet.guidewire.pc.ccintegration.CCPCFilteringCriteria;
import main.java.servlet.guidewire.pc.ccintegration.CCPCSearchCriteria;
import main.java.servlet.guidewire.pc.ws.gw.webservice.pc.pc800.ccintegration.ccpolicysearchintegration.CCPolicySearchIntegration;
import main.java.servlet.guidewire.pc.ws.gw.webservice.pc.pc800.ccintegration.ccpolicysearchintegration.CCPolicySearchIntegrationPortType;
import main.java.servlet.guidewire.pc.ws.gw.webservice.pc.pc800.ccintegration.ccpolicysearchintegration.RetrievePolicyResponse.Return;
import main.java.servlet.guidewire.pc.ws.gw.webservice.pc.pc800.ccintegration.ccpolicysearchintegration.SearchForPoliciesResponse;
//import com.infogain.fnol.core.FNOLLogger;
//import com.infogain.fnol.util.SampleJAXBconverter;

public class PolicyImpl implements IPolicy {

//	@Autowired
	Properties appProps;

//	@FNOLLogger
	Logger logger;

	@Override
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
			//gc.setTimeInMillis(currentDate.getTime());
			XMLGregorianCalendar xMLGregorianCalendar = df
					.newXMLGregorianCalendar(gc);
			
			
			
			/*Date currentDate = new Date();
			DatatypeFactory df = DatatypeFactory.newInstance();
			GregorianCalendar gc = new GregorianCalendar();
			gc.setTimeInMillis(currentDate.getTime());
			XMLGregorianCalendar xMLGregorianCalendar = df
					.newXMLGregorianCalendar(gc);*/
			
			
			result = this.getPCPort().retrievePolicy(
					policyNumber, xMLGregorianCalendar, ccPCFilteringCriteria);
		} catch (Exception ex) {
			logger.info("Exception in fetchPolicyDetail  " + ex.getMessage());
			throw ex;
		}
		return result;
	}
	
	
	@Override
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
			logger.info("Exception in fetchPolicyDetail  " + ex.getMessage());
			throw ex;
		}
		return result;
	}

	public Properties getAppProps() {
		return appProps;
	}

	public void setAppProps(Properties appProps) {
		this.appProps = appProps;
	}



	public void setLogger(Logger logger2) {
		this.logger=logger2;
	}
	
	private CCPolicySearchIntegrationPortType getPCPort() throws MalformedURLException{
		String policyURL = "http://115.112.147.13:8180/pc/ws/gw/webservice/pc/pc800/ccintegration/CCPolicySearchIntegration?WSDL";
		//	String policyURL = appProps.getProperty("policy.ws.url");
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
