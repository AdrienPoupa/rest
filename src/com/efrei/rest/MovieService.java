package com.efrei.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Movie WebService
 */
@Path("/films/")
public class MovieService {
    /**
     * Display all movies
     * @return
     */
    @GET
    @Produces(MediaType.TEXT_XML)
    public List<Movie> moviesList() {
        return MovieContainer.getInstance();
    }

    /**
     * Display all movies released in a given year
     * @param year year
     * @return
     */
    @Path("{year}/")
    @GET
    @Produces(MediaType.TEXT_XML)
    public List<Movie> getMovieYear(@PathParam("year") Long year) {

        return MovieContainer.getInstance()
                .stream()
                .filter(p-> p.getYear().equals((year.toString())))
                .collect(Collectors.toList());
    }

    /**
     * Display the winner for a given year
     * @param year year
     * @return
     */
    @Path("{year}/laureat/")
    @GET
    @Produces(MediaType.TEXT_XML)
    public List<Movie> getMovieYearWon(@PathParam("year") Long year) {

        return MovieContainer.getInstance()
                .stream()
                .filter(p-> p.getYear().equals((year.toString())) && p.hasWon())
                .collect(Collectors.toList());
    }
}