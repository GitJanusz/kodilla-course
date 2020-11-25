package com.kodilla.stream;

import com.kodilla.stream.person.People;

public class StreamMain {

    public static void main(String[] args) {
        People.getList().stream()
                .map(s -> s.toUpperCase())     //lub .map(String::toUpperCase)
                .forEach(System.out::println); // wtedy .forEach(s -> System.out.println(s));
    }
}