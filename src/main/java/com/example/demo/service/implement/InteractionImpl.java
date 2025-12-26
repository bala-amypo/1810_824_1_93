package com.example.demo.service.implement;

import com.example.demo.model.InteractionCheckResult;
import com.example.demo.repository.InteractionCheckResultRepository;
import com.example.demo.service.InteractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InteractionImpl implements InteractionService {

    @Autowired
    private InteractionCheckResultRepository rep;

    @Override
    public InteractionCheckResult checkInteractions(
            InteractionCheckResult medicationIds) {
        return rep.save(medicationIds);
    }

    @Override
    public InteractionCheckResult getResult(Long resultId) {
        return rep.findById(resultId).orElse(null);
    }
}
