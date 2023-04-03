package tn.esprit.ski.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ski.Entity.Piste;
import tn.esprit.ski.Entity.Skieur;
import tn.esprit.ski.Repository.PisteRepository;
import tn.esprit.ski.Repository.SkieurRepository;

import java.util.List;
import java.util.Set;

@Service
public class SkieurService implements  ISkieurService {
    SkieurRepository skieurRepository;
    @Autowired
    PisteRepository pisteRepository;

    public SkieurService(SkieurRepository skieurRepository) {
        this.skieurRepository = skieurRepository;
    }

    @Override
    public List<Skieur> retrieveAllSkieurs() {
        return skieurRepository.findAll();
    }

    @Override
    public Skieur addSkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }

    @Override
    public void removeSkieur(Long numSkieur) {
        skieurRepository.deleteById(numSkieur);
    }

    @Override
    public Skieur retrieveSkieur(Long numSkieur) {
        return skieurRepository.findById(numSkieur).orElse(null);
    }

    @Override
    public Set<Skieur> assignSkierToPiste(Long numSkieur, Long numPiste) {
        Piste piste = pisteRepository.findById(numPiste).orElse(null);
        Skieur skieur =retrieveSkieur(numSkieur);
        if (skieur ==null || piste == null) {
            return null;
        }
        piste.getSkieurSet().add(skieur);
        pisteRepository.save(piste);
        return piste.getSkieurSet();
    }
}
