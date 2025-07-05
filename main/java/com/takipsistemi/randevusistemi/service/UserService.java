package com.takipsistemi.randevusistemi.service;

import com.takipsistemi.randevusistemi.model.User;
import com.takipsistemi.randevusistemi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Tüm kullanıcıları getir
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Email'e göre kullanıcı getir
    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    // Yeni kullanıcı kaydet
    public User registerUser(User user) {
        return userRepository.save(user);
    }

    // ID'ye göre kullanıcı getir
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }
}
