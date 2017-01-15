package com.efrei.rest;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * A single movie
 */
@XmlRootElement
public class Movie {
    private int id;
    private String name;
    private String year; // store year as strings, less expensive
    private Director director;
    private String synopsis;
    private boolean won;

    public Movie(int id, String name, String year, Director director, String synopsis, boolean won) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.director = director;
        this.synopsis = synopsis;
        this.won = won;
    }

    public Movie() {
        this.id = -1;
        this.name = "";
        this.year = "2017";
        this.director = null;
        this.synopsis = "";
        this.won = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public boolean hasWon() {
        return won;
    }

    public void setWon(boolean won) {
        this.won = won;
    }
}