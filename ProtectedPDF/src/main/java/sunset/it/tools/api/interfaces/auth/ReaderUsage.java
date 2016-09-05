package sunset.it.tools.api.interfaces.auth;

import java.util.ArrayList;

import sunset.it.tools.api.objects.ClearUserUsageContext;

public interface ReaderUsage {
	public String deleteReaderUsage(ClearUserUsageContext context);
	public ArrayList<sunset.it.tools.api.objects.ReaderUsage> getReadersUsage(String page,String sort,String filter);
}
