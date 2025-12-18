package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework

@RestController
public class UserController{
    @Autowired
    UserService crs;
    @PostMapping("/rules")
    public User rules(@RequestBody User rule)
    {
        return crs.addRule(rule);
    }
    @GetMapping
    public List<User> getrules()
    {
        return crs.getAllRules;
    }

}