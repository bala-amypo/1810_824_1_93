package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.service.RuleService;
import com.example.demo.Entityclass.InteractionRule;

@RestController
public class RuleController{

@Autowired
RuleService run;

@PostMapping("/inter")
public InteractionRule addRule(@RequestBody InteractionRule rule)
{
    return run.addRule(rule);
}
@GetMapping("/")
public List<InteractionRule>getAllRules()
{
    return  run.getAllRules();
}

}