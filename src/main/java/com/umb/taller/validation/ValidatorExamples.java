package com.umb.taller.validation;

import com.umb.taller.domain.Book;

import java.util.Objects;

/**
 * Demonstrates several implementations of DomainValidator<Book>:
 * - three lambda expressions
 * - one method reference implementation
 */
public class ValidatorExamples {

    // Lambda: title must be non-null and not blank
    public static final DomainValidator<Book> TITLE_NOT_EMPTY = book ->
            book != null && book.getTitle() != null && !book.getTitle().trim().isEmpty();

    // Lambda: author must be non-null and not blank
    public static final DomainValidator<Book> AUTHOR_NOT_EMPTY = book ->
            book != null && book.getAuthor() != null && !book.getAuthor().trim().isEmpty();

    // Lambda: year must be positive
    public static final DomainValidator<Book> YEAR_POSITIVE = book ->
            book != null && book.getYear() > 0;

    // Method reference: uses a static helper method that checks non-null
    public static final DomainValidator<Book> NON_NULL_VALIDATOR = ValidatorExamples::isNonNull;

    public static boolean isNonNull(Book book) {
        return Objects.nonNull(book);
    }

    /**
     * Demonstration runner printing validation results for a few books.
     */
    public static void demonstrate() {
        Book good = new Book("Effective Java", "Joshua Bloch", 2018);
        Book noTitle = new Book("  ", "Some Author", 2020);
        Book negativeYear = new Book("Some Title", "Author", -1);

        System.out.println("good TITLE_NOT_EMPTY: " + TITLE_NOT_EMPTY.validate(good));
        System.out.println("noTitle TITLE_NOT_EMPTY: " + TITLE_NOT_EMPTY.validate(noTitle));
        System.out.println("good AUTHOR_NOT_EMPTY: " + AUTHOR_NOT_EMPTY.validate(good));
        System.out.println("good YEAR_POSITIVE: " + YEAR_POSITIVE.validate(good));
        System.out.println("negativeYear YEAR_POSITIVE: " + YEAR_POSITIVE.validate(negativeYear));
        System.out.println("good NON_NULL_VALIDATOR: " + NON_NULL_VALIDATOR.validate(good));
    }

    public static void main(String[] args) {
        demonstrate();
    }
}
