package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class UserController {

    @Autowired
    private UserService crs;

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return crs.createUser(user);   // ✅ FIX IS HERE
    }

    @GetMapping("/users/{email}")
    public User findemail(@PathVariable String email) {
        return crs.findByEmail(email);
    }
}
