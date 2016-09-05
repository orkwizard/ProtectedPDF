package sunset.it.tools.api.interfaces.auth;

import java.util.ArrayList;

public interface Activity {

	public String getActivityExport(String page,String sort,String filter);
	public ArrayList<sunset.it.tools.api.objects.Activity> getActivities();
	public String addActivity(sunset.it.tools.api.objects.Activity aActivity);
	public String deleteActivity(String Id);
	public sunset.it.tools.api.objects.Activity getActivity(String Id);
}
