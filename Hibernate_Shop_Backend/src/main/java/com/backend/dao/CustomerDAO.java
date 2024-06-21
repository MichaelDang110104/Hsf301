package com.backend.dao;

import java.util.List;

import javax.management.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.backend.pojos.Customer;

public class CustomerDAO {
	private Configuration cf = null;
	private SessionFactory sessionFactory = null;

	public CustomerDAO(String configurationFile) {
		cf = new Configuration();
		cf = cf.configure(configurationFile);
		sessionFactory = cf.buildSessionFactory();
	}

	public void save(Customer account) {
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		try {
			session.save(account);
			t.commit();
			System.out.println("Save customer successfully !");
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			t.rollback();
		} finally {
			sessionFactory.close();
			session.close();
		}
	}

	public List<Customer> getAll() {
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		try {
			List<Customer> ds = session.createQuery("Select c from Customer c").list();
			return ds;
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			t.rollback();
			return null;
		} finally {
			session.close();
		}
	}

	public Customer findCustomer(String email, String password) {
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		Customer account = null;

		try {
			// Use a parameterized query to fetch the account directly
			String hql = "Select c from Customer where c.email = : email and c.password = : password";
			Query query = (Query) session.createQuery(hql, Customer.class);
			((org.hibernate.query.Query) query).setParameter("email",email);
			((org.hibernate.query.Query) query).setParameter("password", password);
			account = (Customer) ((org.hibernate.query.Query) query).uniqueResult();
			t.commit();
			return account;
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			t.rollback();
			return null;
		} finally {
			session.close();
		}
	}

	public void delete(String email) {
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		try {
			Customer account = (Customer) session.get(Customer.class, email);
			if(account!=null) {
				account.setStatus(false);
			}
			t.commit();
			System.out.println("Delete customer successfully !");
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			t.rollback();
		} finally {
			session.close();
		}
	}

	public void update(Customer account) {
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		try {
			session.update(account);
			t.commit();
			System.out.println("Update customer successfully !");
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			t.rollback();
		} finally {
			session.close();
		}
	}

}
