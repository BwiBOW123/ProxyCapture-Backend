package dev.thanawat.proxycapture.PORT;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Port_Service {
	@Autowired
	private final Port_Repository repo;
	public Port_Service(Port_Repository repo) {
		this.repo = repo;
	}
	public List<PortDTO> findAllPorts() {
		return repo.findAll().stream().map(PortMapper::responePortDTO).collect(Collectors.toList());
	}
	public PortDTO findPortByID( String PORT) {
		AGMS_PORT_LVL port_LVL = repo.findById(PORT).orElse(null);
		PortDTO dto = new PortDTO(port_LVL.getPORT(),port_LVL.getPORT_Name());
		return dto;
	}
}
