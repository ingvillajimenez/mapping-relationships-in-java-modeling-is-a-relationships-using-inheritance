package com.skillsoft.inheritanceandinterfaces;

public class Main {
    public static void main(String[] args) {

        NonFictionBook sapiens = new NonFictionBook();
        NonFictionBook onTheOriginOfSpecies = new NonFictionBook();

        System.out.println("sapiens subject: " + sapiens.getSubject());
        sapiens.displayType();

        System.out.println("onTheOriginOfSpecies subject: " + onTheOriginOfSpecies.getSubject());
        onTheOriginOfSpecies.displayType();

        System.out.println();

        System.out.println("sapiens binding type: " + sapiens.getBindingType());
        sapiens.checkOutBook();

        System.out.println("onTheOriginOfSpecies binding type: " + onTheOriginOfSpecies.getBindingType());
        onTheOriginOfSpecies.checkOutBook();

        System.out.println();

        System.out.println("sapiens's class: " + sapiens.getClass());
        System.out.println("onTheOriginOfSpecies's class: " + onTheOriginOfSpecies.getClass());

//        System.out.println("\nsapiens instanceof NonFictionBook: " +
//                (sapiens instanceof NonFictionBook));
//        System.out.println("sapiens instanceof Book: " +
//                (sapiens instanceof Book));
//        System.out.println("sapiens instanceof Object: " +
//                (sapiens instanceof Object));
//
//        System.out.println("\nonTheOriginOfSpecies instanceof NonFictionBook: " +
//                (onTheOriginOfSpecies instanceof NonFictionBook));
//        System.out.println("onTheOriginOfSpecies instanceof Book: " +
//                (onTheOriginOfSpecies instanceof Book));
//        System.out.println("onTheOriginOfSpecies instanceof Object: " +
//                (onTheOriginOfSpecies instanceof Object));
    }
}