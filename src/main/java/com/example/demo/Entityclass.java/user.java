package com.example.demo.Entityclass;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
public class user{
    @Id
    private Long id;
    private String name;
    @column(unique=true)
    private String email;
    private String password;
    private String role;
    
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
        this.name=name;
    }
    public String getId()
    {
        return email;
    }
    public void setId(String email)
    {
        this.email=email;
    }
    public String getId()
    {
        return password;
    }
    public void setId(String password)
    {
        this.password=password;
    }
    public String getId()
    {
        return role;
    }
    public void setId(String role)
    {
        this.role=role;
    }
}