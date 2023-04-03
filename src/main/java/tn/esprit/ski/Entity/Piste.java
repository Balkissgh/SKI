package tn.esprit.ski.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Piste implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numPiste;
    private String nomPiste;
    @Enumerated(EnumType.STRING)
    private Couleur couleur;
    private int  longeur;
    private int pente;
    @ManyToMany
    @JsonIgnore
    @JoinTable(
            name = "skieur_piste_set",
            joinColumns = @JoinColumn(name = "num_piste"),
            inverseJoinColumns = @JoinColumn(name = "num_skieur"))
    private Set<Skieur> skieurSet;

}
