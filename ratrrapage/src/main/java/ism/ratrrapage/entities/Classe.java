package ism.ratrrapage.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "classes")
@DiscriminatorValue(value = "Classe")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Classe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @Column(nullable = false,unique = true)
    private String libelle;


    @Column(nullable = false)
    private String filiere;


    @Column(nullable = false)
    private String niveau;


    @Override
    public String toString() {
        return  libelle ;
    }
}
