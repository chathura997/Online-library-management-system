package com.example.Online_library_management_system.enums;

public enum Role {
    USER("ROLE_USER"),
    LIBRARIAN("ROLE_LIBRARIAN"),
    BOOKKEEPER("ROLE_BOOKKEEPER");

    private final String authority;

    Role(String authority) {
        this.authority = authority;
    }

    public String getAuthority() {
        return authority;
    }
}