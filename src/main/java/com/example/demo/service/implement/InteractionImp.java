package com.example.demo.service.implement;

import com.example.demo.Entityclass.InteractionCheckResult;
import com.example.demo.repository.InteractionCheckResultRepository;
import com.example.demo.service.InteractionService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class InteractionImp implements InteractionService{

@Autowired
InteractionCheckResultRepository rep;
  public InteractionCheckResult checkInteractions(InteractionCheckResult medicationIds )
  {
  return rep.save(medicationIds);
  }
  public InteractionCheckResult getResult(Long resultId)
  {
        return rep.findById(resultId).orElse(null);
  }

}
