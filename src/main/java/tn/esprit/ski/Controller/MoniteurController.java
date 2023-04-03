package tn.esprit.ski.Controller;

import org.springframework.web.bind.annotation.*;
import tn.esprit.ski.Entity.Moniteur;
import tn.esprit.ski.Service.IMoniteurService;

import java.util.List;

@RestController
public class MoniteurController {
    IMoniteurService  iMoniteurService;

    public MoniteurController(IMoniteurService iMoniteurService) {
        this.iMoniteurService = iMoniteurService;
    }
    @PostMapping("/moniteur")
    Moniteur addMoniteur(@RequestBody  Moniteur moniteur) {
        return iMoniteurService.addMoniteur(moniteur);
    }
     @GetMapping("/ListMoniteur")
     List<Moniteur> retrieveAllMoniteurs() {
          return iMoniteurService.retrieveAllMoniteurs();
    }

    @PostMapping("/update/{numMoniteur}")
    Moniteur updateMoniteur( @RequestBody Moniteur moniteur) {
        return iMoniteurService.updateMoniteur(moniteur);}

    @GetMapping("/afficher/{numMoniteur}")
    Moniteur retrieveMoniteur( @PathVariable Long numMoniteur) {
            return iMoniteurService.retrieveMoniteur(numMoniteur);
    }
}
