package org.example.voitureservice.service;


import org.example.voitureservice.entity.Voiture;
import org.example.voitureservice.repository.VoitureRepository;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class VoitureService {
    private final VoitureRepository voitureRepository;

    public VoitureService(VoitureRepository voitureRepository) {
        this.voitureRepository = voitureRepository;
    }

    public List<Voiture> getAllVoitures() {
        return voitureRepository.findAll();
    }

    public Voiture addVoiture(Voiture voiture) {
        return voitureRepository.save(voiture);
    }

    public Voiture getVoitureById(Long id) {
        return voitureRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Voiture not found with id: " + id));
    }
    @FeignClient(name = "voiture-service", url = "http://localhost:8082")
    public interface VoitureFeignClient {
        @GetMapping("/api/voiture")
        List<Voiture> getVoitures();
    }
}
