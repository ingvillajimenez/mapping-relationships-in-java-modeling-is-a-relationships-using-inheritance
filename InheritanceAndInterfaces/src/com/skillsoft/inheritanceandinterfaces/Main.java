package com.skillsoft.inheritanceandinterfaces;

public class Main {
    public static void main(String[] args) {

        Book headFirstJava = new Book();
        System.out.println("headFirstJava binding type: " + headFirstJava.getBindingType());
        headFirstJava.checkOutBook();

        System.out.println();

        Book effectiveJava = new Book();
        System.out.println("effectiveJava binding type: " + effectiveJava.getBindingType());
        effectiveJava.checkOutBook();

        System.out.println();

        System.out.println("headFirstJava's class: " + headFirstJava.getClass());
        System.out.println("effectiveJava's class: " + effectiveJava.getClass());

        System.out.println();

        Object headFirstJavaObject = headFirstJava;
        Object effectiveJavaObject = effectiveJava;

        System.out.println("headFirstJavaObject's class: " + headFirstJavaObject.getClass());
        System.out.println("effectiveJavaObject's class: " + effectiveJavaObject.getClass());

        System.out.println();

        System.out.println("headFirstJava binding type: " + headFirstJavaObject.getBindingType());
        headFirstJavaObject.checkOutBook();

        System.out.println("effectiveJava binding type: " + effectiveJavaObject.getBindingType());
        effectiveJavaObject.checkOutBook();

    }
}