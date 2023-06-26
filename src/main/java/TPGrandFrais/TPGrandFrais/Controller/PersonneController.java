package TPGrandFrais.TPGrandFrais.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import TPGrandFrais.TPGrandFrais.Entity.Departement;
import TPGrandFrais.TPGrandFrais.Entity.Personne;
import TPGrandFrais.TPGrandFrais.Services.PersonneService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import jakarta.annotation.PostConstruct;
import jakarta.persistence.Id;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonneController {
     private PersonneService personneService;

	 @Autowired
	 private ObjectMapper objectMapper;

	@PostConstruct
	public void configureObjectMapper()
	{
		objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
	}
	 public PersonneController(PersonneService personneService) {
		 this.personneService = personneService;
	 }

	@RequestMapping(value="/personnes", method= RequestMethod.POST)
	public Personne createPersonne(@RequestBody Personne personne) {
		return personneService.createPersonne(personne);
	}

	@RequestMapping(value="/personnes", method=RequestMethod.GET)
	public List<Personne> readPersonnes() {
		return personneService.getPersonne();
	}

	@RequestMapping(value="/personnes/{id}", method=RequestMethod.PUT)
	public Personne readPersonnes(@PathVariable(value = "id") Long id, @RequestBody Personne personneDetails) {
		Departement departement = personneDetails.getDepartement();

		return personneService.updatePersonne(id, personneDetails, departement);
	}

	@RequestMapping(value="/personnes/{id}", method=RequestMethod.DELETE)
	public void deletePersonnes(@PathVariable(value = "id") Long id) {
		personneService.deletePersonne(id);
	}

}
