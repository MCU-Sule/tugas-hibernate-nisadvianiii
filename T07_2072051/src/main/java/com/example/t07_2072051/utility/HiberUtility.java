package com.example.t07_2072051.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HiberUtility {
    public static Session getSession() {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        return sf.openSession();
    }
}
