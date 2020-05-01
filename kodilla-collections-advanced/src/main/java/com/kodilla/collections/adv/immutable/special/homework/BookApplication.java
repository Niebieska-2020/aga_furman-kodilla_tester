package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        BookManager bookstore = new BookManager();
        Book book1 = bookstore.createBook("Zawód tester", "Radosław Smilgin");
        Book book2 = bookstore.createBook("Tester oprogramowania", "Karolina Zmitrowicz");
        Book book3 = bookstore.createBook("Drive", "Daniel H.Pink");

        System.out.println(book1 == book2);
        System.out.println(book1.equals(book3));
        System.out.println(bookstore.getSize());
        Book book4 = bookstore.createBook("Zawód tester", "Radosław Smilgin");
        System.out.println(bookstore.getSize());
        System.out.println(book1 == book4);
        System.out.println(book1.hashCode());
        System.out.println(book4.hashCode());
    }
}

