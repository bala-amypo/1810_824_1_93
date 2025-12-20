package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.demo.Entityclass.User;
import com.example.demo.service.UserService;
import java.util.List;


@RestController
public class UserController{
    @Autowired
    UserService crs;
    @PostMapping("/rules")
    public User rules(@RequestBody User rule)
    {
        return crs.addRule(rule);
    }
    @GetMapping("/user/{id}")
public User getUser(@PathVariable Long id) {
    return userService.getUserById(id).orElse(null);
}


}