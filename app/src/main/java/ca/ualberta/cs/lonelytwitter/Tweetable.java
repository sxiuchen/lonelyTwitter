
/*
 * Copyright (c) 2018 Twitter X. CMPUT301 University of Alberta-All right Reserved. You may use, distribute and modify this code under team and conditions of the code of Student behaivor at University of ALberta.
 * You can find copy of linence in this project. Or connect with chuyang1@ualberta.ca
 */

package ca.ualberta.cs.lonelytwitter;

/**
 * The data struct of tweet
 *
 * Created by dezfuli on 1/16/18.
 */
import java.util.Date;

public interface Tweetable {
    public String getMessage();
    public Date getDate();
}