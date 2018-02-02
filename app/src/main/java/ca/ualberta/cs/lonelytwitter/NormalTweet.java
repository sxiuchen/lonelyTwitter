/*
 * Copyright (c) 2018 Twitter X. CMPUT301 University of Alberta-All right Reserved. You may use, distribute and modify this code under team and conditions of the code of Student behaivor at University of ALberta.
 * You can find copy of linence in this project. Or connect with chuyang1@ualberta.ca
 */

package ca.ualberta.cs.lonelytwitter;

/**
 * represent normal tweet
 * Created by dezfuli on 1/16/18.
 *
 *  @param message tweet message
 *  @param date tweet date
 */
import java.util.Date;

public class NormalTweet extends Tweet {
    NormalTweet(String message){
        super(message);
    }

    NormalTweet(String message, Date date){
        super(message, date);
    }

    /**
     * always return false since it is a normal class
     *
     * @return bool false
     */
    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}