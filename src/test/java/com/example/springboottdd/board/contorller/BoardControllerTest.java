package com.example.springboottdd.board.contorller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class BoardControllerTest {

    private MockMvc mvc;

    @Test
    void testIndexPage() throws Exception {
        mvc.perform(get("/index"))
                .andExpect(status().isOk());
    }


}
