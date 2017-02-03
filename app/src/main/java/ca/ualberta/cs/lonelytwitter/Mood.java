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
 * Abstract class which creates different type of Mood objects
 * depending on the implementation within the subclasses.
 */

public abstract class Mood {

    /**
     * provides Date of mood creation
     */
    private Date date;

    /**
     * Returns a string of the mood
     * @return String mood
     */
    public String getMood() {
        return mood;
    }


    /**
     * Sets the mood of the Mood object to mood
     * @param mood
     */
    public void setMood(String mood) {
        this.mood = mood;
    }


    /**
     * Description/name of the mood
     */
    private String mood;
    // Constructor
    public Mood(Date date, String mood) {
        this.date = date;
        this.mood = mood;
    }

    // Default Constructor
    public Mood(){
        super();
        this.date = new Date();
    }

    /**
     * Returns date of mood creation
     * @return Date date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets date of mood creation
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Provides a string of the current mood the Mood object is experiencing
     * @return Mood moon
     */
    public String CurrentMood(){
        return mood;
    }

    /**
     *
     * Abstract Method to convert mood to String and return it.
     * Return value varies depending on implimentation in subclass
     * @return
     */
    public abstract String getMoodFormatString();

}
