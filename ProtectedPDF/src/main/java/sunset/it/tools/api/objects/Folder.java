package sunset.it.tools.api.objects;

import java.io.Serializable;

public class Folder implements Serializable{

	/*****
	 *  Folder {
		Id (string, optional),
		ExternalKey (string, optional),
		Name (string, optional),
		ParentFolderId (string, optional),
		HasSubFolder (boolean, optional),
		CustomField (string, optional)
		}
	 * 
	 * 
	 * 
	 */
	private String Id;
	private String ExternalKey;
	private String Name;
	private String ParentFolderId;
	private boolean HasSubFolder;
	private String CustomField;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getExternalKey() {
		return ExternalKey;
	}
	public void setExternalKey(String externalKey) {
		ExternalKey = externalKey;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getParentFolderId() {
		return ParentFolderId;
	}
	public void setParentFolderId(String parentFolderId) {
		ParentFolderId = parentFolderId;
	}
	public boolean isHasSubFolder() {
		return HasSubFolder;
	}
	public void setHasSubFolder(boolean hasSubFolder) {
		HasSubFolder = hasSubFolder;
	}
	public String getCustomField() {
		return CustomField;
	}
	public void setCustomField(String customField) {
		CustomField = customField;
	}
	@Override
	public String toString() {
		return "Folder [Id=" + Id + ", ExternalKey=" + ExternalKey + ", Name=" + Name + ", ParentFolderId="
				+ ParentFolderId + ", HasSubFolder=" + HasSubFolder + ", CustomField=" + CustomField + "]";
	}
	
	
	
}
