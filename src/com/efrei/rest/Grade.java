package com.efrei.rest;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Grades
 */
@XmlRootElement
public class Grade {
    private int movie;
    private int mark;

    public Grade(int movieId, int mark) {
        this.movie = movieId;
        this.mark = mark;
    }

    public Grade() {
        this.movie = -1;
        this.mark = 0;
    }

    //@XmlTransient
    public int getMovie() {
        return movie;
    }

    public void setMovie(int movie) {
        this.movie = movie;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}
