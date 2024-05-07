package com.Numadic.repositories;

// LocationRepository.java

import com.Numadic.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {

    List<Location> findByVehicleIdOrderByTimestampDesc(Long vehicleId);

    // You can add custom query methods here if needed
}
