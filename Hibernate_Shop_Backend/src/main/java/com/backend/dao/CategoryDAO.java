package com.backend.dao;

import java.util.List;

import javax.management.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.backend.pojos.Category;
import com.backend.pojos.Customer;

public class CategoryDAO {
	Configuration cf = null;
	SessionFactory sessionFactory = null;
	public CategoryDAO(String configurationFile) {
		cf = new Configuration();
		cf = cf.configure(configurationFile);
		sessionFactory = cf.buildSessionFactory();
	}
	public void save(Category category) {
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		try {
			session.save(category);
			t.commit();
			System.out.println("Save category successfully !");
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			t.rollback();
		} finally {
			sessionFactory.close();
			session.close();
		}
	}

	public List<Category> getAll() {
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		try {
			List<Category> ds = session.createQuery("Select c from category c").list();
			return ds;
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			t.rollback();
			return null;
		} finally {
			session.close();
		}
	}

	public Category findById(int id) {
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		Category category= null;
		try {
			category=(Category) session.get(Category.class, id);
			return category;
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			t.rollback();
			return null;
		} finally {
			session.close();
		}
	}

	public void delete(int id) {
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		try {
			Category category = (Category) session.get(Category.class, id);
			if(category!=null) {
				category.setStatus(false);
			}
			t.commit();
			System.out.println("Delete category successfully !");
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			t.rollback();
		} finally {
			session.close();
		}
	}

	public void update(Category category) {
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		try {
			session.update(category);
			t.commit();
			System.out.println("Update category successfully !");
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			t.rollback();
		} finally {
			session.close();
		}
	}

}
