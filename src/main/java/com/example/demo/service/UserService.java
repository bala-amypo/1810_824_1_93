package com.example.demo.service;

import com.example.demo.model.User;


public interface UserService{
    User addRule(User rule);
    User findByEmail(String email);
}
