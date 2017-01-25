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

        commentList.add(new Comment(1, "Great movie"));
        commentList.add(new Comment(1, "Awesome movie"));
        commentList.add(new Comment(1, "\"The Matrix\" is a visually dazzling cyberadventure, full " +
                "of kinetic excitement, but it retreats to formula just when it's getting interesting. It's kind of a " +
                "letdown when a movie begins by redefining the nature of reality, and ends with a shoot-out. " +
                "We want a leap of the imagination, not one of those obligatory climaxes with automatic weapons fire."));

        commentList.add(new Comment(2, "Despite the copious servings of tragic threats and good feelings, " +
                "the production sinks under the weight of its emotional calculation."));
        commentList.add(new Comment(2, "That's what's so impressive about the tricky balancing act Abrams " +
                "has pulled off with The Force Awakens: He's made a movie that's simultaneously gripping and a huge release. " +
                "We are in good hands, at last."));

        commentList.add(new Comment(3, "Damon has never seemed more at home than he does here, millions " +
                "of miles adrift. Would any other actor have shouldered the weight of the role with such diligent grace?"));
        commentList.add(new Comment(3, "The film is a profound testament to the rare-and " +
                "underrated-virtue of simply not screwing anything up."));

        commentList.add(new Comment(4, "Rogue One is largely free of the weight of myth and expectation " +
                "that were borne by The Force Awakens, and this turns out to be both a good and a bad thing."));
        commentList.add(new Comment(4, "With all the aerial dogfights, armored combat vehicles, " +
                "grenades, flame-throwers and snipers, Rogue One feels like a film for those who think that most Star Wars " +
                "movies are insufficiently like World War II flicks."));

        commentList.add(new Comment(5, "This smack in the face of good manners is surprising and strange, often delightfully so."));
        commentList.add(new Comment(5, "Some ingredients are missing, although there's a lively musical " +
                "number and some clever sight gags and food puns along the way."));

        return commentList;
    }

    public static void addComment(Comment comment) {
        commentList.add(comment);
    }
}
