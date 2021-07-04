package com.kodilla.patterns2.observer.homework;

import lombok.Getter;

@Getter
public class Mentor implements ObserverMentor {
    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(TasksQueue tasksQueue) {
        System.out.println(name + ": Otrzymano linki do zadań w kolejce: " + tasksQueue.getName() + "\n" +
                " - ilość przesłanych linków: " + tasksQueue.getLinkToTask().size());
        updateCount++;
    }
}
