package com.example.demo.service;

import com.example.demo.Entityclass.Medication;
import com.example.demo.Entityclass.ActiveIngredient;
import java.util.List;

public interface CatalogService {
       
       ActiveIngredient addIngredient(ActiveIngredient ingredient);
       Medication addMedication(Medication medication);
       List<Medication> getAllMedications();
       
}