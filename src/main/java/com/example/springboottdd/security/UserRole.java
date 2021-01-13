package com.example.springboottdd.security;

import com.google.common.collect.Sets;

import java.util.Set;

import static com.example.springboottdd.security.UserPermission.*;

public enum  UserRole {
    MEMBER(Sets.newHashSet()),
    ADMIN(Sets.newHashSet(COURSE_READ, COURSE_WRITE, USER_READ, USER_WRITE)),
    ADMINTRAINEE(Sets.newHashSet(COURSE_READ, USER_READ));


    private final Set<UserPermission> permissions;

    UserRole(Set<UserPermission> permissions) {
        this.permissions = permissions;
    }
}
