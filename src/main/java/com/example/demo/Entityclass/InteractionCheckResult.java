package com.example.demo.Entityclass;


public class InteractionCheckResult
{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String medications;
    private LocalDateTime checkedAt;

   public Long getId()
   {
    return id;
   }
   public void  setId(Long id)
   {
    this.id=id;
   }
   public String getMedications()
   {
    return medications;
   }
   p

}