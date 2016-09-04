package sunset.it.tools.api.interfaces;

import java.util.ArrayList;

public interface Activity {

	public String getActivityExport(String page,String sort,String filter);
	public ArrayList<sunset.it.tools.pojo.Activity> getActivities();
	public String addActivity(sunset.it.tools.pojo.Activity aActivity);
	public String deleteActivity(String Id);
	public sunset.it.tools.pojo.Activity getActivity(String Id);
}
