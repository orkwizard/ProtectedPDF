package sunset.it.tools.api.implementation.documents;

import java.io.File;
import java.net.URISyntaxException;
import java.util.ArrayList;

import org.apache.http.client.utils.URIBuilder;

import sunset.it.tools.api.implementation.ProtectedPDF;
import sunset.it.tools.api.objects.Document;
import sunset.it.tools.api.objects.ReprotectContext;
import sunset.it.tools.api.server.implementation.PDFServer;


public class DocumentImp implements sunset.it.tools.api.interfaces.document.Documents {
	PDFServer server= new PDFServer();

	public String reprotectDocument(ReprotectContext context) {
		// TODO Auto-generated method stub
		return null;
	}

	public String deleteDocuments(ArrayList<String> documentIds) {
		// TODO Auto-generated method stub
		return null;
	}

	public String deleteDocument(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Document getDocument(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public String updateDocument(String id, File rawFile, String settings) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Document> getDocuments(String page, String sort, String filter) {
		// TODO Auto-generated method stub
		ArrayList<Document> documents = new ArrayList<Document>();
		String result="";
		URIBuilder uri;
		
		try {
			uri = new URIBuilder(server.getBaseURL()+"Doc");
			if(!page.isEmpty())
				uri.addParameter("page",page);
			if(!sort.isEmpty())
				uri.addParameter("sort", sort);
			if(!filter.isEmpty())
			uri.addParameter("filter", filter);
			
			System.out.println("URL:------>"+uri.toString());
			result = server.get(uri);
			
			if(result.isEmpty())
				return null;
			
			Results results = server.getGson().fromJson(result,Results.class);
			//Convertir los result objects a Documents
			Document[] docs = results.getDocuments(); 
			
			
			
			
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public String addDocument(File rawfile, String settings) {
		// TODO Auto-generated method stub
		return null;
	}

	public String statusDocument(String id, String status) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args){
		DocumentImp pdf = new DocumentImp();
		pdf.getDocuments("","","");
	}
	
}
