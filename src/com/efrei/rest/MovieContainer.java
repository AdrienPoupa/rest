package com.efrei.rest;

import java.util.ArrayList;
import java.util.Arrays;
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
        ActorList actorList = new ActorList();
        actorList.setActorMovie(new ArrayList<>(Arrays.asList(ActorContainer.getInstance().get(1), ActorContainer.getInstance().get(2))));
        matrix.setActors(actorList);
        matrix.setSynopsis("The Matrix is a 1999 science fiction film written and directed by The Wachowskis, starring" +
                " Keanu Reeves, Laurence Fishburne, Carrie-Anne Moss, Hugo Weaving, and Joe Pantoliano. It depicts a " +
                "dystopian future in which reality as perceived by most humans is actually a simulated reality called " +
                "\"the Matrix\", created by sentient machines to subdue the human population, while their bodies' heat " +
                "and electrical activity are used as an energy source. Computer programmer \"Neo\" learns this truth and " +
                "is drawn into a rebellion against the machines, which involves other people who have been freed from " +
                "the \"dream world\".");
        matrix.setYear("1999");
        matrix.setWon(true);

        movieList.add(matrix);

        Movie starWars7 = new Movie();
        starWars7.setId(2);
        starWars7.setName("Star Wars: The Force Awakens");
        starWars7.setDirector(DirectorContainer.getInstance().get(2));
        ActorList actorList2 = new ActorList();
        actorList2.setActorMovie(new ArrayList<>(Arrays.asList(ActorContainer.getInstance().get(3), ActorContainer.getInstance().get(4))));
        starWars7.setActors(actorList2);
        starWars7.setSynopsis("Approximately 30 years after the destruction of the second Death Star, the last remaining" +
                " Jedi, Luke Skywalker, has disappeared. The First Order has risen from the fallen Galactic Empire and " +
                "seeks to eliminate the New Republic. The Resistance, backed by the Republic and led by Luke's twin sister, " +
                "General Leia Organa, opposes them while searching for Luke to enlist his aid.");
        starWars7.setYear("2015");
        starWars7.setWon(true);

        movieList.add(starWars7);

        Movie theMartian = new Movie();
        theMartian.setId(3);
        theMartian.setName("The Martian");
        theMartian.setDirector(DirectorContainer.getInstance().get(3));
        ActorList actorList3 = new ActorList();
        actorList3.setActorMovie(new ArrayList<>(Arrays.asList(ActorContainer.getInstance().get(5), ActorContainer.getInstance().get(6))));
        theMartian.setActors(actorList3);
        theMartian.setSynopsis("The crew of the Ares III mission to Mars is exploring Acidalia Planitia on Martian " +
                "solar day (sol) 18 of their 31-sol expedition. A strong dust storm threatens to topple their Mars Ascent " +
                "Vehicle (MAV), forcing them to abort their mission. During the evacuation, astronaut Mark Watney (Matt Damon) " +
                "is struck by debris and lost in the storm; the last telemetry from his suit indicates no signs of life. " +
                "With Watney believed dead, and the storm worsening by the second, mission commander " +
                "Melissa Lewis (Jessica Chastain) orders the crew to take off and return to their orbiting vessel, Hermes.");
        theMartian.setYear("2015");
        theMartian.setWon(false);

        movieList.add(theMartian);

        Movie rogueOne = new Movie();
        rogueOne.setId(4);
        rogueOne.setName("Rogue One: A Star Wars Story");
        rogueOne.setDirector(DirectorContainer.getInstance().get(4));
        ActorList actorList4 = new ActorList();
        actorList4.setActorMovie(new ArrayList<>(Arrays.asList(ActorContainer.getInstance().get(7), ActorContainer.getInstance().get(8))));
        rogueOne.setActors(actorList4);
        rogueOne.setSynopsis("Research scientist Galen Erso and his family are in hiding on the planet Lah'mu when " +
                "Imperial weapons developer Orson Krennic arrives to press him into completing the Death Star, a space " +
                "station-based superweapon capable of destroying an entire planet. Galen's wife Lyra is killed in the " +
                "confrontation while their daughter Jyn escapes and is taken to safety by Rebel extremist Saw Gerrera.");
        rogueOne.setYear("2016");
        rogueOne.setWon(false);

        movieList.add(rogueOne);

        Movie sausageParty = new Movie();
        sausageParty.setId(5);
        sausageParty.setName("Sausage Party");
        sausageParty.setDirector(DirectorContainer.getInstance().get(5));
        ActorList actorList5 = new ActorList();
        actorList5.setActorMovie(new ArrayList<>(Arrays.asList(ActorContainer.getInstance().get(9), ActorContainer.getInstance().get(10))));
        sausageParty.setActors(actorList5);
        sausageParty.setSynopsis("A supermarket called Shopwell's is filled with anthropomorphic grocery items and the " +
                "human shoppers are worshipped as gods who take groceries to the \"Great Beyond\" when they are purchased. " +
                "Among the groceries in the store is a sausage named Frank, who has dreams of living with his hot dog bun " +
                "girlfriend, Brenda, in the Great Beyond, where they can finally consummate their relationship.");
        sausageParty.setYear("2016");
        sausageParty.setWon(true);

        movieList.add(sausageParty);

        return movieList;
    }
}
