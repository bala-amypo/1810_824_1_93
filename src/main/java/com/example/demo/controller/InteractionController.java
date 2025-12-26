package com.example.demo.controller;

import com.example.demo.model.InteractionCheckResult;
import com.example.demo.service.InteractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class InteractionController {

    @Autowired
    private InteractionService inter;

    @PostMapping("/hello")
    public InteractionCheckResult checkInteractions(
            @RequestBody InteractionCheckResult result) {
        return inter.checkInteractions(result);
    }

    @GetMapping("/result/{id}")
    public InteractionCheckResult getResult(
            @PathVariable Long id) {
        return inter.getResult(id);
    }
}
