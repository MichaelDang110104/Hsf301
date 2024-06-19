package com.backend.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.backend.pojos.Product;


public class ProductDAO {
	private SessionFactory sessionFactory = null;
	private Configuration cf = null;
	
	public ProductDAO(String persitanceName) {
		cf = new Configuration();
		cf = cf.configure(persitanceName);
		sessionFactory = cf.buildSessionFactory();
	}
	
	public void save(Product product) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.save(product);
			transaction.commit();
			System.out.println("Successfully saved");
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
	        Product product = (Product) session.get(Product.class, id);
	        if (product != null) {
	            product.setStatus(false); 
	            session.update(product);
	        }
	        transaction.commit();
	    } catch (Exception e) {
	        transaction.rollback();
	        throw e;
	    } finally {
	        session.close();
	    }
	}

	
	public void update(Product product) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.update(product);
			transaction.commit();
			System.out.println("Update succesfully");
		} catch (Exception e) {
			transaction.rollback();
			System.err.println("Error: " + e.getMessage());
		} finally {
			session.close();
		}
	}
	
	public List<Product> getAllProduct() {
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		try {
			t.begin();
			List<Product> list = session.createQuery("SELECT *FROM [dbo].[PRODUCT]", Product.class).list();
			t.commit();
			return list;
		} catch (Exception e) {
			t.rollback();
			System.out.println("Error: " + e.getMessage());
		} finally {
			session.close();
		}
		return null;
	}
	
	public Product findById(int id) {
		Session session = sessionFactory.openSession();
		try {
			return (Product) session.get(Product.class, id);
		} catch (Exception e) {
			throw e;
		} finally {
			session.close();
		}
	}
	
	
}
