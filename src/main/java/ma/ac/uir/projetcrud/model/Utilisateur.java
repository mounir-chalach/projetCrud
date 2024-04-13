package ma.ac.uir.projetcrud.model;


import jakarta.persistence.*;

@Entity
@Table(name = "Users")
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private Long id;
    @Column(name="username")
    private String usernamme;
    @Column(name="password")
    private String Password;
    @Column(name="role")
    private String role;

    public Utilisateur() {
    }

    public Utilisateur(Long id, String usernamme, String password, String role) {
        this.id = id;
        this.usernamme = usernamme;
        Password = password;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsernamme() {
        return usernamme;
    }

    public void setUsernamme(String usernamme) {
        this.usernamme = usernamme;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "id=" + id +
                ", usernamme='" + usernamme + '\'' +
                ", Password='" + Password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}


