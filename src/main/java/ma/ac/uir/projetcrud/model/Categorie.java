package ma.ac.uir.projetcrud.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Categorie")
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "NomCategorie")
    private String nomCategorie;

    @OneToMany(mappedBy = "categorie")
    private List<Produit> products = new ArrayList<>();


    public int getId() {
        return id;
    }

    public String getNomCategorie() {
        return nomCategorie;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNomCategorie(String nomCategorie) {
        this.nomCategorie = nomCategorie;
    }
}
