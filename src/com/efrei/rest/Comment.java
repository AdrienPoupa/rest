package com.efrei.rest;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Comments
 */
@XmlRootElement
public class Comment {
    private int movieId;
    private String commentText;

    public Comment(int movieId, String comment) {
        this.movieId = movieId;
        this.commentText = comment;
    }

    public Comment() {
        this.movieId = -1;
        this.commentText = "";
    }

    @XmlTransient
    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }
}
