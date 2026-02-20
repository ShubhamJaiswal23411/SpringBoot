package com.example.custom_annotation.example;

/*
 * This example demonstrates how to define and use a custom annotation in Java.
 *
 * 1. @Target(ElementType.TYPE)
 *    - Restricts the annotation to be used only on classes, interfaces, or enums.
 *
 * 2. @Retention(RetentionPolicy.RUNTIME)
 *    - Makes the annotation available at runtime.
 *    - This allows it to be accessed using reflection.
 *
 * CustomAnnotation:
 * - A user-defined annotation without any elements.
 *
 * SampleClass:
 * - Annotated with @CustomAnnotation.
 * - Uses reflection to retrieve all annotations present on the class.
 * - Since the class is annotated and retention policy is RUNTIME,
 *   the annotation will be printed when the program runs.
 *
 * Expected Output:
 * - The fully qualified name of CustomAnnotation will be displayed.
 */

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomAnnotation {
    // this is a custom annotation.
}

@CustomAnnotation
class SampleClass {

    public static void main(String[] args) {
        Annotation[] annotations = SampleClass.class.getAnnotations();
        for (Annotation curAnnotation : annotations) {
            System.out.println(curAnnotation.toString());
        }
    }
}