package sunset.it.tools.api.objects;

public class ReaderPolicy {

	/****
	 * 
	 *  ReaderPolicy {
		PdfLimit (integer, optional),
		BrowserLimit (integer, optional),
		ComputersMax (integer, optional),
		OfflineDurationinDays (integer, optional),
		Expiry (string, optional),
		IpAddressesMax (integer, optional),
		IgnoredIpAddresses (string, optional),
		DocumentLimit (integer, optional),
		RelativeExpiryInDays (integer, optional),
		OpenLimit (integer, optional),
		PrintLimit (integer, optional)
		}
	 */
	private int PdfLimit;
	private int BrowserLimit;
	private int ComputersMax;
	private int OfflineDurationinDays;
	private String Expiry;
	private int IpAddressesMax;
	private int IgnoredIpAddresses;
	private int DocumentLimit;
	private int RelativeExpiryInDays;
	private int OpenLimit;
	private int PrintLimit;
	public int getPdfLimit() {
		return PdfLimit;
	}
	public void setPdfLimit(int pdfLimit) {
		PdfLimit = pdfLimit;
	}
	public int getBrowserLimit() {
		return BrowserLimit;
	}
	public void setBrowserLimit(int browserLimit) {
		BrowserLimit = browserLimit;
	}
	public int getComputersMax() {
		return ComputersMax;
	}
	public void setComputersMax(int computersMax) {
		ComputersMax = computersMax;
	}
	public int getOfflineDurationinDays() {
		return OfflineDurationinDays;
	}
	public void setOfflineDurationinDays(int offlineDurationinDays) {
		OfflineDurationinDays = offlineDurationinDays;
	}
	public String getExpiry() {
		return Expiry;
	}
	public void setExpiry(String expiry) {
		Expiry = expiry;
	}
	public int getIpAddressesMax() {
		return IpAddressesMax;
	}
	public void setIpAddressesMax(int ipAddressesMax) {
		IpAddressesMax = ipAddressesMax;
	}
	public int getIgnoredIpAddresses() {
		return IgnoredIpAddresses;
	}
	public void setIgnoredIpAddresses(int ignoredIpAddresses) {
		IgnoredIpAddresses = ignoredIpAddresses;
	}
	public int getDocumentLimit() {
		return DocumentLimit;
	}
	public void setDocumentLimit(int documentLimit) {
		DocumentLimit = documentLimit;
	}
	public int getRelativeExpiryInDays() {
		return RelativeExpiryInDays;
	}
	public void setRelativeExpiryInDays(int relativeExpiryInDays) {
		RelativeExpiryInDays = relativeExpiryInDays;
	}
	public int getOpenLimit() {
		return OpenLimit;
	}
	public void setOpenLimit(int openLimit) {
		OpenLimit = openLimit;
	}
	public int getPrintLimit() {
		return PrintLimit;
	}
	public void setPrintLimit(int printLimit) {
		PrintLimit = printLimit;
	}
	@Override
	public String toString() {
		return "ReaderPolicy [PdfLimit=" + PdfLimit + ", BrowserLimit=" + BrowserLimit + ", ComputersMax="
				+ ComputersMax + ", OfflineDurationinDays=" + OfflineDurationinDays + ", Expiry=" + Expiry
				+ ", IpAddressesMax=" + IpAddressesMax + ", IgnoredIpAddresses=" + IgnoredIpAddresses
				+ ", DocumentLimit=" + DocumentLimit + ", RelativeExpiryInDays=" + RelativeExpiryInDays + ", OpenLimit="
				+ OpenLimit + ", PrintLimit=" + PrintLimit + "]";
	}
	
	
	
}
