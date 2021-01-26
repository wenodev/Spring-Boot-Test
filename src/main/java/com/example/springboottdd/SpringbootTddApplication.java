package com.example.springboottdd;

import com.example.springboottdd.post.Post;
import com.example.springboottdd.post.PostRepository;
import com.example.springboottdd.task.Task;
import com.example.springboottdd.task.TaskRepository;
import graphql.schema.GraphQLScalarType;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootTddApplication implements CommandLineRunner  {

	private final PostRepository postRepository;
	private final TaskRepository taskRepository;

	public SpringbootTddApplication(PostRepository postRepository, TaskRepository taskRepository) {
		this.postRepository = postRepository;
		this.taskRepository = taskRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTddApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Post post = new Post(1L, "post1");
		postRepository.save(post);

		Task task = new Task(1L, "task1");
		taskRepository.save(task);
	}



}
