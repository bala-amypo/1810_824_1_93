package com.example.demo.Entityclass;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class ActiveIngredient
{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(unique=true)
    private String name;

   public Long getId()
   {
    return id;
   }
   public void  setId(Long id)
   {
    this.id=id;
   }
   public String getName()
   {
    return name;
   }
   public void setName(String name)
   {
    this.name=name;
   }
   public ActiveIngredient(Long id,String name)
   {
    this.id=id;
    this.name=name;
   }
   public ActiveIngredient()
   {
    
   }

}