package main.java.servlet.infogain.fnol.integration.policy;

import main.java.servlet.guidewire.pc.ws.gw.webservice.pc.pc800.ccintegration.ccpolicysearchintegration.SearchForPoliciesResponse;
import main.java.servlet.guidewire.pc.ws.gw.webservice.pc.pc800.ccintegration.ccpolicysearchintegration.RetrievePolicyResponse.Return;

public interface IPolicy {
	public Return retrievePolicy(String policyNumber)throws Exception;
	public SearchForPoliciesResponse.Return searchPolicy(String policyNumber)throws Exception;
}
