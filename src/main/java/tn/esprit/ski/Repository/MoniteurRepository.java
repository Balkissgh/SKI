package tn.esprit.ski.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ski.Entity.Moniteur;

public interface MoniteurRepository extends JpaRepository<Moniteur, Long> {
}
