package com.kodilla.good.patterns.challenges.movies;

import java.util.stream.Collectors;

public class Iteration {

    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        String result = movieStore.getMovies().entrySet().stream()
                .flatMap(e -> e.getValue().stream())
                .collect(Collectors.joining("!"));
        System.out.println(result);
    }
}
