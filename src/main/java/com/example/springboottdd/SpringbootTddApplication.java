package com.example.springboottdd;

import com.example.springboottdd.post.Post;
import com.example.springboottdd.post.PostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootTddApplication implements CommandLineRunner  {

	private final PostRepository postRepository;

	public SpringbootTddApplication(PostRepository postRepository) {
		this.postRepository = postRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTddApplication.class, args);
		System.out.println("hello");
	}

	@Override
	public void run(String... args) throws Exception {
		Post post = new Post("id", "title");
		postRepository.save(post);
	}
}
