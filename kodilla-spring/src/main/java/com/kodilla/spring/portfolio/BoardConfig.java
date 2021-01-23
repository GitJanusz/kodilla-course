package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("list1")
    TaskList listOne;
    @Autowired
    @Qualifier("list2")
    TaskList listTwo;
    @Autowired
    @Qualifier("list3")
    TaskList listThree;

    @Bean
    public Board getBoard() {
        return new Board(listOne, listTwo, listThree);
    }

    @Bean(name = "list1")
    @Scope("prototype")
    public TaskList getListOne() {
        List<String> toDoListOne = new ArrayList<>();
        toDoListOne.add("task to do");
        return new TaskList(toDoListOne);
    }

    @Bean(name = "list2")
    @Scope("prototype")
    public TaskList getListTwo() {
        List<String> inProgressListOne = new ArrayList<>();
        inProgressListOne.add("task in progress");
        return new TaskList(inProgressListOne);
    }

    @Bean(name = "list3")
    @Scope("prototype")
    public TaskList getListThree() {
        List<String> doneListOne = new ArrayList<>();
        doneListOne.add("task done");
        return new TaskList(doneListOne);
    }
}
