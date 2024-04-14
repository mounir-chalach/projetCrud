package ma.ac.uir.projetcrud.dao;

import ma.ac.uir.projetcrud.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;


public interface userDAO extends JpaRepository<Utilisateur, Long> {
    Utilisateur findByUsername(String username);
}

