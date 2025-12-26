package com.example.demo.service.impl;

import com.example.demo.model.InteractionCheckResult;
import com.example.demo.repository.InteractionCheckResultRepository;
import com.example.demo.service.InteractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class InteractionServiceImpl implements InteractionService {

    @Autowired
    private InteractionCheckResultRepository interactionCheckResultRepository;

    public InteractionServiceImpl() {}

    public InteractionServiceImpl(InteractionCheckResultRepository interactionCheckResultRepository) {
        this.interactionCheckResultRepository = interactionCheckResultRepository;
    }

    @Override
    public InteractionCheckResult checkInteractions(List<Long> medicationIds) {
        
        InteractionCheckResult result = new InteractionCheckResult();
        result.setMedications(medicationIds.toString());
        result.setInteractions(""); // implement real logic if needed
        return interactionCheckResultRepository.save(result);
    }

    @Override
    public InteractionCheckResult getResult(Long resultId) {
        return interactionCheckResultRepository.findById(resultId).orElse(null);
    }
}
