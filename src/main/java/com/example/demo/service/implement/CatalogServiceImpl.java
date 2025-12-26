package com.example.demo.service.impl;

import com.example.demo.model.ActiveIngredient;
import com.example.demo.model.Medication;
import com.example.demo.repository.ActiveIngredientRepository;
import com.example.demo.repository.MedicationRepository;
import com.example.demo.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    private ActiveIngredientRepository activeIngredientRepository;

    @Autowired
    private MedicationRepository medicationRepository;

    // No-arg constructor for tests
    public CatalogServiceImpl() {}

    // Constructor with repositories
    public CatalogServiceImpl(ActiveIngredientRepository activeIngredientRepository,
                              MedicationRepository medicationRepository) {
        this.activeIngredientRepository = activeIngredientRepository;
        this.medicationRepository = medicationRepository;
    }

    @Override
    public ActiveIngredient addIngredient(ActiveIngredient ingredient) {
        if (activeIngredientRepository.existsByName(ingredient.getName())) {
            throw new IllegalArgumentException("Ingredient already exists");
        }
        return activeIngredientRepository.save(ingredient);
    }

    @Override
    public Medication addMedication(Medication medication) {
        if (medication.getIngredients() == null || medication.getIngredients().isEmpty()) {
            throw new IllegalArgumentException("Medication must contain at least one ingredient");
        }
        return medicationRepository.save(medication);
    }

    @Override
    public List<Medication> getAllMedications() {
        return medicationRepository.findAll();
    }
}
