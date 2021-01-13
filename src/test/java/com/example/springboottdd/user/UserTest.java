package com.example.springboottdd.user;

import com.example.springboottdd.user.entiy.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user;


    @BeforeEach
    void init(){
       user = new User(1L, "name");
    }

    @Test
    void testUser(){
        assertEquals(user.getId(), 1L);
        assertEquals(user.getName(), "name");
    }



}