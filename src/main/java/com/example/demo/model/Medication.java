package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import java.util.Set;
import java.util.HashSet;

@Entity
public class Medication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany
    @JoinTable(
        name = "medication_ingredient",
        joinColumns = @JoinColumn(name = "medication_id"),
        inverseJoinColumns = @JoinColumn(name = "ingredient_id")
    )
    private Set<ActiveIngredient> ingredients = new HashSet<>();

    public Medication() {
    }

    public Medication(String name) {
        this.name = name;
    }

    public Medication(Long id, String name, Set<ActiveIngredient> ingredients) {
        this.id = id;
        this.name = name;
        this.ingredients = ingredients;
    }

    public void addIngredient(ActiveIngredient ingredient) {
        this.ingredients.add(ingredient);
    }

    public void removeIngredient(ActiveIngredient ingredient) {
        this.ingredients.remove(ingredient);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<ActiveIngredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<ActiveIngredient> ingredients) {
        this.ingredients = ingredients;
    }
}
