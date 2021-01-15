package com.example.springboottdd.security;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;

import static com.example.springboottdd.security.UserRole.USER;

@SpringBootTest
class SecurityConfigTest extends WebSecurityConfigurerAdapter {

    PasswordEncoder passwordEncoder;

    @Test
    void testUserDetailsService(){
        UserDetails annaSmithUser = User.builder()
                .username("annaSmithUser")
                .password(passwordEncoder.encode("password"))
                .roles(USER.name())
                .build();
    }

}