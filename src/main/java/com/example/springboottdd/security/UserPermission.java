package com.example.springboottdd.security;

public enum UserPermission {

    USER_READ("user:read"),
    USER_WRITE("user:write"),
    COURSE_READ("course:read"),
    COURSE_WRITE("course:write");

    private final String permissions;


    UserPermission(String permissions) {
        this.permissions = permissions;
    }


}
