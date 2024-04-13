package ma.ac.uir.projetcrud.model;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "Produit")
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;
    @Column(name = "NomProduit")
    private String nomProduit;
    @Column(name = "description")
    private String description;
    @Column(name = "Prix")
    private double prix;
    @Column(name = "QStock")
    private int quantiteEnStock;
    @OneToMany(mappedBy = "produit")
    private List<Commentaire> comments = new ArrayList<>();

    public Produit() {
    }

    public Produit(int id, Categorie categorie, String nomProduit, String description, double prix, int quantiteEnStock) {
        this.id = id;
        this.categorie = categorie;
        this.nomProduit = nomProduit;
        this.description = description;
        this.prix = prix;
        this.quantiteEnStock = quantiteEnStock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getQuantiteEnStock() {
        return quantiteEnStock;
    }

    public void setQuantiteEnStock(int quantiteEnStock) {
        this.quantiteEnStock = quantiteEnStock;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", categorie=" + categorie +
                ", nomProduit='" + nomProduit + '\'' +
                ", description='" + description + '\'' +
                ", prix=" + prix +
                ", quantiteEnStock=" + quantiteEnStock +
                '}';
    }
}


