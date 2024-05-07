package com.Numadic.controller;

import com.Numadic.model.Location;
import com.Numadic.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.parsing.Location;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @GetMapping("/{vehicleId}/location")
    public ResponseEntity<?> getVehicleLocation(@PathVariable Long vehicleId) {
        Location location = vehicleService.getVehicleLocation(vehicleId);
        if (location != null) {
            return ResponseEntity.ok(location);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Other endpoints for vehicle tracking functionality like updating location, getting route history, etc. can be added here
}
