package com.feng.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by TTfly on 2017/5/7.
 */
@Configuration
public class CowPlayConfig {

    @Bean
    public Cow getCow(){
        return new Cow();
    }

    @Bean(name = "CowPlay")
    public CowPlay getCowPlay(Cow cow){
        return new CowPlay(cow);
    }
}
