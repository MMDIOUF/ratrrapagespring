package ism.ratrrapage.api.controllers;


import ism.ratrrapage.api.dto.InscriptionDto;
import ism.ratrrapage.api.services.InscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inscriptions")
@CrossOrigin("http://localhost:4200")
public class InscriptionRestController {


    @Autowired
    private InscriptionService inscriptionService;

    @GetMapping
    @ResponseBody
    public ResponseEntity<List<InscriptionDto>> getAllInscriptions(){
        List<InscriptionDto> body=inscriptionService.getAllInscription();
        if (body.isEmpty())
            throw new RuntimeException("Pas de Module disponible");
        return  new ResponseEntity<>(body, HttpStatus.OK);

    }
}
