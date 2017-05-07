package com.feng.annotation;

import org.springframework.stereotype.Component;

/**
 * Created by TTfly on 2017/5/7.
 */
@Component
public class Dog {

    public void bark() {
        System.out.print("I am a dog 汪汪汪 ...");
    }
}
