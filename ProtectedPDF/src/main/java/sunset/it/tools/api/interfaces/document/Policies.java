package sunset.it.tools.api.interfaces.document;

import java.util.ArrayList;

import sunset.it.tools.api.objects.Policy;

public interface Policies {

	public String deleteBulkPolicies(ArrayList<String> policyUniqueIds);
	public ArrayList<Policy> getPolicies(String page,String sort,String filter);
	public String addPolicy(Policy policy);
	public String deletePolicy(String id);
	public Policy getPolicy(String id);
	public String updatePolicy(String id,Policy policy);
}
