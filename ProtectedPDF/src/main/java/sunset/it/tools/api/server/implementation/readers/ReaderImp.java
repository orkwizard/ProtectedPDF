package sunset.it.tools.api.server.implementation.readers;

import java.io.File;
import java.net.URISyntaxException;
import java.util.ArrayList;

import org.apache.http.client.utils.URIBuilder;

import sunset.it.tools.api.server.implementation.readers.Results;
import sunset.it.tools.api.interfaces.auth.Readers;
import sunset.it.tools.api.objects.ClearUserUsageContext;
import sunset.it.tools.api.objects.Document;
import sunset.it.tools.api.objects.Reader;
import sunset.it.tools.api.server.implementation.PDFServer;

public class ReaderImp implements Readers{
	
	PDFServer server= new PDFServer();


	public Reader getReaderbyUserName(String username) {
		// TODO Auto-generated method stub
		URIBuilder uri;
		String result;
		Reader aReader=null;
		
		try {
			uri=new URIBuilder(server.getProBaseURL()+"Reader/Username");
			uri.addParameter("username",username);
			result = server.get(uri);
			aReader = server.getGson().fromJson(result, Reader.class);
			System.out.println("Reader by Username :" + aReader.toString());
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aReader;
	}

	public String deleteReaders(ArrayList<String> readerUniqueIds) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Reader> getReaders(String page, String sort, String filter) {
		// TODO Auto-generated method stub
		ArrayList<Reader> readers=null; 
		String result="";
		URIBuilder uri;
		
		try {
			uri = new URIBuilder(server.getProBaseURL()+"Reader");
			uri.addParameter("page",page);
			uri.addParameter("sort", sort);
			uri.addParameter("filter", filter);
			result = server.get(uri);
			
			if(result.isEmpty())
				return null;
			
			Results results = server.getGson().fromJson(result,Results.class);
			//Convertir los result objects a Documents
			Reader[] readers_array = results.getReaders(); 
			int size = readers_array.length;
			readers = new ArrayList<Reader>(size);
			for(int i=0;i<size;i++){
				System.out.println(readers_array[i].toString());
				readers.add(readers_array[i]);
			}
			
		}catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return readers;
	}

	public String addReader(Reader reader) {
		// TODO Auto-generated method stub
		return null;
	}

	public String deleteReader(String id) {
		// TODO Auto-generated method stub
		String result="";
		try {
			URIBuilder uri = new URIBuilder(server.getProBaseURL()+"Reader/"+id);
			
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return result;
	}

	public Reader getReader(String id) {
		// TODO Auto-generated method stub
		Reader aReader=null;
		URIBuilder uri;
		String result;
		
		try {
			uri= new URIBuilder(server.getProBaseURL()+"Reader/"+id);
			result = server.get(uri);
			aReader = server.getGson().fromJson(result, Reader.class);
			System.out.println("Reader by ID :" + aReader.toString());
			
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return aReader;
	}

	public String updateReader(String id, Reader reader) {
		// TODO Auto-generated method stub
		return null;
	}

	public String usageReader(ClearUserUsageContext context) {
		// TODO Auto-generated method stub
		return null;
	}

	public String importReader(File readersfile, String settings) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String args[]){
		ReaderImp readers = new ReaderImp();
		//readers.getReaders("","","");
		//readers.getReaderbyUserName("eosorio");
		//readers.getReader("08df3c46-3fda-4ad9-9bf1-99044a50c1f4");
	
	}

}
