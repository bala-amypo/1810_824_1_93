package com.example.demo.service.implement;

import com.example.demo.repository.ActiveIngredientRepository;
import com.example.demo.repository.MedicationRepository;
import com.example.demo.Entityclass.Medication;
import com.example.demo.Entityclass.ActiveIngredient;
import com.example.demo.service.CatalogService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;


@Service
public class CatalogImp implements CatalogService{
 @Autowired
 ActiveIngredientRepository acti;

 @Override
 public ActiveIngredient addIngredient(ActiveIngredient ingredient)
 {
    return acti.save(ingredient);
 }
 @Autowired
 MedicationRepository medi;
   @Override
 public Medication addMedication(Medication medication)
 {
    return medi.save(medication);
 }
  @Override
 public List<Medication> getAllMedications(){
    return medi.findAll();
 }

}