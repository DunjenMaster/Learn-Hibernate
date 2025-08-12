package com.utkarsh;


import jakarta.persistence.Column;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;

@SpringBootConfiguration
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

        Student s1 = new Student();

        s1.setRollNo(11);
        s1.setsName("Utsav");
        s1.setsAge(26);

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(com.utkarsh.Student.class);
        cfg.configure() ;

        Session session;
        try (SessionFactory sf = cfg.buildSessionFactory()) {
            session = sf.openSession();
        }

        Transaction transaction = session.beginTransaction();

        session.persist(s1);

        transaction.commit();

        System.out.println(s1);
    }
}