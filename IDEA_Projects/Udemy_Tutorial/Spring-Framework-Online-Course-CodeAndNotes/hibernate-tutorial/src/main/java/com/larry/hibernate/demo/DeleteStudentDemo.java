package com.larry.hibernate.demo;

import com.larry.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by hangyanjiang on 2017/6/12.
 */
public class DeleteStudentDemo {


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

            // delete the student
            // System.out.println(">> Deleting student: " + myStudent);
            // session.delete(myStudent);

            // delete student id=2
            // System.out.println(">> Deleting student id = 2");
            // session.createQuery("delete from Student where id=2").executeUpdate();

            // commit the transaction
            session.getTransaction().commit();

            System.out.println(">> Done!");
        }
        finally {
            factory.close();
        }
    }

}
