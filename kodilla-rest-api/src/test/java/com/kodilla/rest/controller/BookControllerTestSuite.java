package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

class BookControllerTestSuite {

    @Test
    public void shouldFetchBooks() {
        // given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> booksList = Arrays.asList(
                new BookDto("Title 1", "Author 1"),
                new BookDto("Title 2", "Author 2")
        );
        when(bookServiceMock.getBooks()).thenReturn(booksList);

        // when
        List<BookDto> result = bookController.getBooks();

        // then
        assertThat(result).hasSize(2);
    }

    @Test
    public void shouldAddBook() {
        // given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        BookDto bookDto = new BookDto("Zawod tester", "Radoslaw Smilgin");

        // when
        bookController.addBook(bookDto);

        // then
        Mockito.verify(bookServiceMock, Mockito.times(1)).addBook(bookDto);
    }

    @Test
    public void shouldRemoveBook() {
        // given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> bookDtoList = new ArrayList<>();
        bookDtoList.add(new BookDto("Title1", "Author1"));
        bookDtoList.add(new BookDto("Title2", "Author2"));
        bookDtoList.remove(new BookDto("Title1", "Author1"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(bookDtoList);

        // when
        bookController.removeBook(new BookDto("Title1", "Author1"));
        List<BookDto> listResult = bookController.getBooks();

        // then
        Mockito.verify(bookServiceMock, Mockito.times(1)).removeBook(new BookDto("Title1", "Author1"));
        Assertions.assertEquals(1, listResult.size());
    }
}
