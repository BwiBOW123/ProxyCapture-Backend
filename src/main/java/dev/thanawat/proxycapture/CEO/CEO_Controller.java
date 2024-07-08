package dev.thanawat.proxycapture.CEO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CEO_Controller {
	@Autowired
	private CEO_Service ceo_Service;

	public CEO_Controller(CEO_Service ceo_Service) {
		this.ceo_Service = ceo_Service;
	}
	
	@GetMapping("/CEOS")
	private List<CEODTO> findAllCEO() {
		return ceo_Service.findAllCEO();
	}
	@GetMapping("/CEOS/{CEO_CODE}")
	private CEODTO findCEOByID(@PathVariable String CEO_CODE) {
		return ceo_Service.findCEOByID(CEO_CODE);
	}
}
