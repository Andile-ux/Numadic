package com.Numadic.repositories;

import com.Numadic.model.User;

// UserRepository.java

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);

    // You can add custom query methods here if needed
}
