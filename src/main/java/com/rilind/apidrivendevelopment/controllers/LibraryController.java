package com.rilind.apidrivendevelopment.controllers;

import com.rilind.apidrivendevelopment.api.LibraryApi;
import com.rilind.apidrivendevelopment.models.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LibraryController implements LibraryApi {
    private static final Logger LOGGER = LoggerFactory.getLogger(LibraryController.class);

    private List<Book> getBooks() {
        Book b = new Book();
        b.setBookAuthor("Rilind Nuka");
        b.setName("OO-Programming Java");
        Book b2 = new Book();
        b2.setBookAuthor("Adam Grant");
        b2.setName("Originals");
        ArrayList<Book> list = new ArrayList<>();
        list.add(b);
        list.add(b2);
        return list;
    }

    @Override
    public ResponseEntity<List<Book>> getAllBooksInLibrary() {
        LOGGER.info("Returning a a list with books - endpoint");

        return ResponseEntity.ok(getBooks());
    }

    @Override
    public ResponseEntity<Book> getSingleBook() {
        LOGGER.info("Returning a single book - endpoint");
        return ResponseEntity.ok(getBooks().get(0));
    }
}
