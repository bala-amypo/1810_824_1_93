package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import java.util.List;


@RestController
public class UserController{
    @Autowired
    UserService crs;
    @PostMapping("/users")
public User createUser(@RequestBody User user)
{
    return crs.addRule(user);
}

    @GetMapping("/{email}")
    public User findemail(@PathVariable String email)
    {
        return crs.findByEmail(email);
    }

}