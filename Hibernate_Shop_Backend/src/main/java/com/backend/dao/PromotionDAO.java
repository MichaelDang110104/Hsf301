package com.backend.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.backend.pojos.Promotion;

public class PromotionDAO {
	private SessionFactory sessionFactory = null;
	private Configuration cf = null;

	public PromotionDAO(String configurationFile) {
		cf = new Configuration();
		cf = cf.configure(configurationFile);
		sessionFactory = cf.buildSessionFactory();
	}

	public void save(Promotion promotion) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.save(promotion);
			transaction.commit();
			System.out.println("Save promotion successfully !");
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
			Promotion promotion = (Promotion) session.get(Promotion.class, id);
			if (promotion != null) {
				promotion.setStatus(false);
			}
			transaction.commit();
			System.out.println("Delete promotion successfully !");
		} catch (Exception e) {
			transaction.rollback();
			System.out.println("Error: " + e.getMessage());
		} finally {
			session.close();
		}
	}

	public void update(Promotion promotion) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.update(promotion);
			transaction.commit();
			System.out.println("Update promotion succesfully !");
		} catch (Exception e) {
			transaction.rollback();
			System.err.println("Error: " + e.getMessage());
		} finally {
			session.close();
		}
	}

	public List<Promotion> getAllProduct() {
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		try {
			List<Promotion> list = session.createQuery("SELECT promotion FROM Promotion promotion", Promotion.class)
					.list();
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

	public Promotion findById(int id) {
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		try {
			return (Promotion) session.get(Promotion.class, id);
		} catch (Exception e) {
			t.rollback();
			System.out.println("Error: " + e.getMessage());
			return null;
		} finally {
			session.close();
		}
	}

}
