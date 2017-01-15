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

@Path("/realisateurs/")
public class DirectorService {
    @GET
    @Produces(MediaType.TEXT_XML)
    public List<Director> DirectorsList() {
        return new ArrayList<>(DirectorContainer.getInstance().values());
    }

    @Path("{id}/")
    @GET
    @Produces(MediaType.TEXT_XML)
    public Director getDirectorId(@PathParam("id") Long id) {
        return DirectorContainer.getInstance().get(toIntExact(id));
    }

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