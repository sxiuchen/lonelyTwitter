package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by suqing on 19/01/18.
 */

public class HappyMood extends LonelyTwittermood {

    private String text = "Happy WoW";

    public HappyMood() {
        super();
    }

    public String Get_Mood() {
        return text;
    }
}
