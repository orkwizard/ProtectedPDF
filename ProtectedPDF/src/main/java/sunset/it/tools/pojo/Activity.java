package sunset.it.tools.pojo;

import java.io.Serializable;

public class Activity implements Serializable {
	
	private String Id;
	private String ActivityDate;
	private boolean IsSuccess;
	private String Description;
	private String DocId;
	private String VersionId;
	private String VersionName;
	private String DocCode;
	private String Filename;
	private String DocTitle;
	private String SessionId;
	private String RemoteUnlockCode;
	private String ReaderId;
	private String ReaderName;
	private String IpAddress;
	private String CountryCode;
	private String ComputerId;
	private String ServerUrl;
	private String Message;
	private String Url;
	private int OfflineDays;
	private String OfflineDaysDescription;
	private String WatermarkContent;
	private boolean IsIgnored;
	private String AnalyticsSessionId;
	private String CustomField;
	private String Type;
	private String ClientAppName;
	private String ClientAppVersion;
	private String ClientLanguage;
	private String ClientOperatingSystem;
	private String ClientDeviceName;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getActivityDate() {
		return ActivityDate;
	}
	public void setActivityDate(String activityDate) {
		ActivityDate = activityDate;
	}
	public boolean isIsSuccess() {
		return IsSuccess;
	}
	public void setIsSuccess(boolean isSuccess) {
		IsSuccess = isSuccess;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
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
	public String getVersionName() {
		return VersionName;
	}
	public void setVersionName(String versionName) {
		VersionName = versionName;
	}
	public String getDocCode() {
		return DocCode;
	}
	public void setDocCode(String docCode) {
		DocCode = docCode;
	}
	public String getFilename() {
		return Filename;
	}
	public void setFilename(String filename) {
		Filename = filename;
	}
	public String getDocTitle() {
		return DocTitle;
	}
	public void setDocTitle(String docTitle) {
		DocTitle = docTitle;
	}
	public String getSessionId() {
		return SessionId;
	}
	public void setSessionId(String sessionId) {
		SessionId = sessionId;
	}
	public String getRemoteUnlockCode() {
		return RemoteUnlockCode;
	}
	public void setRemoteUnlockCode(String remoteUnlockCode) {
		RemoteUnlockCode = remoteUnlockCode;
	}
	public String getReaderId() {
		return ReaderId;
	}
	public void setReaderId(String readerId) {
		ReaderId = readerId;
	}
	public String getReaderName() {
		return ReaderName;
	}
	public void setReaderName(String readerName) {
		ReaderName = readerName;
	}
	public String getIpAddress() {
		return IpAddress;
	}
	public void setIpAddress(String ipAddress) {
		IpAddress = ipAddress;
	}
	public String getCountryCode() {
		return CountryCode;
	}
	public void setCountryCode(String countryCode) {
		CountryCode = countryCode;
	}
	public String getComputerId() {
		return ComputerId;
	}
	public void setComputerId(String computerId) {
		ComputerId = computerId;
	}
	public String getServerUrl() {
		return ServerUrl;
	}
	public void setServerUrl(String serverUrl) {
		ServerUrl = serverUrl;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public String getUrl() {
		return Url;
	}
	public void setUrl(String url) {
		Url = url;
	}
	public int getOfflineDays() {
		return OfflineDays;
	}
	public void setOfflineDays(int offlineDays) {
		OfflineDays = offlineDays;
	}
	public String getOfflineDaysDescription() {
		return OfflineDaysDescription;
	}
	public void setOfflineDaysDescription(String offlineDaysDescription) {
		OfflineDaysDescription = offlineDaysDescription;
	}
	public String getWatermarkContent() {
		return WatermarkContent;
	}
	public void setWatermarkContent(String watermarkContent) {
		WatermarkContent = watermarkContent;
	}
	public boolean isIsIgnored() {
		return IsIgnored;
	}
	public void setIsIgnored(boolean isIgnored) {
		IsIgnored = isIgnored;
	}
	public String getAnalyticsSessionId() {
		return AnalyticsSessionId;
	}
	public void setAnalyticsSessionId(String analyticsSessionId) {
		AnalyticsSessionId = analyticsSessionId;
	}
	public String getCustomField() {
		return CustomField;
	}
	public void setCustomField(String customField) {
		CustomField = customField;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getClientAppName() {
		return ClientAppName;
	}
	public void setClientAppName(String clientAppName) {
		ClientAppName = clientAppName;
	}
	public String getClientAppVersion() {
		return ClientAppVersion;
	}
	public void setClientAppVersion(String clientAppVersion) {
		ClientAppVersion = clientAppVersion;
	}
	public String getClientLanguage() {
		return ClientLanguage;
	}
	public void setClientLanguage(String clientLanguage) {
		ClientLanguage = clientLanguage;
	}
	public String getClientOperatingSystem() {
		return ClientOperatingSystem;
	}
	public void setClientOperatingSystem(String clientOperatingSystem) {
		ClientOperatingSystem = clientOperatingSystem;
	}
	public String getClientDeviceName() {
		return ClientDeviceName;
	}
	public void setClientDeviceName(String clientDeviceName) {
		ClientDeviceName = clientDeviceName;
	}
	@Override
	public String toString() {
		return "Activity [Id=" + Id + ", ActivityDate=" + ActivityDate + ", IsSuccess=" + IsSuccess + ", Description="
				+ Description + ", DocId=" + DocId + ", VersionId=" + VersionId + ", VersionName=" + VersionName
				+ ", DocCode=" + DocCode + ", Filename=" + Filename + ", DocTitle=" + DocTitle + ", SessionId="
				+ SessionId + ", RemoteUnlockCode=" + RemoteUnlockCode + ", ReaderId=" + ReaderId + ", ReaderName="
				+ ReaderName + ", IpAddress=" + IpAddress + ", CountryCode=" + CountryCode + ", ComputerId="
				+ ComputerId + ", ServerUrl=" + ServerUrl + ", Message=" + Message + ", Url=" + Url + ", OfflineDays="
				+ OfflineDays + ", OfflineDaysDescription=" + OfflineDaysDescription + ", WatermarkContent="
				+ WatermarkContent + ", IsIgnored=" + IsIgnored + ", AnalyticsSessionId=" + AnalyticsSessionId
				+ ", CustomField=" + CustomField + ", Type=" + Type + ", ClientAppName=" + ClientAppName
				+ ", ClientAppVersion=" + ClientAppVersion + ", ClientLanguage=" + ClientLanguage
				+ ", ClientOperatingSystem=" + ClientOperatingSystem + ", ClientDeviceName=" + ClientDeviceName + "]";
	}
	
	
	
	
	/**
	 * 	Activity {
		Id (string, optional),
		ActivityDate (string, optional),
		IsSuccess (boolean, optional),
		Description (string, optional),
		DocId (string, optional),
		VersionId (string, optional),
		VersionName (string, optional),
		DocCode (string, optional),
		Filename (string, optional),
		DocTitle (string, optional),
		SessionId (string, optional),
		RemoteUnlockCode (string, optional),
		ReaderId (string, optional),
		ReaderName (string, optional),
		IpAddress (string, optional),
		CountryCode (string, optional),
		ComputerId (string, optional),
		ServerUrl (string, optional),
		Message (string, optional),
		Url (string, optional),
		OfflineDays (integer, optional),
		OfflineDaysDescription (string, optional),
		WatermarkContent (string, optional),
		IsIgnored (boolean, optional),
		AnalyticsSessionId (string, optional),
		CustomField (string, optional),
		Type (string, optional),
		ClientAppName (string, optional),
		ClientAppVersion (string, optional),
		ClientLanguage (string, optional),
		ClientOperatingSystem (string, optional),
		ClientDeviceName (string, optional)
		}
	 * 
	 */
	
	
	
}
