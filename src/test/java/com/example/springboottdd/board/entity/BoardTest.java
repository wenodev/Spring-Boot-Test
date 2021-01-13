package com.example.springboottdd.board.entity;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BoardTest {

    Board board;

    @BeforeEach
    void init(){
        board = new Board(1L, "title", "content");
    }

    @Test
    void testBoard(){
        assertEquals(1L, board.getId());
        assertEquals("title", board.getTitle());
        assertEquals("content", board.getContent());
    }





}