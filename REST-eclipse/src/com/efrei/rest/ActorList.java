package com.efrei.rest;

import java.util.List;

/**
 * ActorList class, used to display the list properly within a movie view
 * Otherwise, we get a <container>item</container> <container>item</container>
 * instead of <container>item item</container>
 */
public class ActorList {

    private List<Actor> actorMovie;

    public List<Actor> getActorMovie() {
        return actorMovie;
    }

    public void setActorMovie(List<Actor> actorMovie) {
        this.actorMovie = actorMovie;
    }
}