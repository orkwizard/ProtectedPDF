package sunset.it.tools.api.server.interfaces;

import java.io.File;
import java.net.URI;

import org.apache.http.client.utils.URIBuilder;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.entity.StringEntity;

public interface HttpServer {
	public void post(StringEntity entity,String command,URIBuilder params);
	public String post(URIBuilder uri);
	public void put(StringEntity entity,String command,URIBuilder params);
	public String get(URIBuilder uri);
	public void close();
	public void open();
	public String getSessionToken();
	public void login();
	public boolean tokenValid();
	public String getToken();
	public void setToken();
	
}
