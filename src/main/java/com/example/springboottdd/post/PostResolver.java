package com.example.springboottdd.post;

import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PostResolver implements GraphQLQueryResolver {

    private final PostService postService;

    public PostResolver(PostService postService) {
        this.postService = postService;
    }

    public List<Post> getPosts(){
        return postService.getPosts();
    }

}
