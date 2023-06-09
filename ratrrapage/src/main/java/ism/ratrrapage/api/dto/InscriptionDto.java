package ism.ratrrapage.api.dto;

import ism.ratrrapage.entities.Inscription;
import lombok.*;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class InscriptionDto {
    private Long id;
    private ClasseDto classe;
    private  EtudiantDto etudiant;

    private LocalDate date;

    public InscriptionDto(Inscription inscription){
        id=inscription.getId();
        classe=new ClasseDto(inscription.getClasse());
        etudiant=new EtudiantDto(inscription.getEtudiant());
        date=(inscription.getDate());


    }
}
