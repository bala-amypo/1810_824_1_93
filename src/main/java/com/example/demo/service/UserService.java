package com.example.demo.service;

import com.example.demo.Entityclass.User;


public interface UserService{
    User addRule(User rule);
    User findByEmail();
}