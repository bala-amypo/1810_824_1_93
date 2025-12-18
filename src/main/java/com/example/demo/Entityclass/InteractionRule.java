package com.example.demo.Entityclass;

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
   public void setName(String ingredientA)
   {
    this.ingredientA=ingredientA;
   }
   public String getName()
   {
    return name;
   }
   public void setName(String name)
   {
    this.name=name;
   }
    
}