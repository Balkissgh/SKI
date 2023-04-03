package tn.esprit.ski.Service;

import org.springframework.stereotype.Service;
import tn.esprit.ski.Entity.Moniteur;
import tn.esprit.ski.Repository.MoniteurRepository;

import java.util.List;

@Service
public class MoniteurService implements IMoniteurService {
    MoniteurRepository moniteurRepository;

    public MoniteurService(MoniteurRepository moniteurRepository) {
        this.moniteurRepository = moniteurRepository;
    }

    @Override
    public Moniteur addMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }

    @Override
    public List<Moniteur> retrieveAllMoniteurs() {
        return moniteurRepository.findAll();
    }

    @Override
    public Moniteur updateMoniteur(Moniteur moniteur) {
        return  moniteurRepository.save(moniteur);
    }

    @Override
    public Moniteur retrieveMoniteur(Long numMoniteur) {
        return moniteurRepository.findById(numMoniteur).orElse(null);
    }
}
