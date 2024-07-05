package dev.thanawat.proxycapture.PORT;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Port_Controller {
	@Autowired
	private Port_Service portService;
	
	public Port_Controller(Port_Service portService) {
		this.portService = portService;
	}
	@GetMapping("/Ports")
	public List<PortDTO> findAllPorts() {
		return portService.findAllPorts();
	}
	@GetMapping("/Ports/{PORT}")
	public PortDTO findPortByID(@PathVariable String PORT) {
		return portService.findPortByID(PORT);
	}
}
