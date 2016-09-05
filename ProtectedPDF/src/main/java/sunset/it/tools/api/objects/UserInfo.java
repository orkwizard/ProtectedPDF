package sunset.it.tools.api.objects;

import java.io.Serializable;

public class UserInfo implements Serializable {

	/*
	 * UserInfo {
		Id (string, optional),
		FirstName (string, optional),
		LastName (string, optional),
		Email (string, optional),
		IsFirstLogin (boolean, optional),
		HasDocument (boolean, optional)
		}
	 *
	 */
	
	private String Id;
	private String FirstName;
	private String LastName;
	private String Email;
	private boolean IsFirstLogin;
	private boolean HasDocument;
	
	
	
}
