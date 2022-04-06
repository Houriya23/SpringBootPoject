package com.enicarthage.SpringBootProject.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.enicarthage.SpringBootProject.entities.Utilisateur;
@Repository
public interface UtilisateurRepository extends CrudRepository<Utilisateur, Long> {

}
