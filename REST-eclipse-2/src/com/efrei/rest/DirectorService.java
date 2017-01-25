package com.efrei.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import static java.lang.Math.toIntExact;

/**
 * Director WebService
 */
@Path("/realisateurs/")
public class DirectorService {
    /**
     * Show all directors
     * @return List<Director>
     */
    @GET
    @Produces(MediaType.TEXT_XML)
    public List<Director> DirectorsList() {
        return new ArrayList<>(DirectorContainer.getInstance().values());
    }

    /**
     * Show a director based on his ID
     * @param id Long
     * @return Director
     */
    @Path("{id}/")
    @GET
    @Produces(MediaType.TEXT_XML)
    public Director getDirectorId(@PathParam("id") Long id) {
        return DirectorContainer.getInstance().get(toIntExact(id));
    }

    /**
     * Show all the movies from a director
     * @param directorId Long
     * @return List<Movie>
     */
    @Path("{id}/films/")
    @GET
    @Produces(MediaType.TEXT_XML)
    public List<Movie> getMovieYearWon(@PathParam("id") Long directorId) {

        return MovieContainer.getInstance()
                .stream()
                .filter(p-> p.getDirector().getId() == directorId)
                .collect(Collectors.toList());
    }
}