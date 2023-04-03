package tn.esprit.ski.Controller;

import org.springframework.web.bind.annotation.*;
import tn.esprit.ski.Entity.Skieur;
import tn.esprit.ski.Service.ISkieurService;

import java.util.List;
import java.util.Set;

@RestController
public class SkieurController {
    ISkieurService iSkieurService;

    public SkieurController(ISkieurService iSkieurService) {
        this.iSkieurService = iSkieurService;
    }
    @GetMapping("/listSkieur")
    List<Skieur> retrieveAllSkieurs() {
        return iSkieurService.retrieveAllSkieurs();}
    @PostMapping("/skieur")
    Skieur addSkieur( @RequestBody Skieur skieur) {
        return iSkieurService.addSkieur(skieur);
    }
    @DeleteMapping("/delete/{numSkieur}")
    void removeSkieur ( @PathVariable Long numSkieur){
        iSkieurService.removeSkieur(numSkieur);
    }
    @GetMapping("/afficherSkieur/{numSkieur}")
    Skieur retrieveSkieur( @PathVariable Long numSkieur) {
        return iSkieurService.retrieveSkieur(numSkieur);
    }

    @PostMapping("skieur/{idskieur}/assign/piste/{idpiste}")
    Set<Skieur> assignSkierToPiste(@PathVariable("idskieur") Long numSkieur, @PathVariable("idpiste") Long numPiste) {
        return iSkieurService.assignSkierToPiste(  numSkieur,  numPiste);

    }
}
