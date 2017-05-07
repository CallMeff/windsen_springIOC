package com.feng.xml;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by TTfly on 2017/5/7.
 */
public class CatPlayTest {

    private static ClassPathXmlApplicationContext context;

    @BeforeClass
    public static void bt(){
        context = new ClassPathXmlApplicationContext("applicationContext_X.xml");
    }

    @Test
    public void play(){
        CatPlay catPlay = (CatPlay) context.getBean("CatPlay");
        catPlay.play();
    }
}
