package org.example.voitureservice;

import org.example.voitureservice.entity.Voiture;
import org.example.voitureservice.repository.VoitureRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class VoitureServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(VoitureServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner initDatabase(VoitureRepository voitureRepository) {
        return args -> {
            voitureRepository.save(new Voiture("Toyota", "Corolla", 2020));
            voitureRepository.save(new Voiture("BMW", "X5", 2019));
            voitureRepository.save(new Voiture("Audi", "A4", 2021));
        };
    }
}
