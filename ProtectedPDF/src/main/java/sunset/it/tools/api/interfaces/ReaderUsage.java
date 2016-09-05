package sunset.it.tools.api.interfaces;

import java.util.ArrayList;

import sunset.it.tools.pojo.ClearUserUsageContext;

public interface ReaderUsage {
	public String deleteReaderUsage(ClearUserUsageContext context);
	public ArrayList<sunset.it.tools.pojo.ReaderUsage> getReadersUsage(String page,String sort,String filter);
}
