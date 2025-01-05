package org.example.voitureservice.repository;

import org.example.voitureservice.entity.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoitureRepository extends JpaRepository<Voiture, Long> {
}