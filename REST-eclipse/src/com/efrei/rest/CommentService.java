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

@Path("/commentaires/")
public class CommentService {
    /**
     * Display all comments for a movie ID
     * @param movieId Long
     * @return List<Comment>
     */
    @Path("{id}/")
    @GET
    @Produces(MediaType.TEXT_XML)
    public List<Comment> getCommentsMovie(@PathParam("id") Long movieId) {

        return CommentContainer.getInstance()
                .stream()
                .filter(p-> p.getMovie() == toIntExact(movieId))
                .collect(Collectors.toList());
    }

    /**
     * Post a new comment
     * @param comment Comment object from XML file in POST
     * @return Response confirmation message
     */
    @POST
    @Consumes(MediaType.TEXT_XML)
    public Response addComment(Comment comment) {
        CommentContainer.getInstance();
        CommentContainer.addComment(comment);

        String result = "Comment saved : " + comment;
        return Response.status(201).entity(result).build();
    }

    /**
     * Post a new comment using a HTML form
     * @param movieId movie ID
     * @param comentText text comment
     * @param servletResponse servlet response
     * @throws IOException
     */
    @POST
    @Produces(MediaType.TEXT_HTML)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public void addCommentForm(@FormParam("movieId") String movieId,
                        @FormParam("commentText") String comentText,
                        @Context HttpServletResponse servletResponse) throws IOException {

        Comment comment = new Comment(Integer.parseInt(movieId), comentText);

        CommentContainer.getInstance();
        CommentContainer.addComment(comment);

        servletResponse.sendRedirect("../commentaire.html");
    }
}