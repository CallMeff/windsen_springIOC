package com.feng.xml;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by TTfly on 2017/5/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext_X.xml")
public class CatPlaySpringTest {

    @Autowired
    private CatPlay catPlay;

    @Test
    public void play(){
        catPlay.play();
    }
}
