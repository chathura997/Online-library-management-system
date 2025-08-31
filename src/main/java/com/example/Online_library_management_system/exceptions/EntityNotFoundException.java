package com.example.Online_library_management_system.exceptions;

public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException(String message) {
        super(message);
    }

    public EntityNotFoundException(String entityName, Object id) {
        super(String.format("%s not found with ID: %s", entityName, id));
    }

}

