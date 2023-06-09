package ism.ratrrapage.dto;


import ism.ratrrapage.entities.Classe;
import ism.ratrrapage.entities.Etudiant;
import ism.ratrrapage.entities.Inscription;
import lombok.*;

import java.time.LocalDate;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InscriptionDtoForm {
    protected Long id;
    protected LocalDate date;
    private String libelle;
    private String matricule;
    private String nomComplet;






}
