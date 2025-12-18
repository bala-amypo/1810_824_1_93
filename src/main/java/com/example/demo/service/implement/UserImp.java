package com.example.demo.service.implement;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.Entityclass.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;


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