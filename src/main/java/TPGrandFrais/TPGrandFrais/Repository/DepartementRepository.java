package TPGrandFrais.TPGrandFrais.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import TPGrandFrais.TPGrandFrais.Entity.Departement;

@Repository
public interface DepartementRepository extends JpaRepository<Departement, Long> {

}
