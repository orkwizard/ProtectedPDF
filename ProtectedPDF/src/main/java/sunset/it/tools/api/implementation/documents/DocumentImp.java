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
		//To test 09d97813-39fa-47b2-a66f-12215633c746
		//id="09d97813-39fa-47b2-a66f-12215633c746";
		// TODO Auto-generated method stub
		URIBuilder uri;
		String result;
		
		try {
			uri = new URIBuilder(server.getBaseURL()+"Doc/"+id);
			System.out.println("URL:------>"+uri.toString());
			result = server.get(uri);
			System.out.println("A document" + result);
			Document aDocument = server.getGson().fromJson(result,Document.class);
			return aDocument;
				
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
			uri.addParameter("page",page);
			uri.addParameter("sort", sort);
			uri.addParameter("filter", filter);
			
			System.out.println("URL:------>"+uri.toString());
			result = server.get(uri);
			
			Results results = server.getGson().fromJson(result,Results.class);
			//Convertir los result objects a Documents
			Document[] docs = results.getDocuments(); 
			int size = docs.length;
			for(int i=0;i<size;i++){
				System.out.println(docs[i].toString());
				documents.add(docs[i]);
			}
			return documents;
			
			
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
		//pdf.getDocument("ae399938-fcc0-4996-bd71-9b864d24111b");
	}
	
}
