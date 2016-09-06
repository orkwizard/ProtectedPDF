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
		return null;
	}

	public String deleteReaders(ArrayList<String> readerUniqueIds) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Reader> getReaders(String page, String sort, String filter) {
		// TODO Auto-generated method stub
		ArrayList<Reader> readers = new ArrayList<Reader>();
		String result="";
		URIBuilder uri;
		
		try {
			uri = new URIBuilder(server.getBaseURL()+"Doc");
			uri.addParameter("page",page);
			uri.addParameter("sort", sort);
			uri.addParameter("filter", filter);
			result = server.get(uri);
			
			if(result.isEmpty())
				return null;
			
			Results results = server.getGson().fromJson(result,Results.class);
			//Convertir los result objects a Documents
			Reader[] readers_array = results.getReaders(); 
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
		return null;
	}

	public Reader getReader(String id) {
		// TODO Auto-generated method stub
		return null;
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
	
	public void main(String args[]){
		
	}

}
