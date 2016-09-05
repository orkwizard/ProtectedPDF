package sunset.it.tools.api.objects;

import java.io.Serializable;

public class Permission implements Serializable{

		/*
		 *  Permission {
			Id (string, optional),
			FolderId (string, optional),
			DocId (string, optional),
			VersionId (string, optional),
			DocCode (string, optional),
			GroupId (string, optional),
			Group (Group, optional),
			IsGroupPermission (boolean, optional),
			ReaderId (string, optional),
			Reader (Reader, optional),
			Notes (string, optional),
			AccessPolicyId (string, optional),
			AccessPolicy (AccessPolicy, optional),
			CustomField (string, optional)
			}
		 * 
		 */
	private String Id;
	private String FolderId;
	private String DocId;
	private String VersionId;
	private String DocCode;
	private String GroupId;
	private Group Group;
	private boolean IsGroupPermission;
	private String ReaderId;
	private Reader Reader;
	private String Notes;
	private String AccessPolicyId;
	private AccessPolicy  AccessPolicy;
	private String CustomField;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getFolderId() {
		return FolderId;
	}
	public void setFolderId(String folderId) {
		FolderId = folderId;
	}
	public String getDocId() {
		return DocId;
	}
	public void setDocId(String docId) {
		DocId = docId;
	}
	public String getVersionId() {
		return VersionId;
	}
	public void setVersionId(String versionId) {
		VersionId = versionId;
	}
	public String getDocCode() {
		return DocCode;
	}
	public void setDocCode(String docCode) {
		DocCode = docCode;
	}
	public String getGroupId() {
		return GroupId;
	}
	public void setGroupId(String groupId) {
		GroupId = groupId;
	}
	public Group getGroup() {
		return Group;
	}
	public void setGroup(Group group) {
		Group = group;
	}
	public boolean isIsGroupPermission() {
		return IsGroupPermission;
	}
	public void setIsGroupPermission(boolean isGroupPermission) {
		IsGroupPermission = isGroupPermission;
	}
	public String getReaderId() {
		return ReaderId;
	}
	public void setReaderId(String readerId) {
		ReaderId = readerId;
	}
	public Reader getReader() {
		return Reader;
	}
	public void setReader(Reader reader) {
		Reader = reader;
	}
	public String getNotes() {
		return Notes;
	}
	public void setNotes(String notes) {
		Notes = notes;
	}
	public String getAccessPolicyId() {
		return AccessPolicyId;
	}
	public void setAccessPolicyId(String accessPolicyId) {
		AccessPolicyId = accessPolicyId;
	}
	public AccessPolicy getAccessPolicy() {
		return AccessPolicy;
	}
	public void setAccessPolicy(AccessPolicy accessPolicy) {
		AccessPolicy = accessPolicy;
	}
	public String getCustomField() {
		return CustomField;
	}
	public void setCustomField(String customField) {
		CustomField = customField;
	}
	@Override
	public String toString() {
		return "Permission [Id=" + Id + ", FolderId=" + FolderId + ", DocId=" + DocId + ", VersionId=" + VersionId
				+ ", DocCode=" + DocCode + ", GroupId=" + GroupId + ", Group=" + Group + ", IsGroupPermission="
				+ IsGroupPermission + ", ReaderId=" + ReaderId + ", Reader=" + Reader + ", Notes=" + Notes
				+ ", AccessPolicyId=" + AccessPolicyId + ", AccessPolicy=" + AccessPolicy + ", CustomField="
				+ CustomField + "]";
	}
	
	
	
	
}
