package sunset.it.tools.api.objects;

import java.io.Serializable;

public class ResponseContext implements Serializable{

	private String ClientNonce;
	private String ClientHash;
	private String UserName;
	private String ApplicationId;
	public String getClientNonce() {
		return ClientNonce;
	}
	public void setClientNonce(String clientNonce) {
		ClientNonce = clientNonce;
	}
	public String getClientHash() {
		return ClientHash;
	}
	public void setClientHash(String clientHash) {
		ClientHash = clientHash;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getApplicationId() {
		return ApplicationId;
	}
	public void setApplicationId(String applicationId) {
		ApplicationId = applicationId;
	}
	@Override
	public String toString() {
		return "ResponseContext [ClientNonce=" + ClientNonce + ", ClientHash=" + ClientHash + ", UserName=" + UserName
				+ ", ApplicationId=" + ApplicationId + "]";
	}
	
	
}
