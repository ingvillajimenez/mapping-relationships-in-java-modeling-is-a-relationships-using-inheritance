package com.skillsoft.inheritanceandinterfaces;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Book headFirstJava = new Book();
        String string = new String("A string");
        Date date = new Date("7/11/2021");
        Object object = new Object();

        System.out.println("Is headFirstJava an instance of Book Class?: " + (headFirstJava instanceof Book));
        System.out.println("Is string an instance of String Class?: " + (string instanceof String));
        System.out.println("Is date an instance of Date Class?: " + (date instanceof Date));
        System.out.println("Is object an instance of Object Class?: " + (object instanceof Object));

        System.out.println("\nIs object an instance of Book Class?: " + (object instanceof Book));
        System.out.println("Is object an instance of String Class?: " + (object instanceof String));
        System.out.println("Is object an instance of Date Class?: " + (object instanceof Date));

        System.out.println("\nIs headFirstJava an instance of Object Class?: " + (headFirstJava instanceof Object));
        System.out.println("Is string an instance of Object Class?: " + (string instanceof Object));
        System.out.println("Is date an instance of Object Class?: " + (date instanceof Object));

//        System.out.println("\nIs headFirstJava an instance of String Class?: " + (headFirstJava instanceof String));
//        System.out.println("\nIs date an instance of String Class?: " + (date instanceof String));
//        System.out.println("Is string an instance of Book Class?: " + (string instanceof Book));
    }
}