package com.skillsoft.inheritanceandinterfaces;

public class Main {
    public static void main(String[] args) {

        Book headFirstJava = new Book();
        Book effectiveJava = new Book();
        Book javaCookbook = new Book();

        System.out.println("Is headFirstJava an instance of Book Class?: " + (headFirstJava instanceof Book));
        System.out.println("Is effectiveJava an instance of Book Class?: " + (effectiveJava instanceof Book));
        System.out.println("Is javaCookbook an instance of Book Class?: " + (javaCookbook instanceof Book));

        System.out.println();

        System.out.println("Is headFirstJava an instance of Object Class?: " + (headFirstJava instanceof Object));
        System.out.println("Is effectiveJava an instance of Object Class?: " + (effectiveJava instanceof Object));
        System.out.println("Is javaCookbook an instance of Object Class?: " + (javaCookbook instanceof Object));

        System.out.println();

        Object headFirstJavaObject = headFirstJava;
        Object effectiveJavaObject = effectiveJava;
        Object javaCookbookObject = javaCookbook;

        System.out.println("Is headFirstJavaObject an instance of Book Class?: " +
                (headFirstJavaObject instanceof Book));
        System.out.println("Is effectiveJavaObject an instance of Book Class?: " +
                (effectiveJavaObject instanceof Book));
        System.out.println("Is javaCookObject an instance of Book Class?: " +
                (javaCookbookObject instanceof Book));

        System.out.println();

        System.out.println("headFirstJava's class: " + headFirstJava.getClass());
        System.out.println("effectiveJava's class: " + effectiveJava.getClass());
        System.out.println("javaCookbook's class: " + javaCookbook.getClass());

        System.out.println();

        System.out.println("headFirstJavaObject's class: " + headFirstJavaObject.getClass());
        System.out.println("effectiveJavaObject's class: " + effectiveJavaObject.getClass());
        System.out.println("javaCookbookObject's class: " + javaCookbookObject.getClass());

        System.out.println();
    }
}