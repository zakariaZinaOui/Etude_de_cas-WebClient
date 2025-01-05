package org.example.voitureservice.dto;

public class VoitureDTO {
    private Long id;
    private String marque;
    private String modele;
    private Integer annee;

    public VoitureDTO() {}

    public VoitureDTO(Long id, String marque, String modele, Integer annee) {
        this.id = id;
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public Integer getAnnee() {
        return annee;
    }

    public void setAnnee(Integer annee) {
        this.annee = annee;
    }
} 