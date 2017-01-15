package com.efrei.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/laureats/")
public class LaureatsService {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String moviesList() {
        StringBuilder list = new StringBuilder();
        for (Movie m : MovieContainer.getInstance()) {
            if (m.hasWon()) {
                list.append(m.getYear()).append(" ").append(m.getName());
            }
        }

        return list.toString();
    }
}