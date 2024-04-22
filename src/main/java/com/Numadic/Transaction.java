package com.Numadic;

import javax.persistence.*;

@Entity
@Table(name = "transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long vehicleId;
    private String type; // trip, refill, maintenance, payment
    // other fields, constructors, getters, setters
}
