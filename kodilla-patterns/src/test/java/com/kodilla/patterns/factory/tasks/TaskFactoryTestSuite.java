package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {
    private static final TaskFactory taskFactory = new TaskFactory();

    @Test
    void testFactoryDrivingTask() {
        //Given
        //When
        Task driving = taskFactory.makeTask(TaskFactory.DRIVING_TASK);
        driving.executeTask();
        //Then
        assertEquals("Run", driving.getTaskName());
        assertFalse(driving.isTaskExecuted());
    }

    @Test
    void testFactoryPaintingTask() {
        //Given
        //WHen
        Task painting = taskFactory.makeTask(TaskFactory.PAINTING_TASK);
        painting.executeTask();
        //Then
        assertEquals("Paint", painting.getTaskName());
        assertTrue(painting.isTaskExecuted());
    }

    @Test
    void testFactoryShoppingTask() {
        //Given
        //When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING_TASK);
        shopping.executeTask();
        //Then
        assertEquals("Buy", shopping.getTaskName());
        assertTrue(shopping.isTaskExecuted());
    }
}
