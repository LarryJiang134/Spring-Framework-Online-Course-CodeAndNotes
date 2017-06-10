package com.larry.springdemo;

import org.springframework.stereotype.Component;

/**
 * Created by hangyanjiang on 2017/6/9.
 */

@Component
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "today is your lucky day!";
    }

}
