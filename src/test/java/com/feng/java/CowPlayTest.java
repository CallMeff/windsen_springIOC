package com.feng.java;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by TTfly on 2017/5/7.
 */
public class CowPlayTest {

    private static AnnotationConfigApplicationContext context;

    @BeforeClass
    public static void bc(){
        context = new AnnotationConfigApplicationContext(CowPlayConfig.class);
    }

    @Test
    public void testPlay(){
        CowPlay cowPlay = (CowPlay) context.getBean("CowPlay");
        cowPlay.play();
    }


}
