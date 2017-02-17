package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by sydia on 2/16/17.
 */

public class TweetList {
    private ArrayList<NormalTweet> tweets = new ArrayList<NormalTweet>();

    public void add(NormalTweet tweet){
        if (tweets.contains(tweet))
            throw new IllegalArgumentException();

        tweets.add(tweet);

    }

    public boolean hasTweet(Tweet tweet){

        return tweets.contains(tweet);
    }

    public NormalTweet getTweet(int index){
        return tweets.get(index);
    }

    public ArrayList<NormalTweet> getTweets(){
        return tweets; //tweets are stored chronologically by default
    }

    public void delete(NormalTweet tweet){

    }

    public int getCount(){
        return tweets.size();
    }
}
