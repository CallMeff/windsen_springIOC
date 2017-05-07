package com.feng.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by TTfly on 2017/5/7.
 */
@Component
public class DogPlay {

    @Autowired
    private Dog dog;

    public void play(){
        dog.bark();
    }
}
