package com.example.demo.Entityclass;

public class Medication
{
    @Id;
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String ingredients;

    public Long getId()
    {
        return id;
    }
    public void setId(Long id)
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
    public String getIngredients()
   {
    return ingredients;
   }
   public void setIngredients(String ingredients)
   {
    this.ingredients=ingredients;
   }
   public Medication(Long id,String name,String ingredients){
    this.id=id;
    this.name=name;
    this.ingredients=ingredients;

   }
   public Medication()
   {
    
   }


}