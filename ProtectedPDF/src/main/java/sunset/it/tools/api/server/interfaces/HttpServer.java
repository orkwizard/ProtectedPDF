package sunset.it.tools.api.server.interfaces;

import java.io.File;

import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;

public interface HttpServer {
	public void post(StringEntity entity,String command,URIBuilder params);
	public String get(URIBuilder uri);
	public void close();
	public void open();
}
