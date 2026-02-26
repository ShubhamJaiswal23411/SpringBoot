package com.example.circular_dependencies.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetterInjectionResolutionA {

    private SetterInjectionResolutionB setterInjectionResolutionB;

    @Autowired
    public void setSetterInjectionResolutionB(SetterInjectionResolutionB setterInjectionResolutionB) {
        this.setterInjectionResolutionB = setterInjectionResolutionB;
    }

}
