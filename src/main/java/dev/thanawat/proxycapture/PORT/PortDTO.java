package dev.thanawat.proxycapture.PORT;

public class PortDTO {
	private String PORT;
	private String PORT_NAME;
	public PortDTO() {
	}
	public PortDTO(String pORT, String pORT_NAME) {
		this.PORT = pORT;
		this.PORT_NAME = pORT_NAME;
	}
	public String getPORT() {
		return PORT;
	}
	public void setPORT(String pORT) {
		PORT = pORT;
	}
	public String getPORT_NAME() {
		return PORT_NAME;
	}
	public void setPORT_NAME(String pORT_NAME) {
		PORT_NAME = pORT_NAME;
	}
}
