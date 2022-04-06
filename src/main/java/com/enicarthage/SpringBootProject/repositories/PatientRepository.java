

package com.enicarthage.SpringBootProject.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.enicarthage.SpringBootProject.entities.Patient;
@Repository
public interface PatientRepository extends CrudRepository<Patient, Long> {

}
