package com.larry.aopdemo.dao;

import org.springframework.stereotype.Component;

/**
 * Created by hangyanjiang on 2017/6/13.
 */

@Component
public class AccountDAO {

    public void addAccount() {
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
    }

}
