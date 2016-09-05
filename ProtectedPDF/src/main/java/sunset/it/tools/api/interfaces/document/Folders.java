package sunset.it.tools.api.interfaces.document;

import java.io.File;
import java.util.ArrayList;

import sunset.it.tools.api.objects.Folder;

public interface Folders {

	public ArrayList<Folder> getFolders(String page,String sort,String filter);
	public String addFolder(Folder folder);
	public String deleteFolder(String id);
	public Folder getFolder(String id);
	public String updateFolder(String id,Folder folder);
	public File downloadFolder(String id);
}
