package com.umb.taller.exception;

public class BookNotFoundException extends LibraryException {

    public BookNotFoundException(String message) {
        super(message);
    }

}