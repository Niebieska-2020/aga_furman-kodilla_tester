package com.kodilla.soap.ws;

import com.kodilla.courses.soap_library.GetBookRequest;
import com.kodilla.courses.soap_library.GetBookResponse;
import com.kodilla.soap.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class BookEndpoint {
    private static final String NAMESPACE_URI = "http://kodilla.com/courses/soap";

    private final BookRepository booksRepository;

    @Autowired
    public BookEndpoint(BookRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getBookRequest")
    @ResponsePayload
    public GetBookResponse getBook(@RequestPayload GetBookRequest request) {
        GetBookResponse response = new GetBookResponse();
        response.setBook(booksRepository.findBook(request.getSignature()));

        return response;
    }
}
