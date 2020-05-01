package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        Book book1 = bookManager.createBook("Zawód tester", "Radosław Smilgin");
        Book book2 = bookManager.createBook("Tester oprogramowania", "Karolina Zmitrowicz");

        if (book1 == book2) {
            System.out.println("book1 ma ten sam adres co book2 - BookManager działa niepoprawnie");
        } else {
            System.out.println("book1 ma inny adres niż book2 - BookManager działa poprawnie");
        }

        Book book3 = bookManager.createBook("Zawód tester", "Radosław Smilgin");
        if (book1 == book3) {
            System.out.println("book1 ma ten sam adres co book3 - BookManager działa poprawnie");
        } else {
            System.out.println("book1 ma inny adres niż book3 - BookManager działa niepoprawnie.");
        }
    }
}

