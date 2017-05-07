package com.feng.annotation;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by TTfly on 2017/5/7.
 */
public class DogPlayTest {

    private static ClassPathXmlApplicationContext context;

    @BeforeClass
    public static void bc(){
        context = new ClassPathXmlApplicationContext("applicationContext_A.xml");
    }

    @Test
    public void testPlay(){
        DogPlay dogPlay = (DogPlay) context.getBean("dogPlay");
        dogPlay.play();
    }
}
