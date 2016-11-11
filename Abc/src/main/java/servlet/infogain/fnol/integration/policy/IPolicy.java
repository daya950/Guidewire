package servlet.infogain.fnol.integration.policy;

import servlet.guidewire.pc.ws.gw.webservice.pc.pc800.ccintegration.ccpolicysearchintegration.RetrievePolicyResponse.Return;
import servlet.guidewire.pc.ws.gw.webservice.pc.pc800.ccintegration.ccpolicysearchintegration.SearchForPoliciesResponse;

public interface IPolicy {
	public Return retrievePolicy(String policyNumber)throws Exception;
	public SearchForPoliciesResponse.Return searchPolicy(String policyNumber)throws Exception;
}
