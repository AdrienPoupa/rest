package com.efrei.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.stream.Collectors;
import static java.lang.Math.toIntExact;

@Path("/commentaires/")
public class CommentService {
    /**
     * Display all comments for a movie ID
     * @param movieId
     * @return
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
     * @param comment comment object from XML file in POST
     * @return confirmation message
     */
    @POST
    @Consumes(MediaType.TEXT_XML)
    public Response addComment(Comment comment) {
        CommentContainer.getInstance();
        CommentContainer.addComment(comment);

        String result = "Comment saved : " + comment;
        return Response.status(201).entity(result).build();
    }
}