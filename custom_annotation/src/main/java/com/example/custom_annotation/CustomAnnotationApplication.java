package com.example.custom_annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.custom_annotation.example.bean_injection.usage.CustomQualifier;
import com.example.custom_annotation.example.bean_injection.usage.NormalQualifier;
import com.example.custom_annotation.example.bean_injection.usage.Primary;

@SpringBootApplication
public class CustomAnnotationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(CustomAnnotationApplication.class, args);
		run.getBean(CustomQualifier.class).makePayment();//autowiring through custom annotation
		run.getBean(NormalQualifier.class).makePayment();//autowiring through magic string and qualifier
		run.getBean(Primary.class).makePayment();//autowiring through primary
	}

}
