package sunset.it.tools.api.interfaces;

import java.util.ArrayList;

public interface Permission {
	public String deletePermissions(ArrayList<String> accessPolicyUniqueIds);
	public String deleteDocPermissions(String docId);
	public String deleteFolderPermissions(String folderId);
	public String deleteReaderPermissions(String readId);
	public String deleteGroupPermissions(String groupId);
	public ArrayList<sunset.it.tools.pojo.Permission> getPermissions(String page,String sort,String filter);
	public String addPermission(sunset.it.tools.pojo.Permission aPermission);
	public String delPermission(String id);
	public sunset.it.tools.pojo.Permission getPermission(String id);
	public String updatePermission(String id,sunset.it.tools.pojo.Permission permission);
}
