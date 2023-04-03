package tn.esprit.ski.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ski.Entity.Piste;
import tn.esprit.ski.Repository.PisteRepository;

import java.util.List;

@Service
public class PisteService implements  IPisteService {
PisteRepository pisteRepository;

    public PisteService(PisteRepository pisteRep) {
        this.pisteRepository= pisteRep;
    }

    @Override
    public Piste addPiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public List<Piste> retrieveAllPistes() {
        return pisteRepository.findAll();
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return pisteRepository.save(piste);
    }


    @Override
    public Piste retrievePiste(Long numPiste) {
        return pisteRepository.findById(numPiste).orElse(null);
    }
}
