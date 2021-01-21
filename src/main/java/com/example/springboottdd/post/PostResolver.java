package com.example.springboottdd.post;

import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin(origins ="*", maxAge = 3600)
@Component
public class PostResolver implements GraphQLQueryResolver {

    private final PostRepository postRepository;

    public PostResolver(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> getPosts(){
        return postRepository.findAll();
    }

}
