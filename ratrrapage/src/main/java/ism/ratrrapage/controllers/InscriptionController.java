package ism.ratrrapage.controllers;

import ism.ratrrapage.dto.InscriptionDtoForm;
import ism.ratrrapage.entities.Classe;
import ism.ratrrapage.entities.Etudiant;
import ism.ratrrapage.entities.Inscription;
import ism.ratrrapage.repository.ClasseRepository;
import ism.ratrrapage.repository.EtudiantRepository;
import ism.ratrrapage.repository.InscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class InscriptionController {

@Autowired
    private InscriptionRepository inscriptionRepository;
@Autowired
    private EtudiantRepository etudiantRepository;
@Autowired
    private ClasseRepository classeRepository;



    @GetMapping("/liste-inscriptions")
    public String listerInscription(Model model){
        List<Inscription> inscriptions=inscriptionRepository.findAll();
        model.addAttribute("listeInscriptions",inscriptions);
        return "inscription";
    }

    @GetMapping("/form-inscription")
    public String loadForInscription(Model model){
        InscriptionDtoForm inscription=new InscriptionDtoForm();
        model.addAttribute("inscription",inscription);
        return "form.inscription";
    }
}
