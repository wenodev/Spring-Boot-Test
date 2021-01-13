package com.example.springboottdd.board.controller;

import com.example.springboottdd.board.entity.Board;
import com.example.springboottdd.exception.ResourceNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RequestMapping("/api/v1/boards")
@RestController
public class BoardController {

    private final static List<Board> boardList = Arrays.asList(
            new Board(1L ,"t1", "c1"),
            new Board(1L ,"t2", "c2"),
            new Board(1L ,"t3", "c3")
    );

    @GetMapping
    public List<Board> getBoards(){
        return boardList;
    }

    @GetMapping("/{id}" )
    public Board getBoardById(@PathVariable Long id){
        return boardList.stream()
                .filter(board -> board.getId() == id)
                .findFirst()
                .orElseThrow(() -> new ResourceNotFoundException("no board id : " + id));
    }

}


