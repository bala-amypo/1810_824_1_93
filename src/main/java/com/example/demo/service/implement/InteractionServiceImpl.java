package com.example.demo.service.impl;

import com.example.demo.model.InteractionCheckResult;
import com.example.demo.repository.InteractionCheckResultRepository;
import com.example.demo.service.InteractionService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class InteractionServiceImpl implements InteractionService {

    private final InteractionCheckResultRepository repository;

    public InteractionServiceImpl(InteractionCheckResultRepository repository) {
        this.repository = repository;
    }

    @Override
    public InteractionCheckResult checkInteractions(List<Long> medicationIds) {
        InteractionCheckResult result = new InteractionCheckResult();
        result.setMedications(medicationIds.toString());
        result.setInteractions("Sample interactions");
        return repository.save(result);
    }

    @Override
    public InteractionCheckResult getResult(Long resultId) {
        return repository.findById(resultId).orElse(null);
    }
}
