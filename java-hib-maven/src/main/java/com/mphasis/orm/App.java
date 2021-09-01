package com.mphasis.orm;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Customer c1 = new Customer();
        c1.setFullName("Vincent");
        c1.setAcctBalance(12345);
        
        Customer c2 = new Customer();
        c1.setFullName("Mike");
        c1.setAcctBalance(98765);
        //        Customer c1 = new Customer(101, "Chase Smith", 50000);
//        Customer c2 = new Customer(102, "Rocky Smith", 40000);
//        Customer c3 = new Customer(103, "Hunter Smith", 70000);
        
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
//        session.save(c1);
//        session.save(c2);
        
        
        //SessionFactory annFacotry = new AnnotationConfiguration().buildSessionFactory();
        
        
        
        Query query = session.createQuery("from Customer as c");
        List<Customer> list = query.list();
        
        for (Customer c: list) {
            System.out.println(c.getCustId() + "--" + c.getFullName() + "--" + c.getAcctBalance());
        }
        session.getTransaction().commit();
        session.close();
        System.out.print(session);

        
    }
}