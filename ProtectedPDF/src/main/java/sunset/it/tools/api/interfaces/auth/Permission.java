package sunset.it.tools.api.interfaces.auth;

import java.util.ArrayList;

public interface Permission {
	public String deletePermissions(ArrayList<String> accessPolicyUniqueIds);
	public String deleteDocPermissions(String docId);
	public String deleteFolderPermissions(String folderId);
	public String deleteReaderPermissions(String readId);
	public String deleteGroupPermissions(String groupId);
	public ArrayList<sunset.it.tools.api.objects.Permission> getPermissions(String page,String sort,String filter);
	public String addPermission(sunset.it.tools.api.objects.Permission aPermission);
	public String delPermission(String id);
	public sunset.it.tools.api.objects.Permission getPermission(String id);
	public String updatePermission(String id,sunset.it.tools.api.objects.Permission permission);
}
