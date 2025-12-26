package com.example.demo.service.impl;

import com.example.demo.model.InteractionRule;
import com.example.demo.repository.InteractionRuleRepository;
import com.example.demo.service.RuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RuleServiceImpl implements RuleService {

    @Autowired
    private InteractionRuleRepository interactionRuleRepository;

    
    public RuleServiceImpl() {}

    public RuleServiceImpl(InteractionRuleRepository interactionRuleRepository) {
        this.interactionRuleRepository = interactionRuleRepository;
    }

    @Override
    public InteractionRule addRule(InteractionRule rule) {
        Long idA = rule.getIngredientA().getId();
        Long idB = rule.getIngredientB().getId();

        if (interactionRuleRepository.findRuleBetweenIngredients(idA, idB).isPresent()) {
            throw new IllegalArgumentException("Interaction rule already exists for these ingredients");
        }

        String severity = rule.getSeverity();
        if (!severity.equals("MINOR") && !severity.equals("MODERATE") && !severity.equals("MAJOR")) {
            throw new IllegalArgumentException("Severity must be MINOR, MODERATE, or MAJOR");
        }

        return interactionRuleRepository.save(rule);
    }

    @Override
    public List<InteractionRule> getAllRules() {
        return interactionRuleRepository.findAll();
    }
}
