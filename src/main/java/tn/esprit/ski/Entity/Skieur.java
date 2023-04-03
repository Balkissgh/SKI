package tn.esprit.ski.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Skieur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numSkieur;
    private String nomS;
    private String prenomS;
    private LocalDate dateNaissance;
    private String Ville;
@ManyToMany(mappedBy = "skieurSet")
    private Set<Piste> pisteSet;
@OneToMany(mappedBy = "skieur")
    private Set<Inscription> inscriptionSet;
@OneToOne(cascade = CascadeType.ALL)
    private Abonnement abonnement;

}
