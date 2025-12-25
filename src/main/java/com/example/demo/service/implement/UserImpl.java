package com.example.demo.service.implement;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import java.util.List;
import java.util.Optional;


@Service
public class UserImpl implements UserService{

    @Autowired
    UserRepository user;
    
    public User addRule(User rule)
    {
        return user.save(rule);
    }
    
    public  User findByEmail(String email)
    {
    
    return user.findByEmail(email).orElse(null);
      
    } 
} 