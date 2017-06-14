package com.larry.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by hangyanjiang on 2017/6/13.
 */

@Aspect
@Component
public class MyDemoLoggingAspect {

    // this is where we add all of our related advice for logging

    // let's start with an @Before advice

    //@Before("execution(public void addAccount())")

    // @Before("execution(* add*(com.larry.aopdemo.Account, ..))")

    // @Before("execution(* add*(..))")

    @Before("execution(* com.larry.aopdemo.dao.*.*(..))")

    public void beforeAddAccountAdvice() {
        System.out.println("\n====>>> Executing @Before advice on addAccount()");
    }

}
