/*
 * Copyright (c) 2017. Team X, CMPUT 301, University of Alberta - All rights Reserved. You may use, distribute, or modify, this code under the terms and conditions of Code of Student Behaviour at University of Alberta.
 * You can find a copy of this licence in this project. otherwise, please contact contact@abc.ca
 */

package ca.ualberta.cs.lonelytwitter;

/**
 * Created by sydia on 1/19/17.
 */

/**
 *
 * Interface to determine if an object is Tweetable
 */
public interface Tweetable {
    public String getMessage();
    public void setMessage(String string) throws TweetTooLongException;

}
