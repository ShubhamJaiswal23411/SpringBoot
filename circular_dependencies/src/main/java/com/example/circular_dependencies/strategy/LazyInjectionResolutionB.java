package com.example.circular_dependencies.strategy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class LazyInjectionResolutionB {

    
    private LazyInjectionResolutionA lazyInjectionResolutionA;

    public LazyInjectionResolutionB(@Lazy LazyInjectionResolutionA lazyInjectionResolutionA) {
        this.lazyInjectionResolutionA = lazyInjectionResolutionA;
    }

}
