

/*
 * Class: Tweet
 * Version: 1.0.0
 * Date: 30/01/2018
 * Copyright (c) 2018 Twitter X. adfad
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * This class Tweet represent the tweet.
 * Creadted by chuyang1 on 30/01/2018
 * @param NormalTweet
 * @param ImportantTweet
 */
public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;

    Tweet(String message){

        this.message = message;
        date = new Date();
//        message = message;
    }

    /**
     * Constructs a tweet object
     *
     * @param message tweet message
     * @param date tweet date
     */
    Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    public String getMessage(){
        return message;
    }

    /**
     * Sets Tweet message
     *
     * @param message Tweet message
     * @throws TweetTooLongException the tweet message is over 140 characters
     */

    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() < 140){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }
    }

    public Date getDate(){
        return date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public abstract Boolean isImportant();

    public String toString() {
        return date.toString() + " | " + message;
    }

}