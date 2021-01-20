package com.example.springboottdd.security;

public enum UserPermission {
    CUSTOMER_READ("customer:read"),
    CUSTOMER_WRITE("customer:write"),
    EVENT_READ("event:read"),
    EVENT_WRITE("event:write");

    private String permission;

    UserPermission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
