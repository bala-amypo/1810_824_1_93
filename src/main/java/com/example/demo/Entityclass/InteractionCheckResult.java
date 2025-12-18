package com.example.demo.Entityclass;

import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import java.time.LocalDateTime;
import jakarta.persistence.Entity;

@Entity
public class InteractionCheckResult
{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String medications;
    private String interactions;
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
   public void setMedications(String medications)
   {
    this.medications=medications;
   }
   public String getInteractions()
   {
    return interactions;
   }
   public void setInteractions(String interactions)
   {
    this.interactions=interactions;
   }
   public LocalDateTime getCheckedAt()
   {
    return checkedAt;
   }
   public void setCheckedAt(LocalDateTime checkedAt)
   {
    this.checkedAt=checkedAt;
   }
   public InteractionCheckResult(Long id,String medications,String interactions)
   {

     this.id=id;
     this.medications=medications;
     this.interactions=interactions;
     this.checkedAt=checkedAt;
   }

public InteractionCheckResult()
{

}
}