package com.example.demo.service.implement;

import com.example.demo.model.InteractionRule;
import com.example.demo.repository.InteractionRuleRepository;
import com.example.demo.service.RuleService;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RuleImpl implements RuleService {

    private final InteractionRuleRepository rep;

    
    public RuleImp(InteractionRuleRepository rep) {
        this.rep = rep;
    }

    @Override
    public InteractionRule addRule(InteractionRule rule) {

        Long idA = rule.getIngredientA().getId();
        Long idB = rule.getIngredientB().getId();

        
        if (rep.findRuleBetweenIngredients(idA, idB).isPresent()) {
            throw new IllegalArgumentException(
                "Interaction rule already exists for these ingredients"
            );
        }

        
        String severity = rule.getSeverity();
        if (!severity.equals("MINOR") &&
            !severity.equals("MODERATE") &&
            !severity.equals("MAJOR")) {
            throw new IllegalArgumentException(
                "Severity must be MINOR, MODERATE, or MAJOR"
            );
        }

        return rep.save(rule);
    }

    @Override
    public List<InteractionRule> getAllRules() {
        return rep.findAll();
    }
}
