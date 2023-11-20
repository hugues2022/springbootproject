package com.mycompany.springboot.springbootproject.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.mycompany.springboot.springbootproject.common.EntityGeneric;
import com.mycompany.springboot.springbootproject.common.constant.EtapeVerification;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tbl_activity")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Activity extends EntityGeneric implements Serializable{
    

    private static final long serialVersionUID = 6994592244L;
    

    @Column(name = "id_dossier")
    private Long idDossier;
   
    @Enumerated(EnumType.ORDINAL)
    private EtapeVerification etape;
    
    @Column(length = 255)
    private String description;
   
    @Column(name = "prev_start_date")
    private Date prevStartDate;
    
    @Column(name = "prev_end_date")
    private Date prevEndDate;

    @Enumerated(EnumType.ORDINAL)
    private ActivityStatus status;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "activity")
    private List<ActivityStatus> listeStatus;

}
