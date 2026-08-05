package com.umb.taller.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
    private final List<Book> books = new ArrayList<>();

    public Library() {
    }

    public void addBook(Book book) {
        if (book != null) {
            books.add(book);
        }
    }

    /**
     * Returns an unmodifiable view of the books in the library.
     */
    public List<Book> getBooks() {
        return Collections.unmodifiableList(books);
    }

    /**
     * Prints all books to stdout. Useful for simple demos/tests.
     */
    public void showBooks() {
        if (books.isEmpty()) {
            System.out.println("Library has no books.");
            return;
        }
        for (Book b : books) {
            System.out.println(b);
        }
    }

    @Override
    public String toString() {
        return "Library{" + "books=" + books + '}';
    }
}
