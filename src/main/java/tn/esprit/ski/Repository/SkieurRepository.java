package tn.esprit.ski.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ski.Entity.Skieur;

public interface SkieurRepository extends JpaRepository<Skieur, Long> {
}
