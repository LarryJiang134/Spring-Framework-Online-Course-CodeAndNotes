package com.larry.hibernate.demo;

import com.larry.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by hangyanjiang on 2017/6/12.
 */

public class CreateStudentDemo {

    public static void main(String[] args) {
        // create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        // create a session
        Session session = factory.getCurrentSession();

        try {
            // create a student object
            System.out.println(">> Creating new student object...");
            Student tempStudent = new Student("Paul", "Wall", "paul@larry.com");

            // use the session object to save java object
            session.beginTransaction();

            // start a transaction
            System.out.println(">> Saving the student...");
            session.save(tempStudent);

            // commit transaction
            session.getTransaction().commit();
            System.out.println(">> Done!");

        }
        finally {
            factory.close();
        }
    }

}
