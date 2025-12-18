package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entityclass.InteractionCheckResult;

public interface InteractionCheckResultRepository extends JpaRepository<InteractionCheckResult,Long>
{

}