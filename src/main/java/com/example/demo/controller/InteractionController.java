package com.example.demo.controller;

import com.example.demo.model.InteractionCheckResult;
import com.example.demo.service.InteractionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/interactions")
public class InteractionController {

    private final InteractionService inter;

    public InteractionController(InteractionService inter) {
        this.inter = inter;
    }

    @PostMapping("/check")
    public InteractionCheckResult checkInteractions(
            @RequestBody List<Long> medicationIds) {
        return inter.checkInteractions(medicationIds);
    }

    @GetMapping("/{resultId}")
    public InteractionCheckResult getResult(
            @PathVariable Long resultId) {
        return inter.getResult(resultId);
    }
}
