package com.example.circular_dependencies.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetterInjectionResolutionB {
    private SetterInjectionResolutionA setterInjectionResolutionA;

    @Autowired
    public void setSetterInjectionResolutionA(SetterInjectionResolutionA setterInjectionResolutionA) {
        this.setterInjectionResolutionA = setterInjectionResolutionA;
    }

}
