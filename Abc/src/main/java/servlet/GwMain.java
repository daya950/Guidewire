package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import servlet.guidewire.cc.typekey.ClaimState;
import servlet.guidewire.pc.ws.gw.webservice.pc.pc800.ccintegration.ccpolicysearchintegration.RetrievePolicyResponse.Return;
import servlet.infogain.fnol.integration.claim.ClaimImpl;
import servlet.infogain.fnol.integration.policy.PolicyImpl;
import servlet.infogain.fnol.model.FnolJsonDTO;
import servlet.infogain.fnol.model.LossDetailDTO;
import servlet.guidewire.cc.ws.gw.webservice.cc.cc801.dto.claimdto.ClaimDTO;
import servlet.infogain.fnol.model.Policy;
import servlet.infogain.fnol.model.Question;
import servlet.infogain.fnol.model.Questionnaire;
import servlet.infogain.fnol.model.VehicleInfoDTO;


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
		Return result = null;
		JSONObject json = new JSONObject();
		String service = request.getParameter("service");
		if ((service).equals("ccgw")) {
			try {
				ClaimImpl ws = new ClaimImpl();
				FnolJsonDTO fnoljsondto = new FnolJsonDTO();

				Questionnaire ques = new Questionnaire();
				Question que = new Question();
				List<Question> queList = new ArrayList<Question>();

				VehicleInfoDTO vehDTO = new VehicleInfoDTO();
				vehDTO.setMake("Audi");
				vehDTO.setModel("A4");
				vehDTO.setVin("1");
				vehDTO.setCity("21212");
				vehDTO.setState("21212");

				Policy policy = new Policy();
			    	policy.setPolicyNumber(request.getParameter("id"));
		    		policy.setPolicyCurrency("usd");
			    	policy.setLineOfBusiness("AUTO");

			    	LossDetailDTO lossDetailDto = new LossDetailDTO();
			    	lossDetailDto.setLossVehicleDate("2016-06-16");
				lossDetailDto.setLossVehicleTime("02:12:00");
			    	lossDetailDto.setWhereOccurredDesc("Collision while turning left");
			    	lossDetailDto.setLossVehicleLocation("1212");
			    	lossDetailDto.setLossVehicleReportBy("1212");
			    	lossDetailDto.setLossVehicleIncidentDesc("21212121");

				que.setQuestionParamName("vehicleAge10Years");
				que.setText("Vehicle Ten Years Old?");
				que.setID("0000012");
				que.setQuestionScoreID("1000018441");
				que.setAnswer("YES");
				que.setScore("15");
				queList.add(que);

				que.setQuestionParamName("vehicleAge5Years");
				que.setText("Vehicle Five Years Old?");
				que.setID("0000012");
				que.setQuestionScoreID("1000018441");
				que.setAnswer("YES");
				que.setScore("10");
				queList.add(que);

				que.setQuestionParamName("airbagsDeployed");
				que.setText("Whether or not airbags deployed?");
				que.setID("0000012");
				que.setQuestionScoreID("1000018441");
				que.setAnswer("YES");
				que.setScore("10");
				queList.add(que);

				que.setQuestionParamName("vehicleSubmerged");
				que.setText("Vehicle Fully Submerged?");
				que.setID("0000012");
				que.setQuestionScoreID("1000018441");
				que.setAnswer("YES");
				que.setScore("25");
				queList.add(que);

				que.setQuestionParamName("waterLevelDash");
				que.setText("Water Level Reach Dash?");
				que.setID("0000012");
				que.setQuestionScoreID("1000018441");
				que.setAnswer("YES");
				que.setScore("20");
				queList.add(que);

				que.setQuestionParamName("mileage100K");
				que.setText("Mileage over 100K?");
				que.setID("0000012");
				que.setQuestionScoreID("1000018441");
				que.setAnswer("YES");
				que.setScore("10");
				queList.add(que);

				que.setQuestionParamName("extrication");
				que.setText("Extrication Required?");
				que.setID("0000012");
				que.setQuestionScoreID("1000018441");
				que.setAnswer("YES");
				que.setScore("25");
				queList.add(que);

				que.setQuestionParamName("vehicleRollOver");
				que.setText("Vehicle Roll Over?");
				que.setID("0000012");
				que.setQuestionScoreID("1000018441");
				que.setAnswer("YES");
				que.setScore("15");
				queList.add(que);

				que.setQuestionParamName("fireBurnDash");
				que.setText("Fire Burn the Dash?");
				que.setID("0000012");
				que.setQuestionScoreID("1000018441");
				que.setAnswer("YES");
				que.setScore("15");
				queList.add(que);

				que.setQuestionParamName("fireBurnEngine");
				que.setText("Fire Burn the Engine?");
				que.setID("0000012");
				que.setQuestionScoreID("1000018441");
				que.setAnswer("YES");
				que.setScore("15");
				queList.add(que);

				que.setQuestionParamName("floodSaltWater");
				que.setText("Flood Occur Salt Water?");
				que.setID("0000012");
				que.setQuestionScoreID("1000018441");
				que.setAnswer("YES");
				que.setScore("15");
				queList.add(que);

				que.setQuestionParamName("waterLevelDash");
				que.setText("Water Level Reach Seats?");
				que.setID("0000012");
				que.setQuestionScoreID("1000018441");
				que.setAnswer("YES");
				que.setScore("10");
				queList.add(que);

				que.setQuestionParamName("componentsMissing");
				que.setText("Major Components Missing?");
				que.setID("0000012");
				que.setQuestionScoreID("1000018441");
				que.setAnswer("YES");
				que.setScore("10");
				queList.add(que);

				que.setQuestionParamName("interiorMissing");
				que.setText("Any Of The Interior Missing?");
				que.setID("0000012");
				que.setQuestionScoreID("1000018441");
				que.setAnswer("YES");
				que.setScore("10");
				queList.add(que);

				que.setQuestionParamName("airbagsMissing");
				que.setText("Airbags Missing?");
				que.setID("0000012");
				que.setQuestionScoreID("1000018441");
				que.setAnswer("YES");
				que.setScore("10");
				queList.add(que);

				que.setQuestionParamName("isVehicleTowed");
				que.setText("Was the vehicle towed from the scene?(Fetching from enhancement. Leave for now.)");
				que.setID("0000012");
				que.setQuestionScoreID("1000018441");
				que.setAnswer("YES");
				que.setScore("0");
				queList.add(que);

				ques.setEvaluationVersion("1.0");
				ques.setQuestionsList(queList);

				fnoljsondto.setPolicyDetails(policy);	
				fnoljsondto.setQuestionnaire(ques);
				fnoljsondto.setVehicleInfoDTO(vehDTO);
				fnoljsondto.setLossDetailDTO(lossDetailDto);

				ClaimDTO objClaimDTO = ws.getClaimDetail("cc:149");
				json.put("claimNo", objClaimDTO.getClaimNumber());
				//out.print(ws.save(fnoljsondto));
			} catch(Exception ex){
				out.print(ex.getMessage());                   
			}
		} else if ((service).equals("cc")) {
			try {
				ClaimImpl ws = new ClaimImpl();
				ClaimState cs = ws.getClaimStatus(request.getParameter("id"));
				json.put("status", cs.value());
				out.print(json);
			} catch (Exception e) {
				out.print(e.getMessage());        
				e.printStackTrace();
			} 
		} else {
			try {
				PolicyImpl ws = new PolicyImpl();
				result = ws.retrievePolicy(request.getParameter("id"));
				
				if(result != null && result.getEnvelope() != null && result.getEnvelope().getCCPolicy() != null) {                                           
					//List<CCPolicyCoverage> coverages = result.getEnvelope().getCCPolicy().getCoverages();
					
					json.put("agent", result.getEnvelope().getCCPolicy().getAgent());
					json.put("doingBusinessAs", result.getEnvelope().getCCPolicy().getDoingBusinessAs());
					json.put("insured", result.getEnvelope().getCCPolicy().getInsured());
					json.put("policyHolder", result.getEnvelope().getCCPolicy().getPolicyHolder());
					json.put("underwriter", result.getEnvelope().getCCPolicy().getUnderwriter());
					json.put("account", result.getEnvelope().getCCPolicy().getAccount());
					json.put("cancellationDate", result.getEnvelope().getCCPolicy().getCancellationDate());
					json.put("coverageForm", result.getEnvelope().getCCPolicy().getCoverageForm());
					json.put("currency", result.getEnvelope().getCCPolicy().getCurrency());
					json.put("customerServiceTier", result.getEnvelope().getCCPolicy().getCustomerServiceTier());
					json.put("effectiveDate", result.getEnvelope().getCCPolicy().getEffectiveDate());
					json.put("expirationDate", result.getEnvelope().getCCPolicy().getExpirationDate());
					json.put("financialInterests", result.getEnvelope().getCCPolicy().getFinancialInterests());
					json.put("foreignCoverage", result.getEnvelope().getCCPolicy().isForeignCoverage());
					json.put("insuredSICCode", result.getEnvelope().getCCPolicy().getInsuredSICCode());
					json.put("notes", result.getEnvelope().getCCPolicy().getNotes());
					json.put("originalEffectiveDate", result.getEnvelope().getCCPolicy().getOriginalEffectiveDate());
					json.put("otherInsurance", result.getEnvelope().getCCPolicy().isOtherInsurance());
					json.put("otherInsuranceInfo", result.getEnvelope().getCCPolicy().getOtherInsuranceInfo());
					json.put("participation", result.getEnvelope().getCCPolicy().getParticipation());
					json.put("policyNumber", result.getEnvelope().getCCPolicy().getPolicyNumber());
					json.put("policyRatingPlan", result.getEnvelope().getCCPolicy().getPolicyRatingPlan());
					json.put("policySource", result.getEnvelope().getCCPolicy().getPolicySource());
					json.put("policySuffix", result.getEnvelope().getCCPolicy().getPolicySuffix());
					json.put("policySystemPeriodID", result.getEnvelope().getCCPolicy().getPolicySystemPeriodID());
					json.put("policyType", result.getEnvelope().getCCPolicy().getPolicyType());
					json.put("producerCode", result.getEnvelope().getCCPolicy().getProducerCode());
					json.put("reportingDate", result.getEnvelope().getCCPolicy().getReportingDate());
					json.put("retroactiveDate", result.getEnvelope().getCCPolicy().getRetroactiveDate());
					json.put("returnToWorkPrgm", result.getEnvelope().getCCPolicy().isReturnToWorkPrgm());
					json.put("status", result.getEnvelope().getCCPolicy().getStatus());
					json.put("totalProperties", result.getEnvelope().getCCPolicy().getTotalProperties());
					json.put("totalVehicles", result.getEnvelope().getCCPolicy().getTotalVehicles());
					json.put("underwritingCo", result.getEnvelope().getCCPolicy().getUnderwritingCo());
					json.put("underwritingGroup", result.getEnvelope().getCCPolicy().getUnderwritingGroup());
					json.put("WCOtherStates", result.getEnvelope().getCCPolicy().getWCOtherStates());
					json.put("WCStates", result.getEnvelope().getCCPolicy().getWCStates());
					out.print(json);
				}          
			} catch(Exception ex){
				out.print(ex.getMessage());                   
			}
		}
	}

}
