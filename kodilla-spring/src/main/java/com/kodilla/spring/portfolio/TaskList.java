package com.kodilla.spring.portfolio;

import java.util.List;

public class TaskList {

    final List<String> tasks;

    public TaskList(List<String> tasks) {
        this.tasks = tasks;
    }

    @Override
    public String toString() {
        return "task: " + tasks;
    }
}
