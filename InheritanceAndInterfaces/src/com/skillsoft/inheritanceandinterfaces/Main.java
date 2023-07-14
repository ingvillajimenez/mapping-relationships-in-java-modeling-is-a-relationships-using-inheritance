package com.skillsoft.inheritanceandinterfaces;

public class Main {
    public static void main(String[] args) {

        NonFictionBook sapiens = new NonFictionBook();
        Book book = new NonFictionBook();
        Object object = new NonFictionBook();

        System.out.println("sapiens is instance of NonFictionBook: " + (sapiens instanceof NonFictionBook));
        System.out.println("sapiens is instance of Book: " + (sapiens instanceof Book));
        System.out.println("sapiens is instance of Object: " + (sapiens instanceof Object));

        System.out.println("\nbook is instance of NonFictionBook: " + (book instanceof NonFictionBook));
        System.out.println("book is instance of Book: " + (book instanceof Book));
        System.out.println("book is instance of Object: " + (book instanceof Object));

        System.out.println("\nobject is instance of NonFictionBook: " + (object instanceof NonFictionBook));
        System.out.println("object is instance of Book: " + (object instanceof Book));
        System.out.println("object is instance of Object: " + (object instanceof Object));

        System.out.println();

        sapiens.checkOutBook();
        sapiens.displayType();

        System.out.println();

        book.checkOutBook();
        ((NonFictionBook) book).displayType();

        ((Book) object).checkOutBook();
        ((NonFictionBook) object).displayType();

//        Book headFirstJava = new Book();
//        NonFictionBook sapiens = new NonFictionBook();
//
//        System.out.println("headFirstJava binding type: " + headFirstJava.getBindingType());
//        headFirstJava.checkOutBook();
//
//        System.out.println("sapiens binding type: " + sapiens.getBindingType());
//        sapiens.checkOutBook();
//
//        System.out.println();
//
//        System.out.println("\nsapiens subject: " + sapiens.getSubject());
//        sapiens.displayType();
//
//        System.out.println("\nheadFirstJava subject: " + headFirstJava.getSubject());
//        headFirstJava.displayType();

    }
}