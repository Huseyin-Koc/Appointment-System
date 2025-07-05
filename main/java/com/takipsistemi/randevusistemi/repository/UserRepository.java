package com.takipsistemi.randevusistemi.repository;

import com.takipsistemi.randevusistemi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email); // Login için kullanılacak
}
