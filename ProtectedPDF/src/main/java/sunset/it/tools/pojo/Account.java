package sunset.it.tools.pojo;

import java.io.Serializable;

public class Account implements Serializable {

		/*
		 * Account {
			Id (string, optional),
			Name (string, optional),
			WebViewerDocEncryptionEnabled (boolean, optional),
			AllowUserDefinedWebViewerEncryptionPassword (boolean, optional),
			AccountType (string, optional),
			AnalyticsEnabled (boolean, optional)
			}
		 */

	
	private String Id;
	private String Name;
	private boolean WebViewerDocEncryptionEnabled;
	private boolean AllowUserDefinedWebViewerEncryptionPassword;
	private String AccountType;
	private boolean AnalyticsEnabled;
	
	
}
