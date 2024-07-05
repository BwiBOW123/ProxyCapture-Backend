package dev.thanawat.proxycapture.PORT;

public class PortMapper {
	public static PortDTO responePortDTO(AGMS_PORT_LVL port_LVL) {
		return new PortDTO(port_LVL.getPORT(),port_LVL.getPORT_Name());
	}
}
