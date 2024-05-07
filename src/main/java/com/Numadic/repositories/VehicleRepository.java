package com.Numadic.repositories;

// VehicleRepository.java

import com.Numadic.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

    // You can add custom query methods here if needed
}

