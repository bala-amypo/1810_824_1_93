package com.example.demo.service;

import com.example.demo.Entityclass.InteractionCheckResult;


public interface InteractionService{

    InteractionCheckResult checkInteractions(InteractionCheckResult medicationIds);
    InteractionCheckResult getResult(Long resultId);
}