package com.example.demo.service.implement;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.Entityclass.InteractionRule;
import com.example.demo.repository.InteractionRuleRepository;
import com.example.demo.service.RuleService;
import com.example.demo.Entityclass.InteractionRule;

@Service
public class RuleImp implements RuleService{

@Autowired
InteractionRuleRepository rep;

public InteractionRule addRule(InteractionRule rule)
{
    return rep.save(rule);
}

public List<InteractionRule>getAllRules()
{
    return rep.findAll();
}
}