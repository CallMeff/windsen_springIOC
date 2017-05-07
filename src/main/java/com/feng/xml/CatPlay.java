package com.feng.xml;

/**
 * Created by TTfly on 2017/5/7.
 */
public class CatPlay {

    private Cat cat;

    public CatPlay(Cat cat){
        this.cat = cat;
    }

    public void play(){
        cat.bark();
    }
}
