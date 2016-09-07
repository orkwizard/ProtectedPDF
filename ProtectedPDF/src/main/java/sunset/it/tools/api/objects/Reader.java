package sunset.it.tools.api.objects;

import java.io.Serializable;

public class Reader implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/***
	 *  Id (string, optional),
		Username (string, optional),
		Password (string, optional),
		PasswordEncrypted (boolean, optional),
		IsActive (boolean, optional),
		Notes (string, optional),
		Policy (ReaderPolicy, optional),
		ExternalKey (string, optional),
		CustomField (string, optional)
	 * 
	 * 
	 */
	
	private String Id;
	private String Username;
	private String Password;
	private String PasswordEncrypted;
	private boolean IsActive;
	private String Notes;
	private ReaderPolicy Policy;
	private String ExternalKey;
	private String CustomField;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getPasswordEncrypted() {
		return PasswordEncrypted;
	}
	public void setPasswordEncrypted(String passwordEncrypted) {
		PasswordEncrypted = passwordEncrypted;
	}
	public boolean isIsActive() {
		return IsActive;
	}
	public void setIsActive(boolean isActive) {
		IsActive = isActive;
	}
	public String getNotes() {
		return Notes;
	}
	public void setNotes(String notes) {
		Notes = notes;
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
		return "Reader [Id=" + Id + ", Username=" + Username + ", Password=" + Password + ", PasswordEncrypted="
				+ PasswordEncrypted + ", IsActive=" + IsActive + ", Notes=" + Notes + ", Policy=" + Policy.toString()
				+ ", ExternalKey=" + ExternalKey + ", CustomField=" + CustomField + "]";
	}
	
	
	
	
}
