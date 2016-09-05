package sunset.it.tools.api.objects;

import java.io.Serializable;

public class ReprotectContext implements Serializable {
	
	private Document document;
	private boolean PublishPdf;
	private boolean PublishWebViewer;
	public Document getDocument() {
		return document;
	}
	public void setDocument(Document document) {
		this.document = document;
	}
	public boolean isPublishPdf() {
		return PublishPdf;
	}
	public void setPublishPdf(boolean publishPdf) {
		PublishPdf = publishPdf;
	}
	public boolean isPublishWebViewer() {
		return PublishWebViewer;
	}
	public void setPublishWebViewer(boolean publishWebViewer) {
		PublishWebViewer = publishWebViewer;
	}
	@Override
	public String toString() {
		return "ReprotectContext [document=" + document + ", PublishPdf=" + PublishPdf + ", PublishWebViewer="
				+ PublishWebViewer + "]";
	}
	
	

}
