
/*
 * Copyright (c) 2018 Twitter X. CMPUT301 University of Alberta-All right Reserved. You may use, distribute and modify this code under team and conditions of the code of Student behaivor at University of ALberta.
 * You can find copy of linence in this project. Or connect with chuyang1@ualberta.ca
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

    /**
     * get message from activity
     *
     * @return return tweet message
     */
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

    /**
     *  get data
     *
     * @return tweet data
     */

    public Date getDate(){
        return date;
    }

    /**
     * set data
     *
     * @param date tweet data
     */

    public void setDate(Date date){
        this.date = date;
    }

    /**
     * check tweet is important or not
     * empty now
     *
     * @return
     */

    public abstract Boolean isImportant();

    /**
     *  change data to string
     *
     * @return string data
     */

    public String toString() {
        return date.toString() + " | " + message;
    }

}