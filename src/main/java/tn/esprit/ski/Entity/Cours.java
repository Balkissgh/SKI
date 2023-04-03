package tn.esprit.ski.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numCours;
    private int niveau;
    @Enumerated(EnumType.STRING)
    private TypeCours typeCour;
    @Enumerated(EnumType.STRING)
    private Support support;
    private Float prix;
    private int creneau;
    @OneToMany(mappedBy = "cours")
        private Set<Inscription> inscriptionSet;

}
