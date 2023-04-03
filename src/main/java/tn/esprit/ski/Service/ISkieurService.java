package tn.esprit.ski.Service;

import tn.esprit.ski.Entity.Piste;
import tn.esprit.ski.Entity.Skieur;

import java.util.List;
import java.util.Set;

public interface ISkieurService {
    List <Skieur> retrieveAllSkieurs();
    Skieur addSkieur(Skieur skieur);

    void removeSkieur (Long numSkieur);
    Skieur retrieveSkieur (Long numSkieur);
    Set<Skieur> assignSkierToPiste(Long numSkieur, Long numPiste);
}
