package com.skillsoft.inheritanceandinterfaces;

public class Main {
    public static void main(String[] args) {

        Book headFirstJava = new Book();

        System.out.println("String representation: " + headFirstJava.toString());
        System.out.println("Class: " + headFirstJava.getClass());
        System.out.println("Hash code: " + headFirstJava.hashCode());

        Book effectiveJava = new Book();

        System.out.println("\nString representation of another book: " + effectiveJava.toString());
        System.out.println("Are they equal?: " + headFirstJava.equals(effectiveJava));

        Book headFirstJavaCopy = headFirstJava;

        System.out.println("\nString representation of copy: " + headFirstJavaCopy.toString());
        System.out.println("Is the copy equal to the original?: " + headFirstJava.equals(headFirstJavaCopy));
    }
}