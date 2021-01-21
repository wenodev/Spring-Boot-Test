package com.example.springboottdd.post;

import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.kickstart.tools.GraphQLSubscriptionResolver;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins ="*", maxAge = 3600)
@Component
public class PostMutation implements GraphQLMutationResolver, GraphQLSubscriptionResolver {

    private final PostRepository postRepository;

    public PostMutation(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public PostResponseDto savePost(PostInput dto){
        PostResponseDto postResponseDto = new PostResponseDto();
        System.out.println(dto);
        return postResponseDto;
    }





}
