package dev.thanawat.proxycapture.CEO;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CEO_Service {
	@Autowired
	private CEO_Repository ceo_repository;
	
	public CEO_Service(CEO_Repository ceo_repository) {
		super();
		this.ceo_repository = ceo_repository;
	}

	public List<CEODTO> findAllCEO() {
		return ceo_repository.findAll().stream().map(CEOMapper::responeCEODTO).collect(Collectors.toList());
	}
	public CEODTO findCEOByID(String CEO_CODE) {
		AGMS_CEO_LVL ceo = ceo_repository.findById(CEO_CODE).orElse(null);
		return new CEODTO(ceo.getCEO_CODE(),ceo.getCEO_NAME());
	}
}
