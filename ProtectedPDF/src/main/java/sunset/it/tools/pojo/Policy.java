package sunset.it.tools.pojo;

import java.io.Serializable;
import java.util.ArrayList;

public class Policy  implements Serializable {

	/*Policy {
		Id (string, optional),
		Name (string, optional),
		Type (string, optional),
		PrintType (string, optional),
		AllowCopy (boolean, optional),
		PackageKey (string, optional),
		FormId (string, optional),
		CaseSensitivePassword (boolean, optional),
		AcroJsGosBehaviourType (string, optional),
		AcroJsGosUnlimitedBehaviourType (string, optional),
		DisableAnnotations (boolean, optional),
		WatermarkIds (Array[string], optional),
		Watermarks (Array[Watermark], optional),
		OfflineDays (integer, optional),
		ExpiryDate (string, optional),
		CustomField (string, optional)
		}
	*/
	
	private String Id;
	private String Name;
	private String Type;
	private String PrintType;
	private boolean AllowCopy;
	private String PackageKey;
	private String FormId;
	private boolean CaseSensitivePassword;
	private String AcroJsGosBehaviourType;
	private String AcroJsGosUnlimitedBehaviourType;
	private boolean DisableAnnotations;
	private ArrayList<String> WatermarkIds;
	private ArrayList<Watermark> Watermarks;
	private int OfflineDays;
	private String ExpiryDate;
	private String CustomField;
	
}
