package ma.ac.uir.projetcrud.model;


import jakarta.persistence.*;

@Entity
@Table(name = "Commentaire")
public class Commentaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cmt_id")
    private Long id;



    @ManyToOne
    @JoinColumn(name = "produit_id")
    private Produit produit;

    private String text;

    public Commentaire() {
    }

    public Commentaire(Long id, Produit produit, String text) {
        this.id = id;
        this.produit = produit;
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

