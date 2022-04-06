

package com.enicarthage.SpringBootProject.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.enicarthage.SpringBootProject.entities.Medecin;
@Repository
public interface MedecinRepository extends CrudRepository<Medecin, Long> {

}