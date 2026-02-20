package com.example.custom_annotation.example.bean_injection.usage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.custom_annotation.example.bean_injection.PaypalQuailfier;
import com.example.custom_annotation.example.bean_injection.service.PaymentService;

@Service
public class CustomQualifier {

    @PaypalQuailfier
    @Autowired
    private PaymentService payment;

    public void makePayment(){
        payment.pay();
    }
}
