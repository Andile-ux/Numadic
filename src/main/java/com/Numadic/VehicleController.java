package com.Numadic;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

    @PostMapping("/register")
    public ResponseEntity<String> registerVehicle(@RequestBody Vehicle vehicle) {
        // Logic to register the vehicle
        // For simplicity, let's assume we just return a success message
        return ResponseEntity.ok("Vehicle registered successfully");
    }

    @GetMapping("/{vehicleId}/location")
    public ResponseEntity<Location> getVehicleLocation(@PathVariable String vehicleId) {
        // Logic to fetch the location of the vehicle with the given ID
        // For simplicity, let's assume we return a hardcoded location
        Location location = new Location(37.7749, -122.4194, "San Francisco, CA");
        return ResponseEntity.ok(location);
    }
}
