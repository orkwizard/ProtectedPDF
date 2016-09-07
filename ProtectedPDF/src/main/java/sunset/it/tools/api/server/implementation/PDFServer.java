package sunset.it.tools.api.server.implementation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

import com.google.gson.Gson;

import sunset.it.tools.api.server.interfaces.HttpServer;

public class PDFServer implements HttpServer {

	HttpClient httpClient;
	private String XVITRACCOUNTTOKEN="a24aa6ba-7b3c-426b-b74a-550327804bf5";
	private String XVITRSESSIONTOKEN="9de6b037-08df-455e-810c-e3fec70eae25";
	private static final String baseURL = "https://api.protectedpdf.com:443/api/2.0/";
	private static final String pro_baseURL = "https://pro.protectedpdf.com:443/api/2.0/";
	private static final Gson gson = new Gson();
	
	
	public PDFServer(){
		httpClient = HttpClientBuilder.create().build();
		//Login to get Token Session
		login();
	}
	
	public void post(StringEntity entity, String command, URIBuilder params) {
		// TODO Auto-generated method stub

	}
	public String getBaseURL(){
		return baseURL;
	}
	
	public String getProBaseURL(){
		return pro_baseURL;
	}
	
	public Gson getGson(){
		return gson;
	}

	public String get(URIBuilder uri) {
		// TODO Auto-generated method stub
		HttpGet get=null;
		 try {
			get = new HttpGet(uri.build());
			get.addHeader("X-VITR-ACCOUNT-TOKEN",XVITRACCOUNTTOKEN);
			get.addHeader("X-VITR-SESSION-TOKEN",XVITRSESSIONTOKEN);
			HttpResponse response = httpClient.execute(get);
			System.out.println(response.getStatusLine().toString());
			BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));
			String output="";
			String result="";
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
				result+=output;
			}
			return result;
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			get.releaseConnection();
		}
		 
		
		
		
		return "Data";
	}

	
	public void close() {
		// TODO Auto-generated method stub
		httpClient.getConnectionManager().shutdown();

	}

	public void open() {
		// TODO Auto-generated method stub

	}

	public String getSessionToken() {
		// TODO Auto-generated method stub
		return "5afe25f9-17c1-41d2-b0a5-8321913da3ff";
	}

	public void put(StringEntity entity, String command, URIBuilder params) {
		// TODO Auto-generated method stub
		
	}

	public void login() {
		// TODO Auto-generated method stub
		System.out.println("Get Longin session Tokens ");
		
		
	}

	public boolean tokenValid() {
		// TODO Auto-generated method stub
		//TO BE IMPLEMENTED
		
		return true;
	}

	public String getToken() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setToken() {
		// TODO Auto-generated method stub
		
	}
	
	

}
