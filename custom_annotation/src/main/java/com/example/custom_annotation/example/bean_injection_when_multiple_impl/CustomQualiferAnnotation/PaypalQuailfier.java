package com.example.custom_annotation.example.bean_injection_when_multiple_impl.CustomQualiferAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier
@Target({ElementType.FIELD,ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface PaypalQuailfier{

}