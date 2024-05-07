package com.Numadic.services;

// LocationService.java

import com.Numadic.model.Location;
import com.Numadic.repositories.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {

    @Autowired
    private LocationRepository locationRepository;

    public Location getLatestLocationForVehicle(Long vehicleId) {
        List<Location> locations = locationRepository.findByVehicleIdOrderByTimestampDesc(vehicleId);
        return locations.isEmpty() ? null : locations.get(0);
    }

    // Other methods for location management (e.g., saving new locations, retrieving location history) can be added here
}
