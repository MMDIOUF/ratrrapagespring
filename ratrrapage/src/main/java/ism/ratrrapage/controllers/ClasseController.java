package ism.ratrrapage.controllers;


import ism.ratrrapage.entities.Classe;
import ism.ratrrapage.repository.ClasseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ClasseController {

    @Autowired
    private ClasseRepository classeRepository;
    @GetMapping("/liste-classes")
    public String listerClasse(Model model){
        List<Classe> classes=classeRepository.findAll();
        model.addAttribute("listeClasses",classes);
        return "classe";
    }
}
