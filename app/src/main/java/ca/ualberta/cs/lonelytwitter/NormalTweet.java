/*
 * Copyright (c) 2017. Team X, CMPUT 301, University of Alberta - All rights Reserved. You may use, distribute, or modify, this code under the terms and conditions of Code of Student Behaviour at University of Alberta.
 * You can find a copy of this licence in this project. otherwise, please contact contact@abc.ca
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by sydia on 1/19/17.
 */

/**
 * Extends the abstract class tweet, for tweets which are not important.
 * provides isImportant(), to determine if the tweet object is important
 */

public class NormalTweet extends Tweet {
    public NormalTweet(String message) {
        super(message);
    }

    public NormalTweet(String message, Mood mood) {
        super(message, mood);
    }

    public NormalTweet(Date date, String message) {
        super(date, message);
    }

    /**
     * called to determine whether the tweet is important.
     * @return false because the tweet is not important.
     */
    @Override
    public Boolean isImportant() {
        return false;
    }
}
