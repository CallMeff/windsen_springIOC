package com.feng.java;

/**
 * Created by TTfly on 2017/5/7.
 */
public class CowPlay {
    private Cow cow;

    public CowPlay(Cow cow) {
        this.cow = cow;
    }

    public void play(){
        cow.bark();
    }
}
