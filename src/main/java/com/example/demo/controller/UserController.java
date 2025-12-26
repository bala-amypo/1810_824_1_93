package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService crs;

    public UserController(UserService crs) {
        this.crs = crs;
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return crs.register(user);
    }

    @GetMapping("/{email}")
    public User findEmail(@PathVariable String email) {
        return crs.findByEmail(email);
    }
}
