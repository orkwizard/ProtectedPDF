package sunset.it.tools.pojo;

public class ReaderUsage {

	/****
	 * 
	 *  ReaderUsage {
		Type (string, optional) = ['Unlock', 'WebUnlock', 'PdfUnlock', 'RemoteUnlock', 'Print'],
		DocId (string, optional),
		DocCode (string, optional),
		FileName (string, optional),
		Count (integer, optional),
		LastUsageAt (string, optional)
		}
	 * 
	 */
	
	private String Type;
	private String DocId;
	private String DocCode;
	private String FileName;
	private int Count;
	private String LastUsageAt;
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getDocId() {
		return DocId;
	}
	public void setDocId(String docId) {
		DocId = docId;
	}
	public String getDocCode() {
		return DocCode;
	}
	public void setDocCode(String docCode) {
		DocCode = docCode;
	}
	public String getFileName() {
		return FileName;
	}
	public void setFileName(String fileName) {
		FileName = fileName;
	}
	public int getCount() {
		return Count;
	}
	public void setCount(int count) {
		Count = count;
	}
	public String getLastUsageAt() {
		return LastUsageAt;
	}
	public void setLastUsageAt(String lastUsageAt) {
		LastUsageAt = lastUsageAt;
	}
	@Override
	public String toString() {
		return "ReaderUsage [Type=" + Type + ", DocId=" + DocId + ", DocCode=" + DocCode + ", FileName=" + FileName
				+ ", Count=" + Count + ", LastUsageAt=" + LastUsageAt + "]";
	}
	
	
	
}
