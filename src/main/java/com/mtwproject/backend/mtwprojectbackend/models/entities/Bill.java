package com.mtwproject.backend.mtwprojectbackend.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity 
@Table(name = "BILL")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Bill {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_bill;
    private String Series;
    private String Number;
    private String Date;
    private String Subtotal;
    private String IGV;
    private String Total;
    private Long id_moneda;       
}