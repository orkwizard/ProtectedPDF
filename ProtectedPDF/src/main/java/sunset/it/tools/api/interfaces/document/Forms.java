package sunset.it.tools.api.interfaces.document;

import java.io.File;
import java.util.ArrayList;

import sunset.it.tools.api.objects.Form;

public interface Forms {

	public String deleteLogins(ArrayList<String> loginFormUniqueIds);
	public ArrayList<Form> getForms(String page,String sort,String filter);
	public String addForm(File rawfile,Form form);
	public String deleteForm(String id);
	public Form getForm(String id);
	public String updateForm(String id,File rawfile,Form form);
	
}
