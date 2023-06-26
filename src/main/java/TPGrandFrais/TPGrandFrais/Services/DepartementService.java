package TPGrandFrais.TPGrandFrais.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TPGrandFrais.TPGrandFrais.Entity.Departement;
import TPGrandFrais.TPGrandFrais.Entity.Personne;
import TPGrandFrais.TPGrandFrais.Repository.DepartementRepository;
import TPGrandFrais.TPGrandFrais.Repository.PersonneRepository;

@Service
public class DepartementService {

	private DepartementRepository departementRepository;
	@Autowired
	public DepartementService(DepartementRepository departementRepository){
		this.departementRepository = departementRepository;
	}

	public List<Departement> getDepartement() {
		return departementRepository.findAll();
	}


}
