package com.example.demo.service.implement;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.Entityclass.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import java.util.List;
import java.util.Optional;


@Service
public class UserImp implements UserService{

    @Autowired
    UserRepository user;
    @Override
    public User addRule(User rule)
    {
        return user.save(rule);
    }
    @Override
    public  User findByEmail(String email)
    {
    // Optional<User>rule=user.findByEmail(email);
    return user.findByEmail(email);
      
    } 
} 