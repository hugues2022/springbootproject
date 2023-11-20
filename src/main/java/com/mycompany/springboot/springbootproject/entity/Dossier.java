package com.mycompany.springboot.springbootproject.entity;

import java.io.Serializable;
import java.time.LocalDate;

import com.mycompany.springboot.springbootproject.common.EntityGeneric;
import com.mycompany.springboot.springbootproject.common.constant.TypeVerification;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;


@Entity
public class Dossier extends EntityGeneric implements Serializable{

    private static final long serialVersionUID = -6994514366L;    
    
    @Column(nullable = false, name = "id_contribuable")
    private Long idContribuable;
    
    @Enumerated(EnumType.ORDINAL)
    private TypeVerification type;    
    private String recommendation;
    private String commentaire;
    private LocalDate dateDebut;
    private boolean active;
    private int origine;

    public Long getIdContribuable() {
        return this.idContribuable;
    }

    public void setIdContribuable(Long idContribuable) {
        this.idContribuable = idContribuable;
    }

    public TypeVerification getType() {
        return this.type;
    }

    public void setType(TypeVerification type) {
        this.type = type;
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

    public int getOrigine() {
        return this.origine;
    }

    public void setOrigine(int origine) {
        this.origine = origine;
    }

}
