package ma.ac.uir.projetcrud.service;

import ma.ac.uir.projetcrud.dao.userDAO;
import ma.ac.uir.projetcrud.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {

    private final userDAO utilisateurDAO;

    @Autowired
    public UtilisateurServiceImpl(userDAO utilisateurDAO) {
        this.utilisateurDAO = utilisateurDAO;
    }

    @Override
    public List<Utilisateur> findAll() {
        return utilisateurDAO.findAll();
    }

    @Override
    public Optional<Utilisateur> findById(Long id) {
        return utilisateurDAO.findById(id);
    }

    @Override
    public Utilisateur save(Utilisateur utilisateur) {
        return utilisateurDAO.save(utilisateur);
    }

    @Override
    public void deleteById(Long id) {
        utilisateurDAO.deleteById(id);
    }
}
