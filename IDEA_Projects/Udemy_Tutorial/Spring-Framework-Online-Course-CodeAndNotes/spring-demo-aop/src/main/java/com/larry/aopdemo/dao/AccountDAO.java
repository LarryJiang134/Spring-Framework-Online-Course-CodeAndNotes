package com.larry.aopdemo.dao;

import com.larry.aopdemo.Account;
import org.springframework.stereotype.Component;

/**
 * Created by hangyanjiang on 2017/6/13.
 */

@Component
public class AccountDAO {

    public void addAccount(Account theAccount, boolean vipFlag) {
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
    }

    public boolean deWork () {
        System.out.println(getClass() + ": doWork()");
        return true;
    }

}
