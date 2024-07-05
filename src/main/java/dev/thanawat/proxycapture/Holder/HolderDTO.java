package dev.thanawat.proxycapture.Holder;

public class HolderDTO {
	private String Share_NO;
	private String share_Name;
	public HolderDTO() {
	}
	public HolderDTO(String share_NO, String share_Name) {
		this.Share_NO = share_NO;
		this.share_Name = share_Name;
	}
	public String getShare_NO() {
		return Share_NO;
	}
	public void setShare_NO(String share_NO) {
		Share_NO = share_NO;
	}
	public String getShare_Name() {
		return share_Name;
	}
	public void setShare_Name(String share_Name) {
		this.share_Name = share_Name;
	}
}
