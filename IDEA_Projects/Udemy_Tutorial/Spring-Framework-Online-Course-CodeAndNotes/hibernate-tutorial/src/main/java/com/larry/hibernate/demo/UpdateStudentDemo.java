package com.larry.hibernate.demo;

import com.larry.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by hangyanjiang on 2017/6/12.
 */
public class UpdateStudentDemo {

    public static void main(String[] args) {
        // create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        // create a session
        Session session = factory.getCurrentSession();

        try {

            int studentId = 1;

            // now get a new session and start a transaction
            session = factory.getCurrentSession();
            session.beginTransaction();

            // retrieve student based on the id: primary key
            System.out.println("\n>> Getting student with id: " + studentId);
            Student myStudent = session.get(Student.class, studentId);

            System.out.println(">> Updating student...");
            myStudent.setFirstName("Scoby");

            // commit the transaction
            session.getTransaction().commit();

            // new code
            session = factory.getCurrentSession();
            session.beginTransaction();

            // update email for all students
            System.out.println("Update email for all students");
            session.createQuery("update Student set email='foo@gmail.com'")
                    .executeUpdate();

            session.getTransaction().commit();

            System.out.println(">> Done!");
        }
        finally {
            factory.close();
        }
    }

}
