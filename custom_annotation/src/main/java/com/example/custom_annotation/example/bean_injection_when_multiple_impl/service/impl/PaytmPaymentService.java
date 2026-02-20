package com.example.custom_annotation.example.bean_injection_when_multiple_impl.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.custom_annotation.example.bean_injection_when_multiple_impl.service.PaymentService;

@Primary
@Service
public class PaytmPaymentService implements PaymentService{

    @Override
    public void pay() {
        System.out.println("Payment done through paytm which is the default and primary bean");
    }

}
