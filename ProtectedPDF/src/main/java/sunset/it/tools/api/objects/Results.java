package sunset.it.tools.api.objects;

import java.io.Serializable;
import java.util.Arrays;


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
	public void setReaders(Reader[] readers) {
		this.Results = readers;
	}

	@Override
	public String toString() {
		return "Results [Results=" + Arrays.toString(Results) + "]";
	}
	
	
	
}
