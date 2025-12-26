package com.example.demo.service.implement;

import com.example.demo.model.ActiveIngredient;
import com.example.demo.model.Medication;
import com.example.demo.repository.ActiveIngredientRepository;
import com.example.demo.repository.MedicationRepository;
import com.example.demo.service.CatalogService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CatalogImpl implements CatalogService {

    private final ActiveIngredientRepository acti;
    private final MedicationRepository medi;

    public CatalogImpl(
            ActiveIngredientRepository acti,
            MedicationRepository medi) {
        this.acti = acti;
        this.medi = medi;
    }

    @Override
    public ActiveIngredient addIngredient(ActiveIngredient ingredient) {

        if (acti.existsByName(ingredient.getName())) {
            throw new IllegalArgumentException("Ingredient already exists");
        }

        return acti.save(ingredient);
    }

    @Override
    public Medication addMedication(Medication medication) {

        if (medication.getIngredients() == null ||
            medication.getIngredients().isEmpty()) {
            throw new IllegalArgumentException(
                    "Medication must contain at least one ingredient"
            );
        }

        return medi.save(medication);
    }

    @Override
    public List<Medication> getAllMedications() {
        return medi.findAll();
    }
}
