package com.example.custom_annotation.example.bean_injection_when_multiple_impl.usage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.custom_annotation.example.bean_injection_when_multiple_impl.service.PaymentService;

@Service
public class QualifierUsage {

    @Qualifier("googlePayPaymentService")
    @Autowired
    private PaymentService paymentService;

    public void makePayment(){
        paymentService.pay();
    }
}
