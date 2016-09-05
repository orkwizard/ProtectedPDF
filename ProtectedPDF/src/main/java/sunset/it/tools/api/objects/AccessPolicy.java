package sunset.it.tools.api.objects;

import java.io.Serializable;

public class AccessPolicy implements Serializable {

	/*
	 * 
		 * AccessPolicy {
		Id (string, optional),
		Name (string, optional),
		PdfLimit (integer, optional),
		BrowserLimit (integer, optional),
		CustomField (string, optional),
		ComputersMax (integer, optional),
		IpAddressesMax (integer, optional),
		IgnoredIpAddresses (string, optional),
		OfflineDurationinDays (integer, optional),
		Expiry (string, optional),
		DocumentLimit (integer, optional),
		RelativeExpiryInDays (integer, optional),
		OpenLimit (integer, optional),
		PrintLimit (integer, optional)
		}
 * 
 */
	
	private String Id;
	private String Name;
	private int PdfLimit;
	private int BrowserLimit;
	private String CustomField;
	private int ComputersMax;
	private int IpAddressesMax;
	private String IgnoredIpAddresses;
	private int OfflineDurationinDays;
	private String Expiry;
	private int DocumentLimit;
	private int RelativeExpiryInDays;
	private int OpenLimit;
	private int PrintLimit;
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
	public String getCustomField() {
		return CustomField;
	}
	public void setCustomField(String customField) {
		CustomField = customField;
	}
	public int getComputersMax() {
		return ComputersMax;
	}
	public void setComputersMax(int computersMax) {
		ComputersMax = computersMax;
	}
	public int getIpAddressesMax() {
		return IpAddressesMax;
	}
	public void setIpAddressesMax(int ipAddressesMax) {
		IpAddressesMax = ipAddressesMax;
	}
	public String getIgnoredIpAddresses() {
		return IgnoredIpAddresses;
	}
	public void setIgnoredIpAddresses(String ignoredIpAddresses) {
		IgnoredIpAddresses = ignoredIpAddresses;
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
		return "AcessPolicy [Id=" + Id + ", Name=" + Name + ", PdfLimit=" + PdfLimit + ", BrowserLimit=" + BrowserLimit
				+ ", CustomField=" + CustomField + ", ComputersMax=" + ComputersMax + ", IpAddressesMax="
				+ IpAddressesMax + ", IgnoredIpAddresses=" + IgnoredIpAddresses + ", OfflineDurationinDays="
				+ OfflineDurationinDays + ", Expiry=" + Expiry + ", DocumentLimit=" + DocumentLimit
				+ ", RelativeExpiryInDays=" + RelativeExpiryInDays + ", OpenLimit=" + OpenLimit + ", PrintLimit="
				+ PrintLimit + "]";
	}
	
	
	
	
}
