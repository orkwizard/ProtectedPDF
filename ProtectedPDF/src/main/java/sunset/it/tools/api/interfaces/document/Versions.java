package sunset.it.tools.api.interfaces.document;

import java.io.File;
import java.util.ArrayList;

import sunset.it.tools.api.objects.Document;
import sunset.it.tools.api.objects.Version;

public interface Versions {
	public ArrayList<Version> getMostRecentVersionDocuments(String page,String sort,String filter);
	public ArrayList<Version> getAllVersionDocument(String id,String page,String sort,String filter);
	public String addDocumentVersion(File rawfile,Version version);
	public ArrayList<Version> getDocumentVersion(String id);
	public String updateVersion(String id,File rawfile,Version version);
	public ArrayList<Version> getSingleVersion(String id);
	public String createCopy(Document document);
	public File downloadBinary(String id,String downloadToken);
}
