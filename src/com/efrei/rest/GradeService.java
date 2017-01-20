package com.efrei.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.stream.Collectors;
import static java.lang.Math.toIntExact;

/**
 * Grade WebService
 */
@Path("/notes/")
public class GradeService {
    /**
     * Display all grades of a movie
     * @param movieId
     * @return
     */
    @Path("{id}/")
    @GET
    @Produces(MediaType.TEXT_XML)
    public List<Grade> getGradesMovie(@PathParam("id") Long movieId) {

        return GradeContainer.getInstance()
                .stream()
                .filter(p-> p.getMovie() == toIntExact(movieId))
                .collect(Collectors.toList());
    }

    /**
     * Display the average of all grades for a movie
     * @param movieId
     * @return
     */
    @Path("{id}/moyenne")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Double getGradeAverageMovie(@PathParam("id") Long movieId) {

        return GradeContainer.getInstance()
                            .stream()
                            .filter(p-> p.getMovie() == toIntExact(movieId))
                            .mapToDouble(Grade::getMark)
                            .average()
                            .orElse(0);
    }

    /**
     * Post a new grade
     * @param Grade
     * @return
     */
    @POST
    @Consumes(MediaType.TEXT_XML)
    public Response addGrade(Grade Grade) {
        GradeContainer.getInstance();
        GradeContainer.addGrade(Grade);

        String result = "Grade saved : " + Grade;
        return Response.status(201).entity(result).build();
    }
}