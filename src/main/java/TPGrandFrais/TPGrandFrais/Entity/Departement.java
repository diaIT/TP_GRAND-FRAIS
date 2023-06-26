package TPGrandFrais.TPGrandFrais.Entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table (name="departement")

public class Departement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "code")
	private String code;
	@Column(name="designation")
	private String designation;

	@OneToMany(targetEntity = Personne.class, mappedBy = "departement", cascade = CascadeType.ALL)
	private Set<Personne> personnes = new HashSet<>();

	public Departement(){}
	public Departement(String code, String designation, Set<Personne> personnes) {
		this.code = code;
		this.designation = designation;
		this.personnes = personnes;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void setPersonnes(Set<Personne> personnes) {
		this.personnes = personnes;
	}
}


