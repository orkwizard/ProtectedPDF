package sunset.it.tools.api.objects;

import java.io.Serializable;

public class Version implements Serializable {

	/*******
	 * 
	 * 	Version {
		DocumentId (string, optional),
		Document (Document, optional),
		Name (string, optional),
		InternalId (integer, optional),
		DocCode (string, optional),
		WebViewerType (string, optional),
		WebViewerVersion (integer, optional),
		WebViewerUrl (string, optional),
		DownloadUrl (string, optional),
		ProtectionPassword (string, optional),
		DoNotEncryptContents (boolean, optional),
		EncryptOnlyEmbeddedFiles (boolean, optional),
		UniqueDocCopyId (string, optional),
		SkipPages (string, optional),
		WebViewerEncryptionPassword (string, optional),
		RawFileName (string, optional),
		ProtectedFileName (string, optional),
		IsWebAccessibilityEnabled (boolean, optional),
		Id (string, optional),
		ExternalKey (string, optional),
		CreatedOn (string, optional),
		LastUpdatedOn (string, optional),
		Status (string, optional)
		}
	 * 
	 */
	private String DocumentId;
	private Document Document;
	private String Name;
	private int InternalId;
	private String DocCode;
	private String WebViewerType;
	private int WebViewerVersion;
	private String WebViewerUrl;
	private String DownloadUrl;
	private String ProtectionPassword;
	private boolean DoNotEncryptContents;
	private boolean EncryptOnlyEmbeddedFiles;
	private String UniqueDocCopyId;
	private String SkipPages;
	private String WebViewerEncryptionPassword;
	private String RawFileName;
	private String ProtectedFileName;
	private boolean IsWebAccessibilityEnabled;
	private String Id;
	private String ExternalKey;
	private String CreatedOn;
	private String LastUpdatedOn;
	private String Status;
	public String getDocumentId() {
		return DocumentId;
	}
	public void setDocumentId(String documentId) {
		DocumentId = documentId;
	}
	public Document getDocument() {
		return Document;
	}
	public void setDocument(Document document) {
		Document = document;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getInternalId() {
		return InternalId;
	}
	public void setInternalId(int internalId) {
		InternalId = internalId;
	}
	public String getDocCode() {
		return DocCode;
	}
	public void setDocCode(String docCode) {
		DocCode = docCode;
	}
	public String getWebViewerType() {
		return WebViewerType;
	}
	public void setWebViewerType(String webViewerType) {
		WebViewerType = webViewerType;
	}
	public int getWebViewerVersion() {
		return WebViewerVersion;
	}
	public void setWebViewerVersion(int webViewerVersion) {
		WebViewerVersion = webViewerVersion;
	}
	public String getWebViewerUrl() {
		return WebViewerUrl;
	}
	public void setWebViewerUrl(String webViewerUrl) {
		WebViewerUrl = webViewerUrl;
	}
	public String getDownloadUrl() {
		return DownloadUrl;
	}
	public void setDownloadUrl(String downloadUrl) {
		DownloadUrl = downloadUrl;
	}
	public String getProtectionPassword() {
		return ProtectionPassword;
	}
	public void setProtectionPassword(String protectionPassword) {
		ProtectionPassword = protectionPassword;
	}
	public boolean isDoNotEncryptContents() {
		return DoNotEncryptContents;
	}
	public void setDoNotEncryptContents(boolean doNotEncryptContents) {
		DoNotEncryptContents = doNotEncryptContents;
	}
	public boolean isEncryptOnlyEmbeddedFiles() {
		return EncryptOnlyEmbeddedFiles;
	}
	public void setEncryptOnlyEmbeddedFiles(boolean encryptOnlyEmbeddedFiles) {
		EncryptOnlyEmbeddedFiles = encryptOnlyEmbeddedFiles;
	}
	public String getUniqueDocCopyId() {
		return UniqueDocCopyId;
	}
	public void setUniqueDocCopyId(String uniqueDocCopyId) {
		UniqueDocCopyId = uniqueDocCopyId;
	}
	public String getSkipPages() {
		return SkipPages;
	}
	public void setSkipPages(String skipPages) {
		SkipPages = skipPages;
	}
	public String getWebViewerEncryptionPassword() {
		return WebViewerEncryptionPassword;
	}
	public void setWebViewerEncryptionPassword(String webViewerEncryptionPassword) {
		WebViewerEncryptionPassword = webViewerEncryptionPassword;
	}
	public String getRawFileName() {
		return RawFileName;
	}
	public void setRawFileName(String rawFileName) {
		RawFileName = rawFileName;
	}
	public String getProtectedFileName() {
		return ProtectedFileName;
	}
	public void setProtectedFileName(String protectedFileName) {
		ProtectedFileName = protectedFileName;
	}
	public boolean isIsWebAccessibilityEnabled() {
		return IsWebAccessibilityEnabled;
	}
	public void setIsWebAccessibilityEnabled(boolean isWebAccessibilityEnabled) {
		IsWebAccessibilityEnabled = isWebAccessibilityEnabled;
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
		return "Version [DocumentId=" + DocumentId + ", Document=" + Document + ", Name=" + Name + ", InternalId="
				+ InternalId + ", DocCode=" + DocCode + ", WebViewerType=" + WebViewerType + ", WebViewerVersion="
				+ WebViewerVersion + ", WebViewerUrl=" + WebViewerUrl + ", DownloadUrl=" + DownloadUrl
				+ ", ProtectionPassword=" + ProtectionPassword + ", DoNotEncryptContents=" + DoNotEncryptContents
				+ ", EncryptOnlyEmbeddedFiles=" + EncryptOnlyEmbeddedFiles + ", UniqueDocCopyId=" + UniqueDocCopyId
				+ ", SkipPages=" + SkipPages + ", WebViewerEncryptionPassword=" + WebViewerEncryptionPassword
				+ ", RawFileName=" + RawFileName + ", ProtectedFileName=" + ProtectedFileName
				+ ", IsWebAccessibilityEnabled=" + IsWebAccessibilityEnabled + ", Id=" + Id + ", ExternalKey="
				+ ExternalKey + ", CreatedOn=" + CreatedOn + ", LastUpdatedOn=" + LastUpdatedOn + ", Status=" + Status
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
