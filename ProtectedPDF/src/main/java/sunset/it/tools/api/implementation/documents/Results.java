package sunset.it.tools.api.implementation.documents;

import java.io.Serializable;
import java.util.Arrays;

import sunset.it.tools.api.objects.Document;


public class Results implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Document[] Results;

	public Document[] getDocuments() {
		return Results;
	}

	public int size(){
		if(Results!=null)
			return 0;
		return getDocuments().length;
	}

	@Override
	public String toString() {
		return "Results [Results=" + Arrays.toString(Results) + "]";
	}
	
	
	
}
