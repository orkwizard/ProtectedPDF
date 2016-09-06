package sunset.it.tools.api.server.implementation.readers;

import java.io.Serializable;
import java.util.Arrays;

import sunset.it.tools.api.objects.Document;
import sunset.it.tools.api.objects.Reader;


public class Results implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Reader[] Results;

	public Reader[] getReaders() {
		return Results;
	}

	public int size(){
		if(Results!=null)
			return 0;
		return getReaders().length;
	}

	@Override
	public String toString() {
		return "Results [Results=" + Arrays.toString(Results) + "]";
	}
	
	
	
}
