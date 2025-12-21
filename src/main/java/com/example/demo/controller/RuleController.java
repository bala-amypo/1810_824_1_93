package com.example.demo.controller;

@RestController
public class RuleController{

@Autowired
RuleService run;

@PostMapping("/inter")
public InteractionRule addRule(InteractionRule rule)
{
    return run.addRule(rule);
}
@GetMapping("/")
public List

}