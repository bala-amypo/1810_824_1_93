package com.example.demo.controller;

import com.example.demo.model.InteractionCheckResult;
import com.example.demo.service.InteractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;

@RestController
public class InteractionController {

    @Autowired
    private InteractionService inter;

    @PostMapping("/interactions/check")
    public InteractionCheckResult checkInteractions(@RequestBody List<Long> medicationIds) {
        // Now accepts List<Long> instead of InteractionCheckResult
        return inter.checkInteractions(medicationIds);
    }

    @GetMapping("/interactions/{resultId}")
    public InteractionCheckResult getResult(@PathVariable Long resultId) {
        return inter.getResult(resultId);
    }
}
