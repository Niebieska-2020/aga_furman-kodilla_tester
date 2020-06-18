package com.kodilla.soap.repository;

import com.kodilla.courses.soap_library.Book;
import com.kodilla.courses.soap_library.Genre;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class BookRepository {
    private static final Map<String, Book> books = new HashMap<>();
    @PostConstruct
    public void initData() {
        Book sciFi = new Book();
        sciFi.setSignature("Position 1");
        sciFi.setTitle("Straznicy");
        sciFi.setAuthor("Alan Moore");
        sciFi.setRelease(2020);
        sciFi.setGenre(Genre.SCI_FI);

        books.put(sciFi.getSignature(), sciFi);

        Book fantasy = new Book();
        fantasy.setSignature("Position 2");
        fantasy.setTitle("Złe");
        fantasy.setAuthor("Krystyna Dutkiewicz");
        fantasy.setRelease(2019);
        fantasy.setGenre(Genre.FANTASY);

        books.put(fantasy.getSignature(), fantasy);

        Book tech = new Book();
        tech.setSignature("Position 3");
        tech.setTitle("Zawod tester");
        tech.setAuthor("Radoslaw Smilgin");
        tech.setRelease(2016);
        tech.setGenre(Genre.TECH);

        books.put(tech.getSignature(), tech);

        Book crime = new Book();
        crime.setSignature("Position 4");
        crime.setTitle("Morderstwo na polu golfowym");
        crime.setAuthor("Agatha Christie");
        crime.setRelease(2020);
        crime.setGenre(Genre.CRIME);

        books.put(crime.getSignature(), crime);
    }

    public Book findBook(String signature) {
        Assert.notNull(signature, "You have to specify the book's signature");
        return books.get(signature);
    }
}
