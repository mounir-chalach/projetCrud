package ma.ac.uir.projetcrud.service;

import ma.ac.uir.projetcrud.model.Utilisateur;



import java.util.List;
import java.util.Optional;

public interface UtilisateurService {

    List<Utilisateur> findAll();

    Optional<Utilisateur> findById(Long id);

    Utilisateur save(Utilisateur utilisateur);

    void deleteById(Long id);
}


