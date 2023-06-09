package ism.ratrrapage.controllers;


import ism.ratrrapage.entities.Etudiant;
import ism.ratrrapage.repository.EtudiantRepository;
import ism.ratrrapage.repository.InscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EtudiantController {


    @Autowired
    private EtudiantRepository etudiantRepository;

    @Autowired
    InscriptionRepository inscriptionRepository;

    @GetMapping("/liste-etudiant")
    public String listerEtudiant(Model model) {
        List<Etudiant> etudiants= etudiantRepository.findAll();
        model.addAttribute("listEtudiants", etudiants);
        return "etudiant";
    }

    @GetMapping("/form-etudiant")
    public String loadForEtudiant(Model model){
        Etudiant etudiant=new Etudiant();
        model.addAttribute("etudiant",etudiant);
        return "/form.etudiant";
    }

    @PostMapping("/save-etudiant")
    public String saveEtudiant(Etudiant etudiant){
        etudiantRepository.save(etudiant);
        return "redirect:/form-etudiant";
    }
}
