package tn.esprit.ski.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ski.Entity.Piste;

public interface PisteRepository  extends JpaRepository<Piste,Long>  {
}
