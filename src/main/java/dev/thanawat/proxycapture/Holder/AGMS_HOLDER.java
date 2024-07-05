package dev.thanawat.proxycapture.Holder;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import dev.thanawat.proxycapture.PORT.AGMS_PORT_LVL;

@Entity
public class AGMS_HOLDER {

	@Id
	@Column(name = "SHARE_NO",length = 10)
	private String Share_NO;
	
	@Column(name = "SHARE_NAME",length = 150)
	private String Share_Name;
	
	@Column(name = "TYPE_NAME",length = 100)
	private String type_Name;
	
	@ManyToOne
	@JoinColumn(name = "ports_id")
	@JsonBackReference
	private AGMS_PORT_LVL ports;

	public AGMS_HOLDER() {
	}

	public AGMS_HOLDER(String share_NO, String share_Name, String type_Name, AGMS_PORT_LVL ports) {
		this.Share_NO = share_NO;
		this.Share_Name = share_Name;
		this.type_Name = type_Name;
		this.ports = ports;
	}

	public String getShare_NO() {
		return Share_NO;
	}

	public void setShare_NO(String share_NO) {
		Share_NO = share_NO;
	}

	public String getShare_Name() {
		return Share_Name;
	}

	public void setShare_Name(String share_Name) {
		Share_Name = share_Name;
	}

	public String getType_Name() {
		return type_Name;
	}

	public void setType_Name(String type_Name) {
		this.type_Name = type_Name;
	}

	public AGMS_PORT_LVL getPorts() {
		return ports;
	}

	public void setPorts(AGMS_PORT_LVL ports) {
		this.ports = ports;
	}
}
