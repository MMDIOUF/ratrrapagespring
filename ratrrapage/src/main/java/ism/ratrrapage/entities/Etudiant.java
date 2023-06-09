package ism.ratrrapage.entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "etudiants")
@DiscriminatorValue(value = "Etudiant")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Etudiant extends User{

    @Column(nullable = false)
    private String matricule;
    @Column(nullable = false)
    private String tuteur;

    @ManyToOne
    @JoinColumn(name = "classe_id")
    private Classe classe;

}
