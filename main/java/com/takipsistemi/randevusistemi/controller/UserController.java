package com.takipsistemi.randevusistemi.controller;

import com.takipsistemi.randevusistemi.model.User;
import com.takipsistemi.randevusistemi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    // ✅ Kullanıcı kaydı
    @PostMapping("/register")
    public User registerUser(@ModelAttribute User user) {
        return userService.registerUser(user);
    }


    // ✅ Tüm kullanıcıları getir
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // ✅ E-mail'e göre kullanıcı getir
    @GetMapping("/by-email")
    public User getUserByEmail(@RequestParam String email) {
        return userService.getUserByEmail(email);
    }
}