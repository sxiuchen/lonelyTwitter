package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by suqing on 19/01/18.
 */

public abstract class LonelyTwittermood {
    private Date times;

    public LonelyTwittermood() {
        super();
        times = new Date();
    }

    public Date getTimestamp() {
        return times;
    }

    public void setTimestamp(Date timestamp) {
        this.times = timestamp;
    }
}
