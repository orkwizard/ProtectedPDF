package sunset.it.tools.api.interfaces.auth;

import java.io.File;
import java.util.ArrayList;

import sunset.it.tools.api.objects.ClearUserUsageContext;

public interface Reader {

	public sunset.it.tools.api.objects.Reader getReaderbyUserName(String username);
	public String deleteReaders(ArrayList<String> readerUniqueIds);
	public ArrayList<sunset.it.tools.api.objects.Reader> getReaders(String page,String sort,String filter);
	public String addReader(sunset.it.tools.api.objects.Reader reader);
	public String deleteReader(String id);
	public sunset.it.tools.api.objects.Reader getReader(String id);
	public String updateReader(String id,sunset.it.tools.api.objects.Reader reader);
	public String usageReader(ClearUserUsageContext context);
	public String importReader(File readersfile,String settings);
	
	
}
