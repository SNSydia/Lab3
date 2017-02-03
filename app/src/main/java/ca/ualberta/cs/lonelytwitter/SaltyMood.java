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
 * Extends the abstract class Mood, with extra bitterness.
 * Provides getMoodFormatString, which returns mood of tweet.
 */

public class SaltyMood extends Mood {

    private String newMood =  "I hate this world!";

    public SaltyMood(Date date, String mood) {
        super(date, mood);
        setMood(newMood);
    }

    /**
     * Method will get s Stringified version of the mood.
     * @return newMood String.
     */
    @Override
    public String getMoodFormatString(){

        return newMood;
    }


}
