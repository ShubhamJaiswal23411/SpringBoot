package com.example.custom_annotation.example.bean_injection.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.custom_annotation.example.bean_injection.service.PaymentService;

@Primary
@Service
public class PaytmPaymentService implements PaymentService{

    @Override
    public void pay() {
        System.out.println("Payment done through paytm which is the default and primary bean");
    }

}
