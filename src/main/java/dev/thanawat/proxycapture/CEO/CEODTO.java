package dev.thanawat.proxycapture.CEO;

public class CEODTO {
	private String CEO_CODE;
	private String CEO_NAME;
	public CEODTO() {
	}
	public CEODTO(String cEO_CODE, String cEO_NAME) {
		CEO_CODE = cEO_CODE;
		CEO_NAME = cEO_NAME;
	}
	public String getCEO_CODE() {
		return CEO_CODE;
	}
	public void setCEO_CODE(String cEO_CODE) {
		CEO_CODE = cEO_CODE;
	}
	public String getCEO_NAME() {
		return CEO_NAME;
	}
	public void setCEO_NAME(String cEO_NAME) {
		CEO_NAME = cEO_NAME;
	}
	
}
