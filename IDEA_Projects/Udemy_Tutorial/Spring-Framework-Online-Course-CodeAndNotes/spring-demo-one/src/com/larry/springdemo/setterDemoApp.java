package com.larry.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hangyanjiang on 2017/6/8.
 */
public class setterDemoApp {

    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        CricketCoach myCoach = context.getBean("myCricketCoach", CricketCoach .class);

        // call method on bean
        System.out.println(myCoach.getDailyWorkout());
        System.out.println(myCoach.getDailyFortune());
        System.out.println(myCoach.getEmailAddress());
        System.out.println(myCoach.getTeam());

        // close the context
        context.close();
    }

}
