
package com.enicarthage.SpringBootProject.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.enicarthage.SpringBootProject.entities.Consultation;
@Repository
public interface ConsultationRepository extends CrudRepository<Consultation, Long> {

}