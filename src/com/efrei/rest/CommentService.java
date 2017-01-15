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

@Path("/commentaires/")
public class CommentService {
    @Path("{id}/")
    @GET
    @Produces(MediaType.TEXT_XML)
    public List<Comment> getCommentsMovie(@PathParam("id") Long movieId) {

        return CommentContainer.getInstance()
                .stream()
                .filter(p-> p.getMovieId() == toIntExact(movieId))
                .collect(Collectors.toList());
    }

    // todo: POST new comment
}