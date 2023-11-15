package com.mycompany.springboot.springbootproject.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Dossier implements Serializable{

    private static final long serialVersionUID = -6994514366L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, name = "id_contribuable")
    private Long idContribuable;
    private Long type;
    @Column(nullable = false, name = "date_creation")
    private LocalDateTime dateCreation;
    @Column(nullable = false, name="id_operateur_creation")
    private Long idOperateurCreation;
    private String recommendation;
    private String commentaire;
    private LocalDate dateDebut;
    private boolean active;


    public Dossier() {
    }

    public Dossier(Long id, Long idContribuable, Long type, LocalDateTime dateCreation, Long idOperateurCreation, String recommendation, String commentaire, LocalDate dateDebut, boolean active) {
        this.id = id;
        this.idContribuable = idContribuable;
        this.type = type;
        this.dateCreation = dateCreation;
        this.idOperateurCreation = idOperateurCreation;
        this.recommendation = recommendation;
        this.commentaire = commentaire;
        this.dateDebut = dateDebut;
        this.active = active;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdContribuable() {
        return this.idContribuable;
    }

    public void setIdContribuable(Long idContribuable) {
        this.idContribuable = idContribuable;
    }

    public Long getType() {
        return this.type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public LocalDateTime getDateCreation() {
        return this.dateCreation;
    }

    public void setDateCreation(LocalDateTime dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Long getIdOperateurCreation() {
        return this.idOperateurCreation;
    }

    public void setIdOperateurCreation(Long idOperateurCreation) {
        this.idOperateurCreation = idOperateurCreation;
    }

    public String getRecommendation() {
        return this.recommendation;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    public String getCommentaire() {
        return this.commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public LocalDate getDateDebut() {
        return this.dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public boolean isActive() {
        return this.active;
    }

    public boolean getActive() {
        return this.active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

}
