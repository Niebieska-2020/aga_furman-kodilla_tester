package com.kodilla.collections.adv.immutable.special.homework;

public class BookHacked extends Book{
    public String newTitle;
    public String newAuthor;

    public BookHacked() {
        super(title, author);
        newTitle = title;
        newAuthor = author;
    }

    public void modifyTitleAndAuthor () {
        title = newTitle;
        author = newAuthor;
    }

    @Override
    public String getTitle() {
        return newTitle;
    }

    @Override
    public String getAuthor() {
        return newAuthor;
    }
}
