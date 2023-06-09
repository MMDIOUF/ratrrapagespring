package ism.ratrrapage.api.dto;

import ism.ratrrapage.entities.Classe;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ClasseDto {
    private Long id;
    private String niveau;
    private String filiere;
    private String libelle;


    public ClasseDto(Classe classe){
        id=classe.getId();
        niveau=classe.getNiveau();
        filiere=classe.getFiliere();
        libelle= classe.getLibelle();
    }
}
