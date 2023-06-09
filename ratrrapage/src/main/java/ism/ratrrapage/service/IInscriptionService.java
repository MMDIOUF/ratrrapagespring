package ism.ratrrapage.service;

import ism.ratrrapage.entities.Etudiant;
import ism.ratrrapage.entities.Inscription;

import java.util.List;

public interface IInscriptionService {

    public List<Inscription> listerDesInscrits();
    public void inscrireEtudiant(Etudiant etudiant);

}
