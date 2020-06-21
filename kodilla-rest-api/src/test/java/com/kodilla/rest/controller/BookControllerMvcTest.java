package com.kodilla.rest.controller;

import com.kodilla.rest.JsonUtils;
import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(BookController.class)
public class BookControllerMvcTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BookService bookService;

    @Test
    public void shouldFetchBooksMethod1() throws Exception {
        // given
        List<BookDto> booksList = Arrays.asList(
                new BookDto("title 1", "author 1"),
                new BookDto("title 2", "author 2")
        );
        when(bookService.getBooks()).thenReturn(booksList);

        // when & then
        mockMvc.perform(get("/books").contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().is(200))
                .andExpect(jsonPath("$", hasSize(2)))
                .andExpect(jsonPath("$[0].title", is("title 1")))
                .andExpect(jsonPath("$[0].author", is("author 1")));
    }

    @Test
    public void shouldFetchBooksMethod2() throws Exception {
        // given
        List<BookDto> booksList = Arrays.asList(
                new BookDto("title 1", "author 1"),
                new BookDto("title 2", "author 2")
        );
        when(bookService.getBooks()).thenReturn(booksList);

        // when & then
        mockMvc.perform(get("/books").contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().is(200))
                .andExpect(content().json(JsonUtils.toJsonString(booksList)));
    }
}
