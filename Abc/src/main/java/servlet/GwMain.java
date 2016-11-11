package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//import org.slf4j.Logger;


import org.json.JSONObject;

import servlet.infogain.fnol.integration.policy.IPolicy;
import servlet.infogain.fnol.integration.policy.PolicyImpl;
import servlet.guidewire.pc.ccintegration.CCPolicyCoverage;
import servlet.guidewire.pc.ws.gw.webservice.pc.pc800.ccintegration.ccpolicysearchintegration.RetrievePolicyResponse.Return;


/**
 * Servlet implementation class GwMain
 */
@WebServlet(name = "main",urlPatterns = {"/"})
public class GwMain extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GwMain() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		Map<String,Object> map1 = null;
		Return result = null;
		try {
			IPolicy ws = new PolicyImpl();
			//((PolicyImpl)ws).setAppProps(appProps);
			//((PolicyImpl)ws).setLogger(logger);
			result = ws.retrievePolicy(request.getParameter("policyId"));

			if(result != null && result.getEnvelope() != null && result.getEnvelope().getCCPolicy() != null) {
				map1 = new HashMap<String,Object>();                                             
				//CCPerson insured = (CCPerson)result.getEnvelope().getCCPolicy().getInsured();                             
				List<CCPolicyCoverage> coverages = result.getEnvelope().getCCPolicy().getCoverages();
				
				map1.put("PolicyNumber", result.getEnvelope().getCCPolicy().getPolicyNumber());
				map1.put("PolicyCurrency", result.getEnvelope().getCCPolicy().getCurrency());
				map1.put("lineOfBusiness", result.getEnvelope().getCCPolicy().getPolicyType());
				map1.put("EffectiveDate", result.getEnvelope().getCCPolicy().getEffectiveDate());
				map1.put("ExpiryDate", result.getEnvelope().getCCPolicy().getExpirationDate());
				map1.put("policyCoverage", coverages);
				JSONObject json = new JSONObject();
			    json.put("PolicyNumber", result.getEnvelope().getCCPolicy().getPolicyNumber());
			    json.put("PolicyCurrency", result.getEnvelope().getCCPolicy().getCurrency());
				json.put("lineOfBusiness", result.getEnvelope().getCCPolicy().getPolicyType());
				json.put("EffectiveDate", result.getEnvelope().getCCPolicy().getEffectiveDate());
				json.put("ExpiryDate", result.getEnvelope().getCCPolicy().getExpirationDate());
				json.put("policyCoverage", coverages);
				out.print(json);
			}          
		} catch(Exception ex){
			out.print(ex.getMessage());                   
		}
	}

}
