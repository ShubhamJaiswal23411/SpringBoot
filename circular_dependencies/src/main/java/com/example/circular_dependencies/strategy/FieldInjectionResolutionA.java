package com.example.circular_dependencies.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FieldInjectionResolutionA {
    
    
    @Autowired  // this auto wired is necessary spring does not inject dependencies unless specifically told through autowired
    private FieldInjectionResolutionB b ;

}
