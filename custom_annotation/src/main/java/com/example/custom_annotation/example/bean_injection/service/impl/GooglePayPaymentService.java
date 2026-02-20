package com.example.custom_annotation.example.bean_injection.service.impl;

import org.springframework.stereotype.Service;

import com.example.custom_annotation.example.bean_injection.service.PaymentService;

@Service
public class GooglePayPaymentService implements PaymentService{

    @Override
    public void pay() {
        System.out.println("payment done through googlepay");
    }

}
