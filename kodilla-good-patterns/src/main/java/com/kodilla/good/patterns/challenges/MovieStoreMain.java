package com.kodilla.good.patterns.challenges;

import java.util.Collection;

public class MovieStoreMain {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        movieStore.getMovies().values().stream()
                .flatMap(Collection::stream)
                .map(e -> e + "!")
                .forEach(System.out::print);
    }
}
