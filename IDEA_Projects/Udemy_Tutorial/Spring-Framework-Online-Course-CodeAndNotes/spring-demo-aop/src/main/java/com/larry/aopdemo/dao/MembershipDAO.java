package com.larry.aopdemo.dao;

import org.springframework.stereotype.Component;

/**
 * Created by hangyanjiang on 2017/6/13.
 */

@Component
public class MembershipDAO {

    public boolean addSillyMember() {
        System.out.println(getClass() + ": DOING STUFF: ADDING A MEMBERSHIP ACCOUNT");
        return true;
    }

    public void geToSleep() {

        System.out.println(getClass() + ": I'm GOING TO SLEEP NOW");

    }

}
