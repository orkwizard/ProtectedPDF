package sunset.it.tools.pojo;

import java.io.Serializable;

public class RemoteUnlockContext implements Serializable{

	/***
	 * 
	 *  DocVersionId (string, optional),
		DocId (string, optional),
		DocCode (string, optional),
		FolderIdPath (string, optional),
		FileName (string, optional),
		ReaderId (string, optional),
		ReaderUserName (string, optional),
		OfflineDays (integer, optional),
		AccessCode (string, optional),
		CaseSensitive (boolean, optional)
		}
	 * 
	 * 
	 */
	
	private String DocVersionId;
	private String DocId;
	private String DocCode;
	private String FolderIdPath;
	private String FileName;
	private String ReaderId;
	private String ReaderUserName;
	private int OfflineDays;
	private String AccessCode;
	private boolean CaseSensitive;
	public String getDocVersionId() {
		return DocVersionId;
	}
	public void setDocVersionId(String docVersionId) {
		DocVersionId = docVersionId;
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
	public String getFolderIdPath() {
		return FolderIdPath;
	}
	public void setFolderIdPath(String folderIdPath) {
		FolderIdPath = folderIdPath;
	}
	public String getFileName() {
		return FileName;
	}
	public void setFileName(String fileName) {
		FileName = fileName;
	}
	public String getReaderId() {
		return ReaderId;
	}
	public void setReaderId(String readerId) {
		ReaderId = readerId;
	}
	public String getReaderUserName() {
		return ReaderUserName;
	}
	public void setReaderUserName(String readerUserName) {
		ReaderUserName = readerUserName;
	}
	public int getOfflineDays() {
		return OfflineDays;
	}
	public void setOfflineDays(int offlineDays) {
		OfflineDays = offlineDays;
	}
	public String getAccessCode() {
		return AccessCode;
	}
	public void setAccessCode(String accessCode) {
		AccessCode = accessCode;
	}
	public boolean isCaseSensitive() {
		return CaseSensitive;
	}
	public void setCaseSensitive(boolean caseSensitive) {
		CaseSensitive = caseSensitive;
	}
	@Override
	public String toString() {
		return "RemoteUnlockContext [DocVersionId=" + DocVersionId + ", DocId=" + DocId + ", DocCode=" + DocCode
				+ ", FolderIdPath=" + FolderIdPath + ", FileName=" + FileName + ", ReaderId=" + ReaderId
				+ ", ReaderUserName=" + ReaderUserName + ", OfflineDays=" + OfflineDays + ", AccessCode=" + AccessCode
				+ ", CaseSensitive=" + CaseSensitive + "]";
	}
	
	
	
	
}
