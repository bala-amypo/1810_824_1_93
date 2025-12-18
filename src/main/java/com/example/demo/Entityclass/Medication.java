package com.example.demo.Entityclass;

public class Medication
{
    @Id;
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String ingredients;

}