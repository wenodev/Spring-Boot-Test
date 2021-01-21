package com.example.springboottdd.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private static final List<User> users = Arrays.asList(
            new User(1L, "AAA"),
            new User(2L, "BBB"),
            new User(3L, "CCC")
    );

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id){
        return users.stream()
                .filter(user -> id.equals(user.getId()))
                .findFirst()
                .orElseThrow( () -> new IllegalStateException("no id : " + id));
    }

    @GetMapping
    public List<User> getAllStudents() {
        System.out.println("getAllStudents");
        return users;
    }

}
