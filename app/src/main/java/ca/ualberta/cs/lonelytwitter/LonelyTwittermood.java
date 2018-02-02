/*
 * Copyright (c) 2018 Twitter X. CMPUT301 University of Alberta-All right Reserved. You may use, distribute and modify this code under team and conditions of the code of Student behaivor at University of ALberta.
 * You can find copy of linence in this project. Or connect with chuyang1@ualberta.ca
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/** not use class from old version
 *
 * Created by suqing on 19/01/18.
 */

public abstract class LonelyTwittermood {
    private Date times;

    public LonelyTwittermood() {
        super();
        times = new Date();
    }

    /**
     * get the time
     * @return time
     */

    public Date getTimestamp() {
        return times;
    }

    /**
     * set the time
     *
     * @param timestamp time what to set
     */

    public void setTimestamp(Date timestamp) {
        this.times = timestamp;
    }
}
