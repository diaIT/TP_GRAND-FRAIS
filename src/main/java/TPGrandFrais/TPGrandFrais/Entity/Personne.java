package TPGrandFrais.TPGrandFrais.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "personne")

public class Personne {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nom")
	private String nom;

	@Column(name = "prenom")
	private  String prenom;

	private  int age;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "departement_code", referencedColumnName = "code")
	private Departement departement;
	public Personne() {

	}
	public Personne (String nom, String prenom, int age, Departement departement) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.departement=departement;
	}



	// Getters and Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Departement getDepartement() {
		return departement;
	}

	public void setDepartment(Departement departement) {
		this.departement = departement;
	}

}
