package sunset.it.tools.api.interfaces;

import java.io.File;
import java.util.ArrayList;

import sunset.it.tools.pojo.ClearUserUsageContext;

public interface Reader {

	public sunset.it.tools.pojo.Reader getReaderbyUserName(String username);
	public String deleteReaders(ArrayList<String> readerUniqueIds);
	public ArrayList<sunset.it.tools.pojo.Reader> getReaders(String page,String sort,String filter);
	public String addReader(sunset.it.tools.pojo.Reader reader);
	public String deleteReader(String id);
	public sunset.it.tools.pojo.Reader getReader(String id);
	public String updateReader(String id,sunset.it.tools.pojo.Reader reader);
	public String usageReader(ClearUserUsageContext context);
	public String importReader(File readersfile,String settings);
	
	
}
