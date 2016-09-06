package sunset.it.tools.api.interfaces.auth;

import java.io.File;
import java.util.ArrayList;

import sunset.it.tools.api.objects.ClearUserUsageContext;
import sunset.it.tools.api.objects.Reader;

public interface Readers {

	public Reader getReaderbyUserName(String username);
	public String deleteReaders(ArrayList<String> readerUniqueIds);
	public ArrayList<Reader> getReaders(String page,String sort,String filter);
	public String addReader(Reader reader);
	public String deleteReader(String id);
	public Reader getReader(String id);
	public String updateReader(String id,Reader reader);
	public String usageReader(ClearUserUsageContext context);
	public String importReader(File readersfile,String settings);
	
	
}
