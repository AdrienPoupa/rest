package com.efrei.rest;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Comments
 */
@XmlRootElement
public class Comment {
    private int movie;
    private String text;

    public Comment(int movieId, String comment) {
        this.movie = movieId;
        this.text = comment;
    }

    public Comment() {
        this.movie = -1;
        this.text = "";
    }

    //@XmlTransient
    public int getMovie() {
        return movie;
    }

    public void setMovie(int movie) {
        this.movie = movie;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
