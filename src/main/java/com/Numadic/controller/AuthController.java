package com.Numadic.controller;

import com.Numadic.model.JwtAuthenticationResponse;
import com.Numadic.model.LoginRequest;
import com.Numadic.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<?> authenticateUser(@RequestBody LoginRequest loginRequest) {
        // Authenticate the user
        UserDetails userDetails = authService.authenticateUser(loginRequest.getUsername(), loginRequest.getPassword());

        // Return a ResponseEntity with the UserDetails object
        return ResponseEntity.ok(userDetails);
    }

    // Other authentication-related endpoints like registration, password reset, etc. can be added here
}
