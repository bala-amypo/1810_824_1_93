package com.example.demo.Entityclass;


public class user{
    @Id
    private Long id;
    String name;
    @column(unique=true)
    String email;
    String password;
    String role;
}