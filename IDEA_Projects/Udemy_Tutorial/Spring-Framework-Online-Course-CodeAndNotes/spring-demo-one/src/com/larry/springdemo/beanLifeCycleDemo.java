package com.larry.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hangyanjiang on 2017/6/8.
 */
public class beanLifeCycleDemo {

    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        // close the context
        context.close();

    }

}
