package com.example.custom_annotation.example;

/*
 * This example demonstrates the use of custom annotations in Java,
 * specifically the @Target, @Retention, and @Inherited meta-annotations.
 *
 * 1. @Target
 *    - Specifies where the annotation can be applied.
 *    - It accepts an array of ElementType values.
 *    - If multiple ElementType values are required, they must be written
 *      inside curly braces, e.g. {ElementType.TYPE, ElementType.ANNOTATION_TYPE}.
 *
 * 2. @Retention(RetentionPolicy.RUNTIME)
 *    - Ensures the annotation is available at runtime.
 *    - This allows reflection to access the annotation information.
 *
 * 3. @Inherited
 *    - When an annotation marked with @Inherited is applied to a class,
 *      it is automatically inherited by all subclasses.
 *
 * In this example:
 * - ParentClass is annotated with @InheritableAnnotation.
 * - ChildClass extends ParentClass but does NOT explicitly declare the annotation.
 * - Because of @Inherited, ChildClass automatically has the same annotation.
 *
 * When both main methods are executed, the output shows that both
 * ParentClass and ChildClass contain the same annotation,
 * even though the child class does not explicitly define it.
 */

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface InheritableAnnotation {

}

@InheritableAnnotation
class ParentClass {

    public static void main(String[] args) {
        Annotation[] annotations = ParentClass.class.getAnnotations();
        for (Annotation curAnnotation : annotations) {
            System.out.println("Parent Annotations : "+curAnnotation.toString());
        }
    }
}

class ChildClass extends ParentClass {

    public static void main(String[] args) {
        ParentClass.main(new String[1]);
        Annotation[] annotations = ChildClass.class.getAnnotations();
        for (Annotation curAnnotation : annotations) {
            System.out.println("Child Annotations : "+curAnnotation.toString());
        }
    }
}