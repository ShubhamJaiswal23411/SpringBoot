package com.example.custom_annotation.example;

/*
 * Demonstrates a custom annotation with default values.
 * - Defaults are used if no values are provided.
 * - Values can be overridden when applying the annotation.
 * - Annotation elements are implicitly public and abstract; they cannot be private or protected.
 * - Values can be accessed at runtime using reflection.
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomAnnotationWithValues {
    String value() default "current";
    int ttl() default 100;
}

@CustomAnnotationWithValues
class UsageClass {

    public void printDefaultAnnotationValue() {
        CustomAnnotationWithValues annotation =
                UsageClass.class.getAnnotation(CustomAnnotationWithValues.class);

        if (annotation != null) {
            System.out.println(annotation.value() + " " + annotation.ttl());
        }
    }
}

@CustomAnnotationWithValues(value = "test", ttl = 50)
class CustomUsageClass {

    public static void main(String[] args) {
        UsageClass u = new UsageClass();
        u.printDefaultAnnotationValue();

        CustomAnnotationWithValues annotation =
                CustomUsageClass.class.getAnnotation(CustomAnnotationWithValues.class);

        if (annotation != null) {
            System.out.println(annotation.value() + " " + annotation.ttl());
        }
    }
}