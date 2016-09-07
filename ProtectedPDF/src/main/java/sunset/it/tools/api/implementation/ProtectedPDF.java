package sunset.it.tools.api.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.util.ArrayList;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

import com.google.gson.Gson;

import sunset.it.tools.api.implementation.documents.Results;
import sunset.it.tools.api.objects.ChallengeResponse;
import sunset.it.tools.api.objects.Reader;
import sunset.it.tools.api.objects.ResponseResponse;

public class ProtectedPDF {

	private static final String baseURL = "https://pro.protectedpdf.com:443/api/2.0/";
	private static final String READER = "Reader";
	private static final Gson gson = new Gson();
	
	//Temporal mientras veo q pedo con los tokens
	private String XVITRACCOUNTTOKEN="a24aa6ba-7b3c-426b-b74a-550327804bf5";
	private String XVITRSESSIONTOKEN="7eb14c4c-870c-443f-ad19-806b35b3c712";
	
	private  HttpClient httpClient;
	
	public ChallengeResponse loginChallenge(String context){	
		return null;
	}
	
	public ResponseResponse loginResponse(String context){	
		return null;
	}
	
	
	private String get(URIBuilder uri){
		HttpGet get;
		try {
			get = new HttpGet(uri.build());
			get.addHeader("X-VITR-ACCOUNT-TOKEN",XVITRACCOUNTTOKEN);
			get.addHeader("X-VITR-SESSION-TOKEN",XVITRSESSIONTOKEN );
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
		}
		
		
		return "No data";
		
	}
	private String post(StringEntity input,String command,URIBuilder params){
		HttpPost post = new HttpPost(baseURL+command);
		input.setContentType("application/json");
		post.setEntity(input);
		
		
		
		return "";
	}
	
	
	public ArrayList<Reader> getReaders(String page,String sort,String filter){
		String result="";
		ArrayList<Reader> readers= new ArrayList<Reader>();
		try {
			URIBuilder uri = new URIBuilder(baseURL+ProtectedPDF.READER);
			if(!page.isEmpty())
				uri.addParameter("page",page);
			if(!sort.isEmpty())
				uri.addParameter("sort", sort);
			if(!filter.isEmpty())
			uri.addParameter("filter", filter);
			result = get(uri);
			
			
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(result.isEmpty())
			return null;
		/*
		Results results = gson.fromJson(result,Results.class);
		
		Reader[] r = results.getReaders();
		
		
		int size = results.size();
		for(int i=0;i<size;i++)
			readers.add(results.getReaders()[i]);
		return readers;
		
		*/
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
	
	public static void main(String[] args){
		ProtectedPDF pdf = new ProtectedPDF();
		pdf.getReaders("{\"index\":1, \"size\":20}","","");
	}
}
