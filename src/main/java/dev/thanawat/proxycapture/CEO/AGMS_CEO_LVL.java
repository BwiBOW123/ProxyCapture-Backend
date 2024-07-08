package dev.thanawat.proxycapture.CEO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AGMS_CEO_LVL {
	@Id
	@Column(name = "CEO_CODE",length = 3)
	private String CEO_CODE;

	@Column(name = "CEO_NAME",length = 100)
	private String CEO_NAME;

	@Column(name = "CEO_ENG",length = 100)
	private String CEO_ENG;
	
	@Column(name = "CEO_ST",length = 1)
	private String CEO_ST;

	public AGMS_CEO_LVL() {
	}

	public AGMS_CEO_LVL(String cEO_CODE, String cEO_NAME, String cEO_ENG, String cEO_ST) {
		CEO_CODE = cEO_CODE;
		CEO_NAME = cEO_NAME;
		CEO_ENG = cEO_ENG;
		CEO_ST = cEO_ST;
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

	public String getCEO_ENG() {
		return CEO_ENG;
	}

	public void setCEO_ENG(String cEO_ENG) {
		CEO_ENG = cEO_ENG;
	}

	public String getCEO_ST() {
		return CEO_ST;
	}

	public void setCEO_ST(String cEO_ST) {
		CEO_ST = cEO_ST;
	}
		
	
}
