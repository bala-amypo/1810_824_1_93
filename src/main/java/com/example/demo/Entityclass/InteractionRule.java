package com.example.demo.Entityclass;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class InteractionRule{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String ingredientA;
    private String ingredientB;
    private String severity;
    private String description;
    
   public Long getId()
   {
    return id;
   }
   public void  setId(Long id)
   {
    this.id=id;
   }
   public String getIngredientA()
   {
    return ingredientA;
   }
   public void setIngredientA(String ingredientA)
   {
    this.ingredientA=ingredientA;
   }
   public String getIngredientB()
   {
    return ingredientB;
   }
   public void setIngredientB(String ingredientB)
   {
    this.ingredientB=ingredientB;
   }
   public String getSeverity()
   {
    return severity;
   }
   public void setSeverity(String severity)
   {
    this.severity=severity;
   }
   public String getDesccription()
   {
    return description;
   }
   public void setDescription(String description)
   {
    this.description=description;
   }
   public InteractionRule(Long id,String ingredientA,String ingredientB,String severity,String description )
   {
    this.id=id;
    this.ingredientA=ingredientA;
    this.ingredientB=ingredientB;
    this.severity=severity;
    this.description=description;
   }
   public InteractionRule()
   {
    
   }
    
}