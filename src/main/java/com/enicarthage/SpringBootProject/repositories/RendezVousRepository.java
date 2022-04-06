

package com.enicarthage.SpringBootProject.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.enicarthage.SpringBootProject.entities.RendezVous;
@Repository
public interface RendezVousRepository extends CrudRepository<RendezVous, Long> {

}