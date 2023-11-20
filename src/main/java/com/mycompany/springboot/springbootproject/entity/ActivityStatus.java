package com.mycompany.springboot.springbootproject.entity;

import java.io.Serializable;

import com.mycompany.springboot.springbootproject.common.EntityGeneric;
import com.mycompany.springboot.springbootproject.common.constant.StatusType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tbl_activity_status")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ActivityStatus extends EntityGeneric implements Serializable{
    
    private static final long serialVersionUID = 2808256604L;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "id_activity")
    private Activity activity;
    @Enumerated(EnumType.ORDINAL)
    private StatusType status;
    private String description;

}
