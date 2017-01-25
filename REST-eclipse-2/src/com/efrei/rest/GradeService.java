package com.efrei.rest;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
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
     * @param movieId Long
     * @return List<Grade>
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
     * @param movieId Long
     * @return Double
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
     * @param grade Grade
     * @return Response
     */
    @POST
    @Consumes(MediaType.TEXT_XML)
    public Response addGrade(Grade grade) {
        GradeContainer.getInstance();
        GradeContainer.addGrade(grade);

        String result = "Grade saved : " + grade;
        return Response.status(201).entity(result).build();
    }

    /**
     * Post a new grade using a HTML form
     * @param movieId movie ID
     * @param mark mark
     * @param servletResponse servlet response
     * @throws IOException
     */
    @POST
    @Produces(MediaType.TEXT_HTML)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public void addGradeForm(@FormParam("movieId") String movieId,
                        @FormParam("mark") String mark,
                        @Context HttpServletResponse servletResponse) throws IOException {

        Grade grade = new Grade(Integer.parseInt(movieId), Integer.parseInt(mark));

        GradeContainer.getInstance();
        GradeContainer.addGrade(grade);

        servletResponse.sendRedirect("../note.jsp");
    }
}