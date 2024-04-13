package ma.ac.uir.projetcrud.model;
import jakarta.persistence.*;

import java.util.*;

@Entity
@Table(name = "Commande")
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;

    @Column(name="date")
    private Date dateCommande;
    @Column(name="statut")
    private String statut;

    public Commande() {
    }

    public Commande(Long id, Utilisateur utilisateur,  Date dateCommande, String statut) {
        this.id = id;
        this.utilisateur = utilisateur;
        this.dateCommande = dateCommande;
        this.statut = statut;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
}
