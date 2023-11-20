package com.mycompany.springboot.springbootproject.entity;

import java.io.Serializable;

import com.mycompany.springboot.springbootproject.common.EntityGeneric;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class DossierMembre extends EntityGeneric implements Serializable{
    
    private static final long serialVersionUID = 1896288847L;
   
    @Column(name = "id_dossier")
    private Long idDossier;
    @Column(name = "id_fonctionnaire")
    private Long idFonctionnaire;


}
