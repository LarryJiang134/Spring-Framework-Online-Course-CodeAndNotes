package com.larry.hibernate.demo;

import com.larry.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * Created by hangyanjiang on 2017/6/12.
 */
public class QueryStudentDemo {

    public static void main(String[] args) {
        // create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        // create a session
        Session session = factory.getCurrentSession();

        try {
            // use the session object to save java object
            session.beginTransaction();

            // query students
            List<Student> theStudents = session.createQuery("from Student").list();

            // display the students
            displayTheStudents(theStudents);

            // query students: lastName = 'Doe'
            theStudents = session.createQuery("from Student s where s.lastName='Doe'").list();

            // display the students
            System.out.println("\n\n>> Students who have last name of Doe");
            displayTheStudents(theStudents);

            // query students: last = 'Doe' or 'Daffy'
            theStudents =
                    session.createQuery("from Student s where "
                    + "s.lastName='Doe' OR s.firstName='Daffy'").list();
            System.out.println("\n\n>> Students who have last name of Doe OR first name of Daffy");
            displayTheStudents(theStudents);

            // query students: last = 'Doe' or 'Daffy'
            theStudents =
                    session.createQuery("from Student s where "
                            + "s.email LIKE '%larry.com'").list();
            System.out.println("\n\n>> Students who have email ends with 'larry.com'");
            displayTheStudents(theStudents);

            // commit transaction
            session.getTransaction().commit();
            System.out.println(">> Done!");
        }
        finally {
            factory.close();
        }
    }

    private static void displayTheStudents(List<Student> theStudents) {
        for (Student tempStudent : theStudents) {
            System.out.println(tempStudent);
        }
    }

}
