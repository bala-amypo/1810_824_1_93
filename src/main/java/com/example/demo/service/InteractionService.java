package com.example.demo.service;

import com.example.demo.model.InteractionCheckResult;

import java.util.List;
public interface InteractionService {

    InteractionCheckResult checkInteractions(InteractionCheckResult medicationIds);
    InteractionCheckResult getResult(Long resultId);
}
