package com.example.circular_dependencies.strategy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class LazyInjectionResolutionA {

    private LazyInjectionResolutionB lazyInjectionResolutionB;

    public LazyInjectionResolutionA(LazyInjectionResolutionB lazyInjectionResolutionB) {
        this.lazyInjectionResolutionB = lazyInjectionResolutionB;
    }

}
