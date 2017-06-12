package com.larry.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 * Created by hangyanjiang on 2017/6/12.
 */
public class TestJdbc {

    public static void main(String[] args) {

        String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?userSSL=false";
        String user = "hbstudent";
        String pass = "hbstudent";

        try {

            System.out.println(">> Connecting to database: " + jdbcUrl);

            Connection myConn =
                    DriverManager.getConnection(jdbcUrl, user, pass);

            System.out.println(">> Connection successful");

        } catch (Exception exc) {
            exc.printStackTrace();
        }

    }

}
