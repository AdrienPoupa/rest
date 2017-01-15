package com.efrei.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.stream.Collectors;

@Path("/films/")
public class MovieService {
    @GET
    @Produces(MediaType.TEXT_XML)
    public List<Movie> moviesList() {
        return MovieContainer.getInstance();
    }

    @Path("{year}/")
    @GET
    @Produces(MediaType.TEXT_XML)
    public List<Movie> getMovieYear(@PathParam("year") Long year) {

        return MovieContainer.getInstance()
                .stream()
                .filter(p-> p.getYear().equals((year.toString())))
                .collect(Collectors.toList());
    }

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