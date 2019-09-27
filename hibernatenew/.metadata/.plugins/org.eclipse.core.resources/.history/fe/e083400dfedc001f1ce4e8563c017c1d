package com.seed.emp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		Configuration c=cfg.configure();
		SessionFactory f=c.buildSessionFactory();
		Session session=f.openSession();
		Transaction tr=session.beginTransaction();
		Employee e=new Employee();
		e.setEmpId(1002);
		e.setName("rohin nikhade");
		session.save(e);
		WageEmployee we=new WageEmployee();
		we.setEmpId(2002);
		we.setName("Rohan Patil");
		we.setHours(9);
		we.setRate(89.00);
		session.save(we);
		SalesPerson sp=new SalesPerson();
		sp.setEmpId(9002);
		sp.setName("Rakesh");
		sp.setCommisions(90);
		sp.setSales(23);
		session.save(sp);
		System.out.println("All records added successfully ");
		tr.commit();
		session.flush();
		session.close();

	}

}
