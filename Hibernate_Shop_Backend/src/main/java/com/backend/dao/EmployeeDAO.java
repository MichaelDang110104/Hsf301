package com.backend.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.backend.pojos.Employee;

public class EmployeeDAO {
	private SessionFactory sessionFactory = null;
	private Configuration cf = null;
	
	public EmployeeDAO(String persitanceName) {
		cf = new Configuration();
		cf = cf.configure(persitanceName);
		sessionFactory = cf.buildSessionFactory();
	}
	
	public void save(Employee employee) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.save(employee);
			transaction.commit();
			System.out.println("Save employee successfully !");
		} catch (Exception e) {
			transaction.rollback();
			System.err.println("Error: " + e.getMessage());
		} finally {
			sessionFactory.close();
			session.close();
		}
	}
	
	public void delete(int id) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			transaction.begin();
			Employee employee = (Employee) session.get(Employee.class, id);
			if(employee!=null) {
				employee.setStatus(false);
			}
			transaction.commit();
			System.out.println("Delete employee successfully !");
		} catch (Exception e) {
			transaction.rollback();
			throw e;
		} finally {
			sessionFactory.close();
			session.close();
		}
	}
	
	public void update(Employee employee) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.update(employee);
			transaction.commit();
			System.out.println("Update employee succesfully !");
		} catch (Exception e) {
			transaction.rollback();
			System.err.println("Error: " + e.getMessage());
		} finally {
			session.close();
		}
	}
	
	public List<Employee> getAll() {
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		try {
			t.begin();
			List<Employee> list = session.createQuery("SELECT e  FROM Employee e", Employee.class).list();
			return list;
		} catch (Exception e) {
			t.rollback();
			System.out.println("Error: " + e.getMessage());
		} finally {
			session.close();
		}
		return null;
	}
	
	public Employee findById(int id) {
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		try {
			return (Employee) session.get(Employee.class, id);
		} catch (Exception e) {
			System.out.println("Error: "+e.getMessage());
			t.rollback();
			return null;
		} finally {
			session.close();
		}
	}
}
