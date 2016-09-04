package sunset.it.tools.pojo;

import java.io.Serializable;

public class KeyValuePair implements Serializable {
	
	/*
	 * 
	 * 	KeyValuePair[String,String] {
		key (string, optional),
		value (string, optional)
		}
	 */
	private String key;
	private String value;
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "KeyValuePair [key=" + key + ", value=" + value + "]";
	}
	
	
	
}
