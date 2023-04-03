package tn.esprit.ski.Controller;

import org.springframework.web.bind.annotation.*;
import tn.esprit.ski.Entity.Piste;
import tn.esprit.ski.Service.IPisteService;
import tn.esprit.ski.Service.PisteService;

import java.util.List;

@RestController
public class PisteController {
    IPisteService iPisteService;
    public PisteController(IPisteService iPisteService) {
        this.iPisteService = iPisteService;
    }
    @PostMapping("/piste")
    Piste addPiste( @RequestBody Piste piste) {
        return iPisteService.addPiste(piste);
    }
    @GetMapping("listePiste")
    List<Piste> retrieveAllPistes() {
        return iPisteService.retrieveAllPistes();
    }

    @PutMapping("/pisteModif")
    Piste updatePiste (@RequestBody Piste piste){
        return iPisteService.updatePiste(piste);
    }

    @GetMapping("piste/{numPiste}")
    Piste retrievePiste(@PathVariable Long numPiste){
        return iPisteService.retrievePiste(numPiste);
    }

}
