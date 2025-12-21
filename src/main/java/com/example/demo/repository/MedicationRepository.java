package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entityclass.Medication;

public interface MedicationRepository extends JpaRepository<Medication,Long>{

}