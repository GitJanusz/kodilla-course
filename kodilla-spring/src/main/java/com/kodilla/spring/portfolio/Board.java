package com.kodilla.spring.portfolio;

public class Board {

    TaskList toDoList;
    TaskList inProgressList;
    TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

    public void displayToDoList() {
        System.out.println("To do list{ " + getToDoList() + '}');
    }

    public void displayInProgressList() {
        System.out.println("In progress list{ " + getInProgressList() + '}');
    }

    public void displayDoneList() {
        System.out.println("Done list{ " + getDoneList() + '}');
    }
}
