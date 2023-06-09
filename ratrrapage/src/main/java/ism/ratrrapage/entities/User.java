package ism.ratrrapage.entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "role")
@DiscriminatorValue(value = "User")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    @Column(nullable = false)
    protected String nomComplet;
    @Column(nullable = false)
    protected String Login;
    @Column(nullable = false)
    protected String password;
}
