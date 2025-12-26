package com.example.demo.service.impl;

import com.example.demo.model.InteractionRule;
import com.example.demo.repository.InteractionRuleRepository;
import com.example.demo.service.RuleService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RuleServiceImpl implements RuleService {

    private final InteractionRuleRepository repository;

    public RuleServiceImpl(InteractionRuleRepository repository) {
        this.repository = repository;
    }

    @Override
    public InteractionRule addRule(InteractionRule rule) {
        Long idA = rule.getIngredientA().getId();
        Long idB = rule.getIngredientB().getId();

        if (repository.findRuleBetweenIngredients(idA, idB).isPresent()) {
            throw new IllegalArgumentException("Rule already exists for these ingredients");
        }

        String severity = rule.getSeverity();
        if (!severity.equals("MINOR") && !severity.equals("MODERATE") && !severity.equals("MAJOR")) {
            throw new IllegalArgumentException("Severity must be MINOR, MODERATE, or MAJOR");
        }

        return repository.save(rule);
    }

    @Override
    public List<InteractionRule> getAllRules() {
        return repository.findAll();
    }
}
