package com.example.custom_annotation.example.bean_injection_when_multiple_impl.service.impl;

import org.springframework.stereotype.Service;

import com.example.custom_annotation.example.bean_injection_when_multiple_impl.service.PaymentService;

@Service
public class GooglePayPaymentService implements PaymentService{

    @Override
    public void pay() {
        System.out.println("payment done through googlepay");
    }

}
