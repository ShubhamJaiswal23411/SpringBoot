package com.example.custom_annotation.example.bean_injection_when_multiple_impl.service.impl;

import org.springframework.stereotype.Service;

import com.example.custom_annotation.example.bean_injection_when_multiple_impl.CustomQualiferAnnotation.PaypalQuailfier;
import com.example.custom_annotation.example.bean_injection_when_multiple_impl.service.PaymentService;

@Service
@PaypalQuailfier
public class PaypalPaymentService implements PaymentService{

    @Override
    public void pay() {
        System.out.println("Payment done through paypal");
    }

}
