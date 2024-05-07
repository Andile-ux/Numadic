package com.Numadic.model;

// Vehicle.java

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "vehicles")
public class Vehicle implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String registrationNumber;

    // Other vehicle properties like make, model, year, etc. can be added here

    // Getters and setters
}
