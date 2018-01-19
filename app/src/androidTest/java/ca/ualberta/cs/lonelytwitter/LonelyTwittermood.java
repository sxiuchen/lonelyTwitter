package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by suqing on 19/01/18.
 */

public class  LonelyTwittermood {
    private Date times;
    private String text;

    public String getText() {
        return text;
    }

    public LonelyTwittermood(String text) {
        super();
        this.text = text;
        times = new Date();
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getTime() {
        return times;
    }

    public void setTime(Date timestamp) {
        this.times = timestamp;
    }
}

public abstract class  LonelyTittermood1 {
    private Date times;
    private String text;

    public String getText() {
        return text;
    }

    public LonelyTwittermood(String text) {
        super();
        this.text = text;
        times = new Date();
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getTime() {
        return times;
    }

    public void setTime(Date timestamp) {
        this.times = timestamp;
    }
}
