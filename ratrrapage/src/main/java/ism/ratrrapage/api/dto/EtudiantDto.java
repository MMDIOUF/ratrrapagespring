package ism.ratrrapage.api.dto;

import ism.ratrrapage.entities.Etudiant;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EtudiantDto {

    private Long id;
    private  String nomComplet;

    private String matricule;
    private String tuteur;
    ;




    public EtudiantDto(Etudiant etudiant){
        id=etudiant.getId();
        nomComplet=etudiant.getNomComplet();
        matricule=etudiant.getMatricule();
        tuteur=etudiant.getTuteur();

    }
}
