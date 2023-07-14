package com.skillsoft.inheritanceandinterfaces;

public class Main {
    public static void main(String[] args) {

        Book headFirstJava = new Book();
        NonFictionBook sapiens = new NonFictionBook();
        FictionBook lifeOfPi = new FictionBook();
        TextBook effectiveJava = new TextBook();

        System.out.println("headFirstJava binding type: " + headFirstJava.bindingType);
        System.out.println("sapiens binding type: " + sapiens.bindingType);
        System.out.println("lifeOfPi binding type: " + lifeOfPi.bindingType);
        System.out.println("effectiveJava binding type: " + effectiveJava.bindingType);

        System.out.println();

        headFirstJava.checkOutBook();
        sapiens.checkOutBook();
        lifeOfPi.checkOutBook();
        effectiveJava.checkOutBook();

        System.out.println();

        headFirstJava.setBindingType("Paperback");
        sapiens.setBindingType("Hardcover");
        lifeOfPi.setBindingType("Leather");

        System.out.println("headFirstJava binding type (updated): " + headFirstJava.getBindingType());
        System.out.println("sapiens binding type (updated): " + sapiens.getBindingType());
        System.out.println("lifeOfPi binding type (updated): " + lifeOfPi.getBindingType());
        System.out.println("effectiveJava binding type: " + effectiveJava.getBindingType());

        System.out.println();

        System.out.println("sapiens subject is: " + sapiens.getSubject());
        System.out.println("lifeOfPi plot is: " + lifeOfPi.getPlot());
        System.out.println("effectiveJava course is: " + effectiveJava.getCourse());

        System.out.println();

        sapiens.displayType();
        lifeOfPi.displayType();
        effectiveJava.displayType();

        System.out.println();

    }
}