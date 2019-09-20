package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
public class BoardConfig {


    @Autowired
    @Qualifier("taskToDo")
    TaskList taskList;

    @Bean
    public Board getBoard() {
        return new Board(taskList, taskList, taskList);
    }

    @Bean(name = "taskToDo")

    @Scope("prototype")
    public TaskList toDoList() {
        return new TaskList();
    }

    @Bean (name = "taskInProgress")

    @Scope("prototype")
    public TaskList inProgressList() {
        return new TaskList();
    }

    @Bean(name = "taskDone")

    @Scope("prototype")
    public TaskList doneList() {
        return new TaskList();
    }
}
