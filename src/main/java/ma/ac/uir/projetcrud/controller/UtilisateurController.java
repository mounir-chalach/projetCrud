package ma.ac.uir.projetcrud.controller;

import ma.ac.uir.projetcrud.dao.userDAO;
import ma.ac.uir.projetcrud.model.Utilisateur;
import ma.ac.uir.projetcrud.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
public class UtilisateurController {

    private final UtilisateurService utilisateurService;

    @Autowired
    public UtilisateurController(UtilisateurService utilisateurService) {
        this.utilisateurService = utilisateurService;
    }



    // Afficher la liste des utilisateurs
    @GetMapping("/list")
    public String listUsers(Model model) {
        model.addAttribute("users", utilisateurService.findAll());
        return "user-list";
    }

    // Afficher le formulaire pour ajouter un utilisateur
    @GetMapping("/add")
    public String addUserForm(Model model) {
        model.addAttribute("utilisateur", new Utilisateur());
        return "add-user";
    }

    // Enregistrer un nouvel utilisateur
    @PostMapping("/save")
    public String saveUser(@ModelAttribute("utilisateur") Utilisateur utilisateur) {
        utilisateurService.save(utilisateur);
        return "redirect:/users/list";
    }

    // Afficher le formulaire pour mettre à jour un utilisateur
    @GetMapping("/update/{id}")
    public String updateUserForm(@PathVariable Long id, Model model) {
        Utilisateur utilisateur = utilisateurService.findById(id).orElse(null);
        if (utilisateur == null) {
            return "redirect:/users/list";
        }
        model.addAttribute("utilisateur", utilisateur);
        return "update-user";
    }

    // Mettre à jour un utilisateur
    @PostMapping("/update")
    public String updateUser(@ModelAttribute("utilisateur") Utilisateur utilisateur) {
        utilisateurService.save(utilisateur);
        return "redirect:/users/list";
    }

    // Supprimer un utilisateur
    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        utilisateurService.deleteById(id);
        return "redirect:/users/list";
    }
}

