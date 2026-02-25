// one to one : 
package com.example.main;

import java.util.Scanner;
import org.hibernate.Session;

import com.example.entity.*;
import com.example.util.HibernateUtil;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Session session = HibernateUtil.getFactory().openSession();

        // Dynamic input
        System.out.print("Enter person name: ");
        String name = sc.nextLine();

        System.out.print("Enter passport number: ");
        String passportNumber = sc.nextLine();

        // Create objects
        Person p = new Person();
        p.setName(name);

        Passport pass = new Passport();
        pass.setNumber(passportNumber);

        // One-to-One mapping
        p.setPassport(pass);

        // Save
        session.beginTransaction();
        session.persist(p);
        session.getTransaction().commit();

        session.close();
        sc.close();

        System.out.println("\nPerson and Passport saved successfully!");
    }
}