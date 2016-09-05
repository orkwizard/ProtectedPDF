package sunset.it.tools.pojo;

import java.io.Serializable;

public class ClearUserUsageContext implements Serializable {

	/***
	 * 
	 * ReaderName (string, optional),
	   GroupName (string, optional),
       DocId (string, optional),
       FolderId (string, optional),
       Type (string, optional) = ['Unlock', 'WebUnlock', 'PdfUnlock', 'RemoteUnlock', 'Print']
	 * 
	 * 
	 * 
	 */
	private static final String Unlock="Unlock";
	private static final String WebUnlock ="WebUnlock";
	private static final String PdfUnlock="PdfUnlock";
	private static final String RemoteUnlock="RemoteUnlock";
	private static final String Print="Print";
	
	private String ReaderName;
	private String GroupName;
	private String DocId;
	private String FolderId;
	private String Type;
	
	public String getReaderName() {
		return ReaderName;
	}
	public void setReaderName(String readerName) {
		ReaderName = readerName;
	}
	public String getGroupName() {
		return GroupName;
	}
	public void setGroupName(String groupName) {
		GroupName = groupName;
	}
	public String getDocId() {
		return DocId;
	}
	public void setDocId(String docId) {
		DocId = docId;
	}
	public String getFolderId() {
		return FolderId;
	}
	public void setFolderId(String folderId) {
		FolderId = folderId;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	@Override
	public String toString() {
		return "ClearUserUsageContext [ReaderName=" + ReaderName + ", GroupName=" + GroupName + ", DocId=" + DocId
				+ ", FolderId=" + FolderId + ", Type=" + Type + "]";
	}
	
	
	
}
