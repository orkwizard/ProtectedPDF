package sunset.it.tools.pojo;

import java.io.Serializable;
import java.util.Arrays;

public class Group implements Serializable {

	/*
	 * 
	 *  Group {
		Id (string, optional),
		Name (string, optional),
		IsActive (boolean, optional),
		IsGenerated (boolean, optional),
		Notes (string, optional),
		ReaderIds (Array[string], optional),
		Policy (ReaderPolicy, optional),
		ExternalKey (string, optional),
		CustomField (string, optional)
		}
	 */
	private String Id;
	private String Name;
	private boolean IsActive;
	private boolean IsGenerated;
	private String Notes;
	private String[] ReaderIds;
	private ReaderPolicy Policy;
	private String ExternalKey;
	private String CustomField;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public boolean isIsActive() {
		return IsActive;
	}
	public void setIsActive(boolean isActive) {
		IsActive = isActive;
	}
	public boolean isIsGenerated() {
		return IsGenerated;
	}
	public void setIsGenerated(boolean isGenerated) {
		IsGenerated = isGenerated;
	}
	public String getNotes() {
		return Notes;
	}
	public void setNotes(String notes) {
		Notes = notes;
	}
	public String[] getReaderIds() {
		return ReaderIds;
	}
	public void setReaderIds(String[] readerIds) {
		ReaderIds = readerIds;
	}
	public ReaderPolicy getPolicy() {
		return Policy;
	}
	public void setPolicy(ReaderPolicy policy) {
		Policy = policy;
	}
	public String getExternalKey() {
		return ExternalKey;
	}
	public void setExternalKey(String externalKey) {
		ExternalKey = externalKey;
	}
	public String getCustomField() {
		return CustomField;
	}
	public void setCustomField(String customField) {
		CustomField = customField;
	}
	@Override
	public String toString() {
		return "Group [Id=" + Id + ", Name=" + Name + ", IsActive=" + IsActive + ", IsGenerated=" + IsGenerated
				+ ", Notes=" + Notes + ", ReaderIds=" + Arrays.toString(ReaderIds) + ", Policy=" + Policy
				+ ", ExternalKey=" + ExternalKey + ", CustomField=" + CustomField + "]";
	}
	
	
	
	
}
