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
	
	
	
}
