package com.example.springboottdd.jackson;

import com.example.springboottdd.board.entity.Board;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class JacksonTest {

    @Test
    void testCreateObjectMapperInstance() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Board board = new Board(2L, "title-2", "content-2");
        objectMapper.writeValue(new File("sample/board2.json"), board);
    }

    @Test
    @DisplayName("자바 객체를 json으로!")
    void test_String값으로확인() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Board board = new Board(1L, "title1", "content1");
        String result = objectMapper.writeValueAsString(board);
        System.out.println(result);
    }


    //Board의 defalut 생성자 없으면 오류!!
    //이유가 무엇일지 생각해보기
    @Test
    @DisplayName("json을 자바 객체로!!")
    void testJsonToObject() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String json = "{\"id\":1,\"title\":\"title1\",\"content\":\"content1\"}";
        Board board = objectMapper.readValue(json, Board.class);

        assertThat("title1").isEqualTo(board.getTitle());
    }

    @Test
    @DisplayName("존재하는 json 파일을 자바 객체로!!")
    void testExistJsonToObject() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Board board = objectMapper.readValue(new URL("file:sample/board.json"), Board.class);

        assertThat("title").isEqualTo(board.getTitle());
    }




}
