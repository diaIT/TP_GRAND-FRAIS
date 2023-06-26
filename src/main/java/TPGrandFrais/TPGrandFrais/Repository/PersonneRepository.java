package TPGrandFrais.TPGrandFrais.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import TPGrandFrais.TPGrandFrais.Entity.Personne;

@Repository
public interface PersonneRepository extends JpaRepository<Personne, Long> {

}
