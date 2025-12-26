package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService crs;

    @PostMapping("/users")
    public User registerUser(@RequestBody User user) {
        
        return crs.register(user);
    }

    @GetMapping("/users/{email}")
    public User findByEmail(@PathVariable String email) {
        return crs.findByEmail(email);
    }
}
