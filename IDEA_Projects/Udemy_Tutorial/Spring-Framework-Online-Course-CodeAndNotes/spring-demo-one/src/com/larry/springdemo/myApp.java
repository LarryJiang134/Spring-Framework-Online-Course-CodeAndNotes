package com.larry.springdemo;

/**
 * Created by hangyanjiang on 2017/6/8.
 */
public class myApp {
    public static void main(String[] args) {

        // create the object
        Coach theCoach = new TrackCoach();


        // Use the object
        System.out.println(theCoach.getDailyWorkout());

    }
}
