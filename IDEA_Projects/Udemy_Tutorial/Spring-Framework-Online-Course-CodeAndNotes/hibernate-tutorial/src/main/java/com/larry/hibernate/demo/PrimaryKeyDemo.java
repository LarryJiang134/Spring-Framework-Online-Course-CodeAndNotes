package com.larry.hibernate.demo;

import com.larry.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by hangyanjiang on 2017/6/12.
 */
public class PrimaryKeyDemo {

    public static void main(String[] args) {
        // create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        // create a session
        Session session = factory.getCurrentSession();

        try {
            // create 3 student objects
            System.out.println(">> Creating 3 student objects...");
            Student tempStudent1 = new Student("John", "Doe", "paul@larry.com");
            Student tempStudent2 = new Student("Mary", "public", "mary@larry.com");
            Student tempStudent3 = new Student("Bonita", "Applebum", "bonita@larry.com");

            // use the session object to save java object
            session.beginTransaction();

            // start a transaction
            System.out.println(">> Saving the students...");
            session.save(tempStudent1);
            session.save(tempStudent2);
            session.save(tempStudent3);

            // commit transaction
            session.getTransaction().commit();
            System.out.println(">> Done!");
        }
        finally {
            factory.close();
        }
    }

}
