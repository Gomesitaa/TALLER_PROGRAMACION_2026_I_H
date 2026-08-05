package com.umb.taller.validation;

/**
 * Functional interface for domain validators.
 *
 * @param <T> type to validate
 */
@FunctionalInterface
public interface DomainValidator<T> {

    /**
     * Validate the provided domain object.
     *
     * @param object the object to validate
     * @return true if the object is valid, false otherwise
     */
    boolean validate(T object);
}
