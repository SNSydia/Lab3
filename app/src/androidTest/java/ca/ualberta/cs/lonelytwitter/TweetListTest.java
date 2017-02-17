package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;

/**
 * Created by sydia on 2/16/17.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest() {
        super(LonelyTwitterActivity.class);
    }
    public void testGetCount(){
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("Tweet One");

        assertEquals(tweets.getCount(), 0);

        tweets.add(tweet);

        assertEquals(tweets.getCount(), 1);

    }

    public void testAddTweet(){
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("some tweet");
        tweets.add(tweet);

        //tweets.add(tweet); //Throws IllegalArguementException

        assertTrue(tweets.hasTweet(tweet));
    }

    public void testHasTweet(){
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("some tweet");
        tweets.add(tweet);

        assertTrue(tweets.hasTweet(tweet));
    }


    public void testGetTweets(){
        TweetList tweets = new TweetList();

        NormalTweet tweet = new NormalTweet("some tweet");
        tweets.add(tweet);

        tweet = new NormalTweet("Another tweet");
        tweets.add(tweet);

        ArrayList returnedTweets = tweets.getTweets();

        NormalTweet returnedTweet = (NormalTweet) returnedTweets.get(0);
        NormalTweet returnedTweet2 = (NormalTweet) returnedTweets.get(1);

        // Date() Only provides accuracy to daylong intervals.
        // so we have to check to see if the first tweet was created before
        // or during the same day the second tweet was created
        assertTrue(returnedTweet.getDate().before(returnedTweet2.getDate())
                || returnedTweet.getDate().equals(returnedTweet2.getDate()) );

    }

    public void testGetTweet(){
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("some tweet");

        tweets.add(tweet);
        NormalTweet returnedTweet = tweets.getTweet(0);
        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
        assertEquals(returnedTweet.getDate(), tweet.getDate());
    }

    public void testDeleteTweet(){
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("some tweet");

        tweets.add(tweet);
        tweets.delete(tweet);
        assertFalse(tweets.hasTweet(tweet));

    }



}
