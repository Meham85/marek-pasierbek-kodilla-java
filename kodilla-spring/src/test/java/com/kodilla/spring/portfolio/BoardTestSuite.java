package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        // Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        String toDoTask = "System test";
        String inProgressTask = "System configuration";
        String doneTask = "System installation";

        // When
        boolean toDoAddResult = context.containsBean("taskToDo");
        boolean toInProgressResult = context.containsBean("taskInProgress");
        boolean doneResult = context.containsBean("taskDone");

        TaskList toDoTask2 = (TaskList) context.getBean("taskToDo");
        toDoTask2.addTask("Task to Do");
        board.addDoneTask()
        String toDoTask3 = (String)context.getBean("taskToDo");
        board.addDoneTask(toDoTask3);
        String toDoTask4 = (String)context.getBean("taskToDo");
        board.addInProgressTask(toDoTask4);

        // Then
        assertTrue(toDoAddResult);
        assertTrue(toInProgressResult);
        assertTrue(doneResult);

        assertEquals(1, board.toDoQuantity());
        assertEquals(1, board.inProgressQuantity());
        assertEquals(1, board.doneQuantity());

        assertEquals(toDoTask, board.getToDoTask(0));
        assertEquals(inProgressTask, board.getInProgressTask(0));
        assertEquals(doneTask, board.getDoneTask(0));
    }
}