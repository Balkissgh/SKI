package tn.esprit.ski.Service;

import tn.esprit.ski.Entity.Piste;

import java.util.List;

public interface IPisteService {
   Piste addPiste(Piste piste) ;
   List<Piste> retrieveAllPistes();
   Piste updatePiste (Piste piste);
   Piste retrievePiste (Long numPiste);
}
