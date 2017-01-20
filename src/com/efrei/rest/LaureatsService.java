package com.efrei.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Laureats WebService
 */
@Path("/laureats/")
public class LaureatsService {
    /**
     * Show all winners by year
     * @return
     */
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