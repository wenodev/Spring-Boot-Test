//package com.example.springboottdd.security;
//
//import com.google.common.collect.Sets;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.Set;
//import java.util.stream.Collectors;
//
//import static com.example.springboottdd.security.UserPermission.*;
//
//public enum  UserRole {
//    CUSTOMER(new HashSet<>()),
//    ADMIN(new HashSet<UserPermission>(Arrays.asList(EVENT_READ, EVENT_WRITE, CUSTOMER_READ, CUSTOMER_WRITE)) ),
//    ADMINTRAINEE(Sets.newHashSet(EVENT_READ, CUSTOMER_READ));
//
//    private Set<UserPermission> permissions;
//
//    UserRole(Set<UserPermission> permissions) {
//        this.permissions = permissions;
//    }
//
//    public Set<UserPermission> getPermissions() {
//        return permissions;
//    }
//
//    public Set<SimpleGrantedAuthority> getGrantedAuthorities(){
//        Set<SimpleGrantedAuthority> permissions = getPermissions().stream()
//                .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
//                .collect(Collectors.toSet());
//        permissions.add(new SimpleGrantedAuthority("ROLE_" + this.name()));
//        return permissions;
//    }
//
//}