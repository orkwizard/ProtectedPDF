package sunset.it.tools.api.objects;

import java.io.Serializable;

public class Document  implements Serializable {

	/*
	 *  InternalId (integer, optional),
		Version (string, optional),
		VersionCount (integer, optional),
		MostRecentActiveVersionId (string, optional),
		EnableVersionNotification (boolean, optional),
		OptionFloatingLoginForm (boolean, optional),
		DocBaseUrl (string, optional),
		OptionDrmFlags (integer, optional),
		AccountId (string, optional),
		EipUrl (string, optional),
		FolderId (string, optional),
		FolderIdPath (string, optional),
		FileName (string, optional),
		Title (string, optional),
		YearCreated (integer, optional),
		PolicyId (string, optional),
		Policy (Policy, optional),
		WebViewerDocEncryptionEnabled (boolean, optional),
		AllowUserDefinedWebViewerEncryptionPassword (boolean, optional),
		WebViewerDisabled (boolean, optional),
		Id (string, optional),
		ExternalKey (string, optional),
		CreatedOn (string, optional),
		LastUpdatedOn (string, optional),
		Status (string, optional)
	 */
	
	private int InternalId;
	private String Version;
	private int VersionCount;
	private String MostRecentActiveVersionId;
	private boolean EnableVersionNotification;
	private boolean OptionFloatingLoginForm;
	private String DocBaseUrl;
	private int OptionDrmFlags;
	private String AccountId;
	private String EipUrl;
	private String FolderId;
	private String FolderIdPath;
	private String FileName;
	private String Title;
	private int YearCreated;
	private String PolicyId;
	private Policy Policy;
	private boolean WebViewerDocEncryptionEnabled;
	private boolean AllowUserDefinedWebViewerEncryptionPassword;
	private boolean WebViewerDisabled;
	private String Id;
	private String ExternalKey;
	private String CreatedOn;
	private String LastUpdatedOn;
	private String Status;
	public int getInternalId() {
		return InternalId;
	}
	public void setInternalId(int internalId) {
		InternalId = internalId;
	}
	public String getVersion() {
		return Version;
	}
	public void setVersion(String version) {
		Version = version;
	}
	public int getVersionCount() {
		return VersionCount;
	}
	public void setVersionCount(int versionCount) {
		VersionCount = versionCount;
	}
	public String getMostRecentActiveVersionId() {
		return MostRecentActiveVersionId;
	}
	public void setMostRecentActiveVersionId(String mostRecentActiveVersionId) {
		MostRecentActiveVersionId = mostRecentActiveVersionId;
	}
	public boolean isEnableVersionNotification() {
		return EnableVersionNotification;
	}
	public void setEnableVersionNotification(boolean enableVersionNotification) {
		EnableVersionNotification = enableVersionNotification;
	}
	public boolean isOptionFloatingLoginForm() {
		return OptionFloatingLoginForm;
	}
	public void setOptionFloatingLoginForm(boolean optionFloatingLoginForm) {
		OptionFloatingLoginForm = optionFloatingLoginForm;
	}
	public String getDocBaseUrl() {
		return DocBaseUrl;
	}
	public void setDocBaseUrl(String docBaseUrl) {
		DocBaseUrl = docBaseUrl;
	}
	public int getOptionDrmFlags() {
		return OptionDrmFlags;
	}
	public void setOptionDrmFlags(int optionDrmFlags) {
		OptionDrmFlags = optionDrmFlags;
	}
	public String getAccountId() {
		return AccountId;
	}
	public void setAccountId(String accountId) {
		AccountId = accountId;
	}
	public String getEipUrl() {
		return EipUrl;
	}
	public void setEipUrl(String eipUrl) {
		EipUrl = eipUrl;
	}
	public String getFolderId() {
		return FolderId;
	}
	public void setFolderId(String folderId) {
		FolderId = folderId;
	}
	public String getFolderIdPath() {
		return FolderIdPath;
	}
	public void setFolderIdPath(String folderIdPath) {
		FolderIdPath = folderIdPath;
	}
	public String getFileName() {
		return FileName;
	}
	public void setFileName(String fileName) {
		FileName = fileName;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public int getYearCreated() {
		return YearCreated;
	}
	public void setYearCreated(int yearCreated) {
		YearCreated = yearCreated;
	}
	public String getPolicyId() {
		return PolicyId;
	}
	public void setPolicyId(String policyId) {
		PolicyId = policyId;
	}
	public Policy getPolicy() {
		return Policy;
	}
	public void setPolicy(Policy policy) {
		Policy = policy;
	}
	public boolean isWebViewerDocEncryptionEnabled() {
		return WebViewerDocEncryptionEnabled;
	}
	public void setWebViewerDocEncryptionEnabled(boolean webViewerDocEncryptionEnabled) {
		WebViewerDocEncryptionEnabled = webViewerDocEncryptionEnabled;
	}
	public boolean isAllowUserDefinedWebViewerEncryptionPassword() {
		return AllowUserDefinedWebViewerEncryptionPassword;
	}
	public void setAllowUserDefinedWebViewerEncryptionPassword(boolean allowUserDefinedWebViewerEncryptionPassword) {
		AllowUserDefinedWebViewerEncryptionPassword = allowUserDefinedWebViewerEncryptionPassword;
	}
	public boolean isWebViewerDisabled() {
		return WebViewerDisabled;
	}
	public void setWebViewerDisabled(boolean webViewerDisabled) {
		WebViewerDisabled = webViewerDisabled;
	}
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
	public String getCreatedOn() {
		return CreatedOn;
	}
	public void setCreatedOn(String createdOn) {
		CreatedOn = createdOn;
	}
	public String getLastUpdatedOn() {
		return LastUpdatedOn;
	}
	public void setLastUpdatedOn(String lastUpdatedOn) {
		LastUpdatedOn = lastUpdatedOn;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	@Override
	public String toString() {
		return "Document [InternalId=" + InternalId + ", Version=" + Version + ", VersionCount=" + VersionCount
				+ ", MostRecentActiveVersionId=" + MostRecentActiveVersionId + ", EnableVersionNotification="
				+ EnableVersionNotification + ", OptionFloatingLoginForm=" + OptionFloatingLoginForm + ", DocBaseUrl="
				+ DocBaseUrl + ", OptionDrmFlags=" + OptionDrmFlags + ", AccountId=" + AccountId + ", EipUrl=" + EipUrl
				+ ", FolderId=" + FolderId + ", FolderIdPath=" + FolderIdPath + ", FileName=" + FileName + ", Title="
				+ Title + ", YearCreated=" + YearCreated + ", PolicyId=" + PolicyId + ", Policy=" + Policy
				+ ", WebViewerDocEncryptionEnabled=" + WebViewerDocEncryptionEnabled
				+ ", AllowUserDefinedWebViewerEncryptionPassword=" + AllowUserDefinedWebViewerEncryptionPassword
				+ ", WebViewerDisabled=" + WebViewerDisabled + ", Id=" + Id + ", ExternalKey=" + ExternalKey
				+ ", CreatedOn=" + CreatedOn + ", LastUpdatedOn=" + LastUpdatedOn + ", Status=" + Status + "]";
	}
	
	
	
	
}
