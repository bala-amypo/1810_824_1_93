package com.example.demo.Entityclass;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class ActiveIngredient()
{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(unique=true)
    private String name;
}