package sunset.it.tools.api.objects;

import java.io.Serializable;

public class Form implements Serializable{

	/*****
	 *  Id (string, optional),
		InternalId (integer, optional),
		ExternalKey (string, optional),
		CustomerId (string, optional),
		IsPrivate (boolean, optional),
		Name (string, optional),
		CustomField (string, optional)
	 * 
	 * 
	 */
	
	private String Id;
	private int InternalId;
	private String ExternalKey;
	private String CustomerId;
	private boolean IsPrivate;
	private String Name;
	private String CustomField;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public int getInternalId() {
		return InternalId;
	}
	public void setInternalId(int internalId) {
		InternalId = internalId;
	}
	public String getExternalKey() {
		return ExternalKey;
	}
	public void setExternalKey(String externalKey) {
		ExternalKey = externalKey;
	}
	public String getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(String customerId) {
		CustomerId = customerId;
	}
	public boolean isIsPrivate() {
		return IsPrivate;
	}
	public void setIsPrivate(boolean isPrivate) {
		IsPrivate = isPrivate;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCustomField() {
		return CustomField;
	}
	public void setCustomField(String customField) {
		CustomField = customField;
	}
	@Override
	public String toString() {
		return "Form [Id=" + Id + ", InternalId=" + InternalId + ", ExternalKey=" + ExternalKey + ", CustomerId="
				+ CustomerId + ", IsPrivate=" + IsPrivate + ", Name=" + Name + ", CustomField=" + CustomField + "]";
	}
	
	
	
	
}
