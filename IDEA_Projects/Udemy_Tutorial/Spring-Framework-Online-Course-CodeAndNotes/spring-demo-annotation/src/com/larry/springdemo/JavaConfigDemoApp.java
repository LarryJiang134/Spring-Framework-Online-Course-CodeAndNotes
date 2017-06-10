package com.larry.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by hangyanjiang on 2017/6/9.
 */
public class JavaConfigDemoApp {

    public static void main(String[] args) {

        // read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // get the beam from spring container
        // Coach theCoach = context.getBean("thatSillyCoach", Coach.class);

        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        // call method to get daily fortune
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();

    }

}
