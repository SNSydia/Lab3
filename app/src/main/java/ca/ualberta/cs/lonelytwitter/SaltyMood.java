package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by sydia on 1/19/17.
 */

public class SaltyMood extends Mood {

    private String newMood =  "I'm finally happy!";

    public HappyMood(Date date, String mood) {
        super(date, mood);
    }

    @Override
    public String getMoodFormatString(){
        setMood(newMood);
        return newMood;
    }


}
