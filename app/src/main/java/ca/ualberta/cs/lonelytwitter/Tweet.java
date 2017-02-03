/*
 * Copyright (c) 2017. Team X, CMPUT 301, University of Alberta - All rights Reserved. You may use, distribute, or modify, this code under the terms and conditions of Code of Student Behaviour at University of Alberta.
 * You can find a copy of this licence in this project. otherwise, please contact contact@abc.ca
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by sydia on 1/19/17.
 */


/**
 * An abstract class to form Tweets. Impliments the Tweetable class
 * In this class, Tweet objects are created.
 */
public abstract class Tweet implements Tweetable{
    private Date date;

    /**
     * The Tweet message, in String format.
     * @see #getMessage()
     * @see #setMessage(String)
     */
    private String message;
    private ArrayList<Mood> MoodList = new ArrayList<Mood>();

    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }
    // Class Constructor
    public Tweet(Date date, String message){
        this.message = message;
        this.date = new Date();
    }

    public Tweet(String message, Mood mood) {
        this.message = message;
        this.date = new Date();
        this.MoodList.add(mood);
    }

    // Another constructor
    public Tweet(Date date, String message, Mood mood){
        this.message = message;
        this.date = date;
        this.MoodList.add(mood);
    }
    // DEFAULT CONSTRUCTOR //Takes no arguments
    public Tweet(){
        super();
        this.date = new Date();
    }


    /**Gets the date the tweet was created
     *
     * @return Date date
     */
    public Date getDate() {
        return date;
    }


    /**
     * Sets the date the tweet was created
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Gets the tweet message
     * @return String message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the tweet message
     * @param message
     * @throws TweetTooLongException if tweet is longer than 140 chars
     */
    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() > 140){
            throw new TweetTooLongException();
        }

        this.message = message;
    }

    /**
     * Method to return a list of moods associated with each tweet
     * @return ArrayList<Mood> Moodlist
     */
    public ArrayList<Mood> getMoodList() {
        return MoodList;
    }

    /**
     * Method to set the Tweet object's list of Moods
     * @param moodList
     */
    public void setMoodList(ArrayList<Mood> moodList) {
        MoodList = moodList;
    }

    /**
     * Adds a possible mood to the Tweets moodlist
     * @param mood
     */
    public void addMood(Mood mood) {
        this.MoodList.add(mood);
    }

    /**
     * Abstract method imoplimented in each Tweet subclass
     * @return true or false depending on implimentation within subclass
     */
    public abstract Boolean isImportant();

    /**
     * converts Tweet date to string, concatenates with message,  and returns it
     * @return String date.toString() + " | " + message
     */
    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }
}
