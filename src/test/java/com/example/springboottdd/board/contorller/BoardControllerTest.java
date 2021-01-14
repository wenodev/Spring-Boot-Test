package com.example.springboottdd.board.contorller;

import com.example.springboottdd.board.controller.BoardController;
import com.example.springboottdd.board.entity.Board;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import java.util.Arrays;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(BoardController.class)
class BoardControllerTest {

    @Autowired
    private MockMvc mvc;

    List<Board> boardList;
    String BASIC_URL;

    @BeforeEach
    void init(){
        boardList = Arrays.asList(
                new Board(1L ,"t1", "c1"),
                new Board(1L ,"t2", "c2"),
                new Board(1L ,"t3", "c3")
        );
        BASIC_URL = "/api/v1/boards";
    }

    @Test
    void testGetBoards() throws Exception {

        ResultActions actions = mvc.perform(get(BASIC_URL))
                .andDo(print());

        actions
                .andExpect(status().isOk());

    }

    @Test
    void testGetBoardById() throws Exception {

        Long id = 1L;

        ResultActions actions = mvc.perform(get(BASIC_URL + "/" +id))
                .andDo(print());

        actions
                .andExpect(status().isOk())
                .andExpect(jsonPath("id").value(1L));
    }

    @Disabled
    @Test
    void testIndexPage() throws Exception {
        mvc.perform(get("/"))
                .andExpect(status().isOk());
    }


}
