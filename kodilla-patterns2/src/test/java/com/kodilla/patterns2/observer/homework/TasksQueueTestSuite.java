package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TasksQueueTestSuite {

    @Test
    void testUpdate() {
        //Given
        TasksQueue annaTasksQueue = new AnnaTasksQueue();
        TasksQueue johnTasksQueue = new JohnTasksQueue();
        TasksQueue robTasksQueue = new RobTasksQueue();
        Mentor johnRed = new Mentor("John Red");
        Mentor paulGreen = new Mentor("Paul Green");
        Mentor annaOrange = new Mentor("Anna Orange");
        Mentor oscarWhite = new Mentor("Oscar White");
        //When
        annaTasksQueue.registerObserverMentor(johnRed);
        annaTasksQueue.registerObserverMentor(paulGreen);
        johnTasksQueue.registerObserverMentor(annaOrange);
        robTasksQueue.registerObserverMentor(oscarWhite);
        robTasksQueue.registerObserverMentor(johnRed);

        annaTasksQueue.sendTask("https://github.com/AnnaNan/Course/task1");
        annaTasksQueue.sendTask("https://github.com/AnnaNan/Course/task2");
        annaTasksQueue.sendTask("https://github.com/AnnaNan/Course/task3");
        johnTasksQueue.sendTask("https://github.com/JohnJo/Course/task1");
        robTasksQueue.sendTask("https://github.com/RobBo/Course/task1");
        robTasksQueue.sendTask("https://github.com/RobBo/Course/task2");

        //Then
        assertEquals(5, johnRed.getUpdateCount());
        assertEquals(3, paulGreen.getUpdateCount());
        assertEquals(1, annaOrange.getUpdateCount());
        assertEquals(2, oscarWhite.getUpdateCount());
    }
}
