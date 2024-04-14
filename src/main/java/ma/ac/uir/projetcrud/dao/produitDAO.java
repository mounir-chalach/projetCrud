package ma.ac.uir.projetcrud.dao;

import ma.ac.uir.projetcrud.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface produitDAO extends JpaRepository<Produit, Integer> {

    default Produit findByPId(int id) {
        return null;
    }

}

