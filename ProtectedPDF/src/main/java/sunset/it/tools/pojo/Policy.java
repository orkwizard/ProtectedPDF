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
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getPrintType() {
		return PrintType;
	}
	public void setPrintType(String printType) {
		PrintType = printType;
	}
	public boolean isAllowCopy() {
		return AllowCopy;
	}
	public void setAllowCopy(boolean allowCopy) {
		AllowCopy = allowCopy;
	}
	public String getPackageKey() {
		return PackageKey;
	}
	public void setPackageKey(String packageKey) {
		PackageKey = packageKey;
	}
	public String getFormId() {
		return FormId;
	}
	public void setFormId(String formId) {
		FormId = formId;
	}
	public boolean isCaseSensitivePassword() {
		return CaseSensitivePassword;
	}
	public void setCaseSensitivePassword(boolean caseSensitivePassword) {
		CaseSensitivePassword = caseSensitivePassword;
	}
	public String getAcroJsGosBehaviourType() {
		return AcroJsGosBehaviourType;
	}
	public void setAcroJsGosBehaviourType(String acroJsGosBehaviourType) {
		AcroJsGosBehaviourType = acroJsGosBehaviourType;
	}
	public String getAcroJsGosUnlimitedBehaviourType() {
		return AcroJsGosUnlimitedBehaviourType;
	}
	public void setAcroJsGosUnlimitedBehaviourType(String acroJsGosUnlimitedBehaviourType) {
		AcroJsGosUnlimitedBehaviourType = acroJsGosUnlimitedBehaviourType;
	}
	public boolean isDisableAnnotations() {
		return DisableAnnotations;
	}
	public void setDisableAnnotations(boolean disableAnnotations) {
		DisableAnnotations = disableAnnotations;
	}
	public ArrayList<String> getWatermarkIds() {
		return WatermarkIds;
	}
	public void setWatermarkIds(ArrayList<String> watermarkIds) {
		WatermarkIds = watermarkIds;
	}
	public ArrayList<Watermark> getWatermarks() {
		return Watermarks;
	}
	public void setWatermarks(ArrayList<Watermark> watermarks) {
		Watermarks = watermarks;
	}
	public int getOfflineDays() {
		return OfflineDays;
	}
	public void setOfflineDays(int offlineDays) {
		OfflineDays = offlineDays;
	}
	public String getExpiryDate() {
		return ExpiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		ExpiryDate = expiryDate;
	}
	public String getCustomField() {
		return CustomField;
	}
	public void setCustomField(String customField) {
		CustomField = customField;
	}
	@Override
	public String toString() {
		return "Policy [Id=" + Id + ", Name=" + Name + ", Type=" + Type + ", PrintType=" + PrintType + ", AllowCopy="
				+ AllowCopy + ", PackageKey=" + PackageKey + ", FormId=" + FormId + ", CaseSensitivePassword="
				+ CaseSensitivePassword + ", AcroJsGosBehaviourType=" + AcroJsGosBehaviourType
				+ ", AcroJsGosUnlimitedBehaviourType=" + AcroJsGosUnlimitedBehaviourType + ", DisableAnnotations="
				+ DisableAnnotations + ", WatermarkIds=" + WatermarkIds + ", Watermarks=" + Watermarks
				+ ", OfflineDays=" + OfflineDays + ", ExpiryDate=" + ExpiryDate + ", CustomField=" + CustomField + "]";
	}
	
	
}
