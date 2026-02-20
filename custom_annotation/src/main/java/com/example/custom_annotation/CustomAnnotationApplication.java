package com.example.custom_annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.custom_annotation.example.bean_injection_when_multiple_impl.usage.CustomQualifierUsage;
import com.example.custom_annotation.example.bean_injection_when_multiple_impl.usage.PrimaryUsage;
import com.example.custom_annotation.example.bean_injection_when_multiple_impl.usage.QualifierUsage;

@SpringBootApplication
public class CustomAnnotationApplication {
	
	// shows ways to inject a bean when multiple implementations exist.
	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(CustomAnnotationApplication.class, args);
		run.getBean(CustomQualifierUsage.class).makePayment();//autowiring through custom annotation
		run.getBean(QualifierUsage.class).makePayment();//autowiring through magic string and qualifier
		run.getBean(PrimaryUsage.class).makePayment();//autowiring through primary
	}

}
