package com.larry.springdemo;

/**
 * Created by hangyanjiang on 2017/6/9.
 */
public class SadFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is a sad day";
    }

}
