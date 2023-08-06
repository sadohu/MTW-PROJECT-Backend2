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
@Table(name = "PASSENGER")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Passenger {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_passenger;
    private String names;
    private String lastnames;
    private Long id_distrit;
    private String Adress;
    private String Phone;
  

}