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
    @ManyToOne;
    @JoinColumn("ingredient_id");
    private ActiveIngredient ingredientA;
    @ManyToOne;
    @JoinColumn("ingredient_id1");
    private ActiveIngredient ingredientB;
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
   public ActiveIngredient getIngredientA()
   {
    return ingredientA;
   }
   public void setIngredientA(ActiveIngredient ingredientA)
   {
    this.ingredientA=ingredientA;
   }
   public ActiveIngredient getIngredientB()
   {
    return ingredientB;
   }
   public void setIngredientB(ActiveIngredient ingredientB)
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
   public InteractionRule(Long id,ActiveIngredient ingredientA,ActiveIngredient ingredientB,String severity,String description )
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