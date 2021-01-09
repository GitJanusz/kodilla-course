package com.kodilla.good.patterns.challenges.task1;

import com.kodilla.good.patterns.challenges.task1.MovieStore;

import java.util.Collection;
import java.util.stream.Collectors;

import static java.lang.System.*;

public class MovieStoreMain {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        String moviesTitles = movieStore.getMovies().values().stream()
                .flatMap(Collection::stream)
                .collect(Collectors.joining("!"));
        out.print(moviesTitles);
    }
}
