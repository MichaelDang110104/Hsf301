package com.backend.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.backend.pojos.Promotion;
import com.backend.pojos.Warranty;

public class WarrantyDAO {
	private SessionFactory sessionFactory = null;
	private Configuration cf = null;

	public WarrantyDAO(String configurationFile) {
		cf = new Configuration();
		cf = cf.configure(configurationFile);
		sessionFactory = cf.buildSessionFactory();
	}

	public void save(Warranty warranty) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.save(warranty);
			transaction.commit();
			System.out.println("Save warranty successfully !");
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
			Warranty warranty = (Warranty) session.get(Warranty.class, id);
			if (warranty != null) {
				warranty.setStatus(false);
			}
			transaction.commit();
			System.out.println("Delete warranty successfully !");
		} catch (Exception e) {
			transaction.rollback();
			System.out.println("Error: " + e.getMessage());
		} finally {
			session.close();
		}
	}

	public void update(Warranty warranty) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.update(warranty);
			transaction.commit();
			System.out.println("Update warranty succesfully !");
		} catch (Exception e) {
			transaction.rollback();
			System.err.println("Error: " + e.getMessage());
		} finally {
			session.close();
		}
	}

	public List<Warranty> getAll() {
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		try {
			List<Warranty> list = session.createQuery("SELECT warranty FROM Warranty warranty", Warranty.class).list();
			return list;
		} catch (Exception e) {
			t.rollback();
			System.out.println("Error: " + e.getMessage());
		} finally {
			session.close();
		}
		return null;
	}

	public Warranty findById(int id) {
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		try {
			return (Warranty) session.get(Warranty.class, id);
		} catch (Exception e) {
			t.rollback();
			System.out.println("Error: " + e.getMessage());
			return null;
		} finally {
			session.close();
		}
	}

}
