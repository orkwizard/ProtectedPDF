package sunset.it.tools.api.objects;

import java.io.Serializable;
import java.util.ArrayList;

public class ResponseResponse implements Serializable {

	private String ServerHash;
	private Session ApiSession;
	private ArrayList<Account> Accounts;
	private UserInfo User;
	public String getServerHash() {
		return ServerHash;
	}
	public void setServerHash(String serverHash) {
		ServerHash = serverHash;
	}
	public Session getApiSession() {
		return ApiSession;
	}
	public void setApiSession(Session apiSession) {
		ApiSession = apiSession;
	}
	public ArrayList<Account> getAccounts() {
		return Accounts;
	}
	public void setAccounts(ArrayList<Account> accounts) {
		Accounts = accounts;
	}
	public UserInfo getUser() {
		return User;
	}
	public void setUser(UserInfo user) {
		User = user;
	}
	@Override
	public String toString() {
		return "ResponseResponse [ServerHash=" + ServerHash + ", ApiSession=" + ApiSession + ", Accounts=" + Accounts
				+ ", User=" + User + "]";
	}
	
	
	
}
