package dev.thanawat.proxycapture.Holder;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Holder_Service {
	@Autowired
	private final Holder_Repository repo;

	public Holder_Service(Holder_Repository repo) {
		this.repo = repo;
	}
	public List<HolderDTO> findAllHolder() {
		return repo.findAll().stream().map(HolderMapper::responeHolderDTO).collect(Collectors.toList());
	}
	public HolderDTO findHolderByID(String Share_NO) {
		AGMS_HOLDER holder = repo.findById(Share_NO).orElse(null);
		HolderDTO dto = new HolderDTO(holder.getShare_NO(),holder.getShare_Name());
		return dto;
	}
}
