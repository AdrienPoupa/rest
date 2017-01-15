package com.efrei.rest;

import java.util.ArrayList;
import java.util.List;

/**
 * Container for all Movies objects
 * ArrayList
 */
public class CommentContainer {
    private static List<Comment> commentList = null;

    public static List<Comment> getInstance() {
        if (commentList == null)
        {
            commentList = buildCommentList();
        }

        return commentList;
    }

    private CommentContainer() {
    }

    private static List<Comment> buildCommentList() {
        commentList = new ArrayList<>();

        Comment comment = new Comment(1, "Great movie");
        Comment comment2 = new Comment(1, "Awesome movie");

        commentList.add(comment);
        commentList.add(comment2);

        return commentList;
    }
}
