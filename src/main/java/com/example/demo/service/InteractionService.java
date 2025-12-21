package com.example.demo.service;

import com.example.demo.Entityclass.InteractionCheckResult;

import java.util.List;
public interface InteractionService{

    List<InteractionCheckResult> checkInteractions(InteractionCheckResult medicationIds);
    InteractionCheckResult getResult(Long resultId);
}