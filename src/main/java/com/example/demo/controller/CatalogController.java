package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.demo.service.CatalogService;
import com.example.demo.Entityclass.ActiveIngredient;
import com.example.demo.Entityclass.Medication;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
public class  CatalogController
{

@Autowired
CatalogService cata;
@PostMapping("/active")
public ActiveIngredient ingredient(@RequestBody ActiveIngredient ingredient)
{
    return cata.addIngredient(ingredient);
}
@PostMapping("/medi")
public Medication medication(@RequestBody Medication medication)
{
    return cata.addMedication(medication);
}
@GetMapping("/")
public List<Medication>getallmedications()
{
    return cata.getAllMedications();
}

} 