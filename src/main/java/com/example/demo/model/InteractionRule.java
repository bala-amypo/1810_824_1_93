package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(
    uniqueConstraints = {
        @UniqueConstraint(columnNames = {"ingredient_a_id", "ingredient_b_id"})
    }
)
public class InteractionRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ingredient_a_id", nullable = false)
    private ActiveIngredient ingredientA;

    @ManyToOne
    @JoinColumn(name = "ingredient_b_id", nullable = false)
    private ActiveIngredient ingredientB;

    private String severity;  
    private String description;

    public InteractionRule() {}

    public InteractionRule(Long id,
                           ActiveIngredient ingredientA,
                           ActiveIngredient ingredientB,
                           String severity,
                           String description) {
        this.id = id;
        this.ingredientA = ingredientA;
        this.ingredientB = ingredientB;
        this.severity = severity;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ActiveIngredient getIngredientA() {
        return ingredientA;
    }

    public void setIngredientA(ActiveIngredient ingredientA) {
        this.ingredientA = ingredientA;
    }

    public ActiveIngredient getIngredientB() {
        return ingredientB;
    }

    public void setIngredientB(ActiveIngredient ingredientB) {
        this.ingredientB = ingredientB;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
