package sunset.it.tools.api.implementation;

import java.io.UnsupportedEncodingException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.params.HttpParams;

import sunset.it.tools.pojo.ChallengeResponse;
import sunset.it.tools.pojo.ResponseResponse;
import sunset.it.tools.pojo.Session;

public class ProtectedPDF {

	private static final String baseURL = "https://pro.protectedpdf.com:443/api/2.0/";
	private String XVITRACCOUNTTOKEN;
	private String XVITRSESSIONTOKEN;
	
	private  HttpClient httpClient;
	
	
	public ChallengeResponse loginChallenge(String context){	
		return null;
	}
	
	public ResponseResponse loginResponse(String context){	
		return null;
	}
	
	public String authenticate(String usr,String pwd){
		
		HttpPost post = new HttpPost(baseURL+"authenticate");
		try {
			StringEntity input = new StringEntity("{\"Username\":\"eosorio@sunset.com.mx \",\"Password\":\"test123\"}");
			input.setContentType("application/json");
			post.setEntity(input);
			//https://www.mkyong.com/webservices/jax-rs/restful-java-client-with-apache-httpclient/
			//HttpResponse response =  httpClien
			
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	public ProtectedPDF(){
		httpClient = HttpClientBuilder.create().build();
		
	}
	
	
}
