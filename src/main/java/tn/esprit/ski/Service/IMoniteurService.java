package tn.esprit.ski.Service;

import tn.esprit.ski.Entity.Moniteur;

import java.util.List;

public interface IMoniteurService {
    Moniteur addMoniteur(Moniteur moniteur);
    List<Moniteur> retrieveAllMoniteurs();
    Moniteur updateMoniteur (Moniteur moniteur);
    Moniteur retrieveMoniteur (Long numMoniteur);
}
