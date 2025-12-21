package com.example.demo.service.implement;

import com.example.demo.repository.ActiveIngredientRepository;
import com.example.demo.repository.MedicationRepository;
import com.example.demo.Entityclass.Medication;
import com.example.demo.Entityclass.ActiveIngredient;
import com.example.demo.service.CatalogService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public CatalogImp extends CatalogService{

 @Autowired
 MedicationRepository medi;
 @Autowired
 ActiveIngredienteRepository acti;

 public ActiveIngredient addIngredient(ActiveIngredient ingredient)
 {
    return acti.save(ingredient);
 }
 public Medication addMedication(Medication medication)
 {
    return medi.save(medication);
 }

}