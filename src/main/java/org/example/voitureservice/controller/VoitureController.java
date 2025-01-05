package org.example.voitureservice.controller;

import org.example.voitureservice.entity.Voiture;
import org.example.voitureservice.service.VoitureService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/voitures")
@CrossOrigin
public class VoitureController {
    private final VoitureService voitureService;

    public VoitureController(VoitureService voitureService) {
        this.voitureService = voitureService;
    }

    @GetMapping("")
    public List<Voiture> getAllVoitures() {
        return voitureService.getAllVoitures();
    }

    @PostMapping
    public Voiture addVoiture(@RequestBody Voiture voiture) {
        return voitureService.addVoiture(voiture);
    }

    @GetMapping("/{id}")
    public Voiture getVoitureById(@PathVariable Long id) {
        return voitureService.getVoitureById(id);
    }
}

