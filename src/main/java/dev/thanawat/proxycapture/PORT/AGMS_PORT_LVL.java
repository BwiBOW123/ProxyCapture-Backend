package dev.thanawat.proxycapture.PORT;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import dev.thanawat.proxycapture.Holder.AGMS_HOLDER;

@Entity
public class AGMS_PORT_LVL {
	@Id
	@Column(name = "PORT",length = 4)
	private String PORT;
	
	@Column(name = "PORT_NAME",length = 180)
	private String PORT_Name;
	
	@Column(name = "PORT_ENG",length = 180)
	private String PORT_ENG;

	@Column(name = "PORT_TYPE",length = 2)
	private String PORT_Type;

	@OneToMany(mappedBy = "ports")
	@JsonManagedReference
	private List<AGMS_HOLDER> holder;


	public AGMS_PORT_LVL() {
	}

	public AGMS_PORT_LVL(String pORT, String pORT_Name, String pORT_ENG, String pORT_Type,
			List<AGMS_HOLDER> holder) {
		this.PORT = pORT;
		this.PORT_Name = pORT_Name;
		this.PORT_ENG = pORT_ENG;
		this.PORT_Type = pORT_Type;
		this.holder = holder;
	}

	public String getPORT() {
		return PORT;
	}

	public void setPORT(String pORT) {
		PORT = pORT;
	}

	public String getPORT_Name() {
		return PORT_Name;
	}

	public void setPORT_Name(String pORT_Name) {
		PORT_Name = pORT_Name;
	}

	public String getPORT_ENG() {
		return PORT_ENG;
	}

	public void setPORT_ENG(String pORT_ENG) {
		PORT_ENG = pORT_ENG;
	}

	public String getPORT_Type() {
		return PORT_Type;
	}

	public void setPORT_Type(String pORT_Type) {
		PORT_Type = pORT_Type;
	}

	public List<AGMS_HOLDER> getHolder() {
		return holder;
	}

	public void setHolder(List<AGMS_HOLDER> holder) {
		this.holder = holder;
	}
		
}
