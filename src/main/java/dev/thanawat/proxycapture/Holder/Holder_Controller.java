package dev.thanawat.proxycapture.Holder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Holder_Controller {
	@Autowired
	private Holder_Service holderService;

	public Holder_Controller(Holder_Service holderService) {
		this.holderService = holderService;
	}
	@GetMapping("/Holders")
	public List<HolderDTO> findAllHolders(){
		return holderService.findAllHolder();
	}
	
	@GetMapping("/Holders/{Share_NO}")
	public HolderDTO findHolderByID(@PathVariable String Share_NO) {
		return holderService.findHolderByID(Share_NO);
	}
}
