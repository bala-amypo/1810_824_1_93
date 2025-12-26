package com.example.demo.controller;

import com.example.demo.model.ActiveIngredient;
import com.example.demo.model.Medication;
import com.example.demo.service.CatalogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/catalog")
public class CatalogController {

    private final CatalogService cata;

    public CatalogController(CatalogService cata) {
        this.cata = cata;
    }

    @PostMapping("/active")
    public ActiveIngredient ingredient(@RequestBody ActiveIngredient ingredient) {
        return cata.addIngredient(ingredient);
    }

    @PostMapping("/medication")
    public Medication medication(@RequestBody Medication medication) {
        return cata.addMedication(medication);
    }

    @GetMapping("/medications")
    public List<Medication> getAllMedications() {
        return cata.getAllMedications();
    }
}
