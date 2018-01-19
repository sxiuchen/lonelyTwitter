package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by suqing on 19/01/18.
 */

public abstract class  LonelyTwittermood {
    private Date times;

    public LonelyTwittermood() {
        times = new Date();
    }

    public Date getTime() {
        return times;
    }

    public void setTime(Date timestamp) {
        this.times = timestamp;
    }

    public abstract String Get_Mood();
}

