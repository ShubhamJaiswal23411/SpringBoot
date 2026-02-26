package com.example.circular_dependencies.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FieldInjectionResolutionA {
    
    
    @Autowired
    private FieldInjectionResolutionB b ;

}
