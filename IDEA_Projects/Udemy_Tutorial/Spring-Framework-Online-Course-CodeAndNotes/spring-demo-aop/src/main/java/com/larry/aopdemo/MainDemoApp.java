package com.larry.aopdemo;

import com.larry.aopdemo.dao.AccountDAO;
import com.larry.aopdemo.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Member;

/**
 * Created by hangyanjiang on 2017/6/13.
 */
public class MainDemoApp {

    public static void main(String[] args) {

        // read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DemoConfig.class);

        // get the bean from spring container
        AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);

        // get membership bean from spring container
        MembershipDAO theMembershipDAO =
                context.getBean("membershipDAO", MembershipDAO.class);

        // call the business method
        Account myAccount = new Account();
        theAccountDAO.addAccount(myAccount, true);
        theAccountDAO.deWork();

        // call the membership business method
        theMembershipDAO.addSillyMember();
        theMembershipDAO.geToSleep();

        // close the context
        context.close();

    }

}
