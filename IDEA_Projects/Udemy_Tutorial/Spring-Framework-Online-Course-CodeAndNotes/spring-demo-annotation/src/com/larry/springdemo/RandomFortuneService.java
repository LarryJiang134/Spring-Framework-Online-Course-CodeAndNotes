package com.larry.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Created by hangyanjiang on 2017/6/9.
 */

@Component
public class RandomFortuneService implements FortuneService {

    // create an array of strings
    private String[] data = {
            "Be aware of the wolf in sheep's clothing",
            "Diligence is the mother of luck",
            "The journey is the reward"
    };

    private Random myRandom = new Random();

    @Override
    public String getFortune() {
        int index = myRandom.nextInt(data.length);
        String theFortune = data[index];
        return theFortune;
    }

}
