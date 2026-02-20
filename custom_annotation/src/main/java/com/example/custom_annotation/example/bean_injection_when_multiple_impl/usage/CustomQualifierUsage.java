package com.example.custom_annotation.example.bean_injection_when_multiple_impl.usage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.custom_annotation.example.bean_injection_when_multiple_impl.CustomQualiferAnnotation.PaypalQuailfier;
import com.example.custom_annotation.example.bean_injection_when_multiple_impl.service.PaymentService;

@Service
public class CustomQualifierUsage {

    @PaypalQuailfier
    @Autowired
    private PaymentService payment;

    public void makePayment(){
        payment.pay();
    }
}
