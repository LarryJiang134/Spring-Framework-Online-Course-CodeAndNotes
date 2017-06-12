package com.larry.hibernate.demo;

import com.larry.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by hangyanjiang on 2017/6/12.
 */
public class ReadStudentDemo {

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
            Student tempStudent = new Student("Daffy", "Duck", "daffy@larry.com");

            // use the session object to save java object
            session.beginTransaction();

            // start a transaction
            System.out.println(">> Saving the student...");
            System.out.println(tempStudent);
            session.save(tempStudent);

            // commit transaction
            session.getTransaction().commit();

            // new code
            // find out the student's id: primary key
            System.out.println(">>Saved student. Generated id: " + tempStudent.getId());

            // now get a new session and start a transaction
            session = factory.getCurrentSession();
            session.beginTransaction();

            // retrieve student based on the id: primary key
            System.out.println("\n>>Getting student with id: " + tempStudent.getId());
            Student myStudent = session.get(Student.class, tempStudent.getId());
            System.out.println(">>Get complete: " + myStudent);

            // commit the transaction
            session.getTransaction().commit();

            System.out.println(">> Done!");
        }
        finally {
            factory.close();
        }
    }

}
