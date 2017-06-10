package com.larry.springdemo;

/**
 * Created by hangyanjiang on 2017/6/8.
 */
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
