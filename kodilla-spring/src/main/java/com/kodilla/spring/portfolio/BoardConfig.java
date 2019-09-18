package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
public class BoardConfig {



    TaskList taskList;

    @Bean
    public Board getBoard() {
        return new Board(taskList, taskList, taskList);
    }

    @Bean
    @Qualifier("ToDo")
    @Scope("prototype")
    public TaskList toDoList() {
        return new TaskList();
    }

    @Bean
    @Qualifier("InProg")
    @Scope("prototype")
    public TaskList inProgressList() {
        return new TaskList();
    }

    @Bean
    @Qualifier("DoneList")
    @Scope("prototype")
    public TaskList doneList() {
        return new TaskList();
    }
}
