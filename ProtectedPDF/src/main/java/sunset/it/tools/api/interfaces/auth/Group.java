package sunset.it.tools.api.interfaces.auth;

import java.util.ArrayList;

public interface Group {

	public Group getGroup(String Id);
	public String deleteGroups(String[] groupUniqueIds);
	public ArrayList<Group> getGroups(String page,String sort,String filter);
	public String addGroup(sunset.it.tools.api.objects.Group group);
	public String deleteGroup(String Id);
	public String updateGroup(sunset.it.tools.api.objects.Group g,String id);
	public String removeReaders(String groupId,ArrayList<String> readersId);
	public String addReaders(String groupId,ArrayList<String> readersId);
	
	
}
