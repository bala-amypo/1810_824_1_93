package com.example.demo.Entityclass;


public class user{
    @Id
    private Long id;
    String name;
    @column(unique=true)
    String email;
    String password;
    String role;
    
    public Long getId()
    {
        return id;
    }
    public void setId(Long id)
    {
        this.id=id;
    }
    public String getId()
    {
        return name;
    }
    public void setId(String name)
    {
        this
    }
}