package com.example.demo.service.implement;

import org.springframework.sterotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class UserImp implements UserService{

    @Autowired
    UserRepository user;;
    public User addRule(User rule)
    {
        return user.save(rule);
    }
    public List<User> getAllRules()
    {
        return user.findAll();
    }
} 