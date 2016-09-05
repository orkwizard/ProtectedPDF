	package sunset.it.tools.api.interfaces.document;

import java.io.File;
import java.util.ArrayList;

import sunset.it.tools.api.objects.Document;
import sunset.it.tools.api.objects.ReprotectContext;

public interface Documents {
	public String reprotectDocument(ReprotectContext context);
	public String deleteDocuments(ArrayList<String> documentIds);//comma delimited document unique ids
	public String deleteDocument(String id);
	public Document getDocument(String id);
	public String updateDocument(String id,File rawFile,String settings);
	public ArrayList<Document> getDocuments(String page,String sort,String filter);
	public String addDocument(File rawfile,String settings);
	public String statusDocument(String id,String status);
}
