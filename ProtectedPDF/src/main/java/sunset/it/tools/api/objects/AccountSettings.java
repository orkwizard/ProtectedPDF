package sunset.it.tools.api.objects;

import java.io.Serializable;
import java.util.Arrays;

public class AccountSettings implements Serializable {

	/**
	 *	GlobalAccessPolicy (string, optional),
		SupportURL (string, optional),
		Timezone (string, optional),
		SsoLiteMode (string, optional) = ['DeviceId', 'IpAddress'],
		ActivatedModules (Array[string], optional),
		ModuleSettings (Array[KeyValuePair[String,String]], optional)
		} 
	 */
	private static final long serialVersionUID = 1L;
	private String GlobalAccessPolicy;
	private String SupportURL;
	private String Timezone;
	private String SsoLiteMode;
	private String[] ActivatedModules;
	private KeyValuePair[] ModuleSettings;
	public String getGlobalAccessPolicy() {
		return GlobalAccessPolicy;
	}
	public void setGlobalAccessPolicy(String globalAccessPolicy) {
		GlobalAccessPolicy = globalAccessPolicy;
	}
	public String getSupportURL() {
		return SupportURL;
	}
	public void setSupportURL(String supportURL) {
		SupportURL = supportURL;
	}
	public String getTimezone() {
		return Timezone;
	}
	public void setTimezone(String timezone) {
		Timezone = timezone;
	}
	public String getSsoLiteMode() {
		return SsoLiteMode;
	}
	public void setSsoLiteMode(String ssoLiteMode) {
		SsoLiteMode = ssoLiteMode;
	}
	public String[] getActivatedModules() {
		return ActivatedModules;
	}
	public void setActivatedModules(String[] activatedModules) {
		ActivatedModules = activatedModules;
	}
	public KeyValuePair[] getModuleSettings() {
		return ModuleSettings;
	}
	public void setModuleSettings(KeyValuePair[] moduleSettings) {
		ModuleSettings = moduleSettings;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "AccountSettings [GlobalAccessPolicy=" + GlobalAccessPolicy + ", SupportURL=" + SupportURL
				+ ", Timezone=" + Timezone + ", SsoLiteMode=" + SsoLiteMode + ", ActivatedModules="
				+ Arrays.toString(ActivatedModules) + ", ModuleSettings=" + Arrays.toString(ModuleSettings) + "]";
	}
	
	
	
	

}
