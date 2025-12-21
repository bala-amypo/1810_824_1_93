package com.example.demo.service.implement;

import 

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