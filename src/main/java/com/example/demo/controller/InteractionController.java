package com.example.demo.conntroller;

import com.example.demo.Entityclass.InteractionCheckResult;
import com.example.demo.service.InteractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class InteractionController{

@Autowired
InteractionService inter;
@PostMapping("/hello")
public  InteractionCheckResult checkInteractions(@RequestBody InteractionCheckResult medicationIds)
{
    return inter.checkInteractions();
}
@GetMapping("///")
public InteractionCheckResult getResult(Long resultId)
{
    return inter.getResult();
}

}