package com.example.demo.service;

import com.example.demo.Entityclass.User;
import java.util.List;

public interface UserService{
    User addRule(User rule)
    List<User>getAllRules();
}