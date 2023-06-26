package TPGrandFrais.TPGrandFrais.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import TPGrandFrais.TPGrandFrais.Entity.Departement;
import TPGrandFrais.TPGrandFrais.Entity.Personne;
import TPGrandFrais.TPGrandFrais.Services.DepartementService;
import TPGrandFrais.TPGrandFrais.Services.PersonneService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")

public class DepartementController {
	private DepartementService departementService;

	@Autowired
	public DepartementController(DepartementService departementService) {
		this.departementService = departementService;
	}

	@RequestMapping(value="/departement", method=RequestMethod.GET)
	public List<Departement> readDepartement() {
		return departementService.getDepartement();
	}
}
