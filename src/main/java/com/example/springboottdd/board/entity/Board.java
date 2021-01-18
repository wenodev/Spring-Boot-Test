package com.example.springboottdd.board.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Board {

    private Long id;
    private String title;
    private String content;

    public Board(){

   }


    public Board(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
