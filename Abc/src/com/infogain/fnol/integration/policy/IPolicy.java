package com.infogain.fnol.integration.policy;

import com.guidewire.pc.ws.gw.webservice.pc.pc800.ccintegration.ccpolicysearchintegration.SearchForPoliciesResponse;
import com.guidewire.pc.ws.gw.webservice.pc.pc800.ccintegration.ccpolicysearchintegration.RetrievePolicyResponse.Return;

public interface IPolicy {
	public Return retrievePolicy(String policyNumber)throws Exception;
	public SearchForPoliciesResponse.Return searchPolicy(String policyNumber)throws Exception;
}
