package com.example.demo.repository;

import com.example.demo.Entityclass.ActiveIngredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActiveIngredientRepository extends JpaRepository<ActiveIngredient,Long>
{

}