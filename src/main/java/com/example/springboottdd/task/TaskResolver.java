package com.example.springboottdd.task;

import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TaskResolver implements GraphQLQueryResolver {

    private final TaskService taskService;

    public TaskResolver(TaskService taskService) {
        this.taskService = taskService;
    }

    public List<Task> getTasks(){
        return taskService.getTasks();
    }

}
