/*
 * Copyright (c) 2018 Twitter X. CMPUT301 University of Alberta-All right Reserved. You may use, distribute and modify this code under team and conditions of the code of Student behaivor at University of ALberta.
 * You can find copy of linence in this project. Or connect with chuyang1@ualberta.ca
 */

package ca.ualberta.cs.lonelytwitter;

/**
 * Created by dezfuli on 1/16/18.
 *  represent the important class
 *  @param message tweet message
 *  @param date tweet date
 */
import java.util.Date;

public class ImportantTweet extends Tweet {
    ImportantTweet(String message){
        super(message);
    }

    ImportantTweet(String message, Date date){
        super(message, date);
    }

    /**
     * overwrite the function
     * check is important or not
     *
     * @return bool true
     */
    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}