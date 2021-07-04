package com.kodilla.patterns2.observer.homework;

import lombok.Getter;
import java.util.ArrayList;
import java.util.List;

@Getter
public class TasksQueue implements Observation {
    private final List<ObserverMentor> observersMentors;
    private final List<String> linkToTask;
    private final String name;

    public TasksQueue(String name) {
        observersMentors = new ArrayList<>();
        linkToTask = new ArrayList<>();
        this.name = name;
    }

    public void sendTask(String task) {
        linkToTask.add(task);
        notifyObserversMentors();
    }

    @Override
    public void registerObserverMentor(ObserverMentor observerMentor) {
        observersMentors.add(observerMentor);
    }

    @Override
    public void notifyObserversMentors() {
        for (ObserverMentor observerMentor : observersMentors) {
            observerMentor.update(this);
        }
    }

    @Override
    public void removeObserverMentor(ObserverMentor observerMentor) {
        observersMentors.remove(observerMentor);
    }
}
