package com.kodilla.patterns.factory.tasks;

final class TaskFactory {
    static Task makeTask(final TaskType taskType) {
        switch (taskType) {
            case SHOPPINGTASK:
                return new ShoppingTask(TaskType.SHOPPINGTASK.getDescription(), "Eggs", 120);
            case PAINTINGTASK:
                return new PaintingTask(TaskType.PAINTINGTASK.getDescription(), "White", "Wall");
            case DRIVINGTASK:
                return new DrivingTask(TaskType.DRIVINGTASK.getDescription(), "Poznań", "BMW");
            default:
                throw new IllegalArgumentException();
        }
    }
}