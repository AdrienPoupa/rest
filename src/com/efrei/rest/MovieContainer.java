package com.efrei.rest;

import java.util.ArrayList;
import java.util.List;

/**
 * Container for all Movies objects
 * ArrayList
 */
public class MovieContainer {
    private static List<Movie> movieList = null;

    public static List<Movie> getInstance() {
        if (movieList == null)
        {
            movieList = buildMovieList();
        }

        return movieList;
    }

    private MovieContainer() {
    }

    private static List<Movie> buildMovieList() {
        movieList = new ArrayList<>();

        Movie matrix = new Movie();
        matrix.setId(1);
        matrix.setName("Matrix");
        matrix.setDirector(DirectorContainer.getInstance().get(1));
        matrix.setSynopsis("The Matrix is a 1999 science fiction film written and directed by The Wachowskis, starring" +
                " Keanu Reeves, Laurence Fishburne, Carrie-Anne Moss, Hugo Weaving, and Joe Pantoliano. It depicts a " +
                "dystopian future in which reality as perceived by most humans is actually a simulated reality called " +
                "\"the Matrix\", created by sentient machines to subdue the human population, while their bodies' heat " +
                "and electrical activity are used as an energy source. Computer programmer \"Neo\" learns this truth and " +
                "is drawn into a rebellion against the machines, which involves other people who have been freed from " +
                "the \"dream world\".");
        matrix.setYear("1999");
        matrix.setWon(false);

        movieList.add(matrix);

        Movie matrix2 = new Movie();
        matrix2.setId(2);
        matrix2.setName("Matrix");
        matrix2.setDirector(DirectorContainer.getInstance().get(1));
        matrix2.setSynopsis("The Matrix is a 1999 science fiction film written and directed by The Wachowskis, starring" +
                " Keanu Reeves, Laurence Fishburne, Carrie-Anne Moss, Hugo Weaving, and Joe Pantoliano. It depicts a " +
                "dystopian future in which reality as perceived by most humans is actually a simulated reality called " +
                "\"the Matrix\", created by sentient machines to subdue the human population, while their bodies' heat " +
                "and electrical activity are used as fzrzéource. Computer programmer \"Neo\" learns this truth and " +
                "is drawn into a rebellion against the machines, which involves other people who have been freed from " +
                "the \"dream world\".");
        matrix2.setYear("1999");
        matrix2.setWon(true);

        movieList.add(matrix2);

        return movieList;
    }
}
