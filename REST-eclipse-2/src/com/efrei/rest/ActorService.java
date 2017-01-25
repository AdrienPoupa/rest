package com.efrei.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;
import static java.lang.Math.toIntExact;

/**
 * Actor webservice
 */
@Path("/acteurs/")
public class ActorService {
    /**
     * Display all actors
     * @return List<Actor>
     */
    @GET
    @Produces(MediaType.TEXT_XML)
    public List<Actor> ActorsList() {
        return new ArrayList<>(ActorContainer.getInstance().values());
    }

    /**
     * Display an actor based on his ID
     * @param id Long
     * @return Actor
     */
    @Path("{id}/")
    @GET
    @Produces(MediaType.TEXT_XML)
    public Actor getActorId(@PathParam("id") Long id) {
        return ActorContainer.getInstance().get(toIntExact(id));
    }

    /**
     * Display the movies of an actor
     * @param actorId Long
     * @return List<Movie>
     */
    @Path("{id}/films/")
    @GET
    @Produces(MediaType.TEXT_XML)
    public List<Movie> getMovieActor(@PathParam("id") Long actorId) {

        List<Movie> moviesOutput = new ArrayList<>();

        // Here we do a bad-looking loop because we have to search deeply for the actor
        for (Movie m : MovieContainer.getInstance()) {
            for (Actor a : m.getActors().getActorMovie()) {
                if (a.getId() == actorId) {
                    moviesOutput.add(m);
                }
            }
        }

        return moviesOutput;
    }
}