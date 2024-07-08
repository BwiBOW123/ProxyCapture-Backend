package dev.thanawat.proxycapture.CEO;

public class CEOMapper {
	public static CEODTO responeCEODTO(AGMS_CEO_LVL ceo_LVL) {
		return new CEODTO(ceo_LVL.getCEO_CODE(),ceo_LVL.getCEO_NAME());
	}
}
