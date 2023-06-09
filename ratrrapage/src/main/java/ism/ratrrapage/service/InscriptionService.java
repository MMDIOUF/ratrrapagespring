package ism.ratrrapage.service;

import ism.ratrrapage.entities.Etudiant;
import ism.ratrrapage.entities.Inscription;
import ism.ratrrapage.repository.EtudiantRepository;
import ism.ratrrapage.repository.InscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class InscriptionService implements IInscriptionService{
    @Autowired
   private EtudiantRepository etudiantRepository;
    @Autowired
    private InscriptionRepository inscriptionRepository;
    @Override
    public List<Inscription> listerDesInscrits() {
        return inscriptionRepository.findAll();
    }

    @Override

    public void inscrireEtudiant(Etudiant etudiant) {
        etudiantRepository.save(etudiant);
    }

    }

