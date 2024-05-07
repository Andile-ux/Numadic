package com.Numadic.services;

// VehicleService.java

import com.Numadic.model.Location;
import com.Numadic.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Autowired
    private LocationService locationService;

    public Location getVehicleLocation(Long vehicleId) {
        // You might add additional validation or business logic here
        return locationService.getLatestLocationForVehicle(vehicleId);
    }

    // Other methods for vehicle tracking functionality can be added here
}
