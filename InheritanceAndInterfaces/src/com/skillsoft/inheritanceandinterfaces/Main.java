package com.skillsoft.inheritanceandinterfaces;

public class Main {
    public static void main(String[] args) {

        NonFictionBook sapiens = new NonFictionBook();
        Book sapiensBook = sapiens;
        Object sapiensObject = sapiens;

        System.out.println("sapiens class: " + sapiens.getClass());
        System.out.println("sapiensBook class: " + sapiensBook.getClass());
        System.out.println("sapiensObject class: " + sapiensObject.getClass());

        System.out.println();

        Book onTheOriginOfSpeciesBook = new NonFictionBook();

        NonFictionBook onTheOriginOfSpecies = (NonFictionBook) onTheOriginOfSpeciesBook;
        Object onTheOriginOfSpeciesObject = onTheOriginOfSpeciesBook;

        System.out.println("onTheOriginOfSpecies class: " + onTheOriginOfSpecies.getClass());
        System.out.println("onTheOriginOfSpeciesBook class: " + onTheOriginOfSpeciesBook.getClass());
        System.out.println("onTheOriginOfSpeciesObject class: " + onTheOriginOfSpeciesObject.getClass());

        System.out.println();

        Object effectiveJavaObject = new NonFictionBook();

        Book effectiveJavaBook = (Book) effectiveJavaObject;
        NonFictionBook effectiveJava = (NonFictionBook) effectiveJavaObject;

        System.out.println("effectiveJava class: " + effectiveJava.getClass());
        System.out.println("effectiveJavaBook class: " + effectiveJavaBook.getClass());
        System.out.println("effectiveJavaObject class: " + effectiveJavaObject.getClass());

        System.out.println();
    }
}