package TPGrandFrais.TPGrandFrais.Services;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TPGrandFrais.TPGrandFrais.Entity.Departement;
import TPGrandFrais.TPGrandFrais.Entity.Personne;
import TPGrandFrais.TPGrandFrais.Repository.DepartementRepository;
import TPGrandFrais.TPGrandFrais.Repository.PersonneRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class PersonneService {
	private PersonneRepository personneRepository;
	private DepartementRepository departementRepository;

	@Autowired
	public PersonneService(PersonneRepository personneRepository){
		this.personneRepository = personneRepository;
	}

	// CREATE
	public Personne createPersonne(Personne personne) {
		return personneRepository.save(personne);
	}

	// READ
	public List<Personne> getPersonne() {
		return personneRepository.findAll();
	}

	// DELETE
	public void deletePersonne(Long id) {
		personneRepository.deleteById(id);
	}

	// UPDATE
	public Personne updatePersonne(Long id, Personne personneDetails, Departement departement) {
		Personne personne = personneRepository.findById(id).get();
		personne.setNom(personneDetails.getNom());
		personne.setPrenom(personneDetails.getPrenom());
		personne.setAge(personneDetails.getAge());
		personne.setDepartment(departement);

		return personneRepository.save(personne);
	}


}
