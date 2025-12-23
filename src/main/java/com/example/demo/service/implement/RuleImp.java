package com.example.demo.service.implement;

import org.springframework.stereotype.Service;
import com.example.demo.Entityclass.InteractionRule;
import com.example.demo.repository.InteractionRuleRepository;
import com.example.demo.service.RuleService;

import java.util.List;

@Service
public class RuleImp implements RuleService {

    private final InteractionRuleRepository rep;

    public RuleImp(InteractionRuleRepository rep) {
        this.rep = rep;
    }

    @Override
    public InteractionRule addRule(InteractionRule rule) {

        
        Long aId = rule.getIngredientA().getId();
        Long bId = rule.getIngredientB().getId();

        if (aId > bId) {
            var temp = rule.getIngredientA();
            rule.setIngredientA(rule.getIngredientB());
            rule.setIngredientB(temp);
        }

       
        if (rep.existsByIngredientAAndIngredientB(
                rule.getIngredientA(),
                rule.getIngredientB())) {
            throw new IllegalArgumentException(
                "Interaction rule already exists"
            );
        }

      
        String severity = rule.getSeverity();
        if (!severity.equals("MINOR") &&
            !severity.equals("MODERATE") &&
            !severity.equals("MAJOR")) {
            throw new IllegalArgumentException(
                "Invalid severity value"
            );
        }

        return rep.save(rule);
    }

    @Override
    public List<InteractionRule> getAllRules() {
        return rep.findAll();
    }
}
