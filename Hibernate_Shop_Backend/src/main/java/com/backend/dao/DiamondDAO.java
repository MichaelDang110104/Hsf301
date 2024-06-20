package com.backend.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.backend.pojos.Diamond;


public class DiamondDAO {
	private SessionFactory sessionFactory = null;
	private Configuration cf = null;
	
	public DiamondDAO(String persitanceName) {
		cf = new Configuration();
		cf = cf.configure(persitanceName);
		sessionFactory = cf.buildSessionFactory();
	}
	
	public void save(Diamond diamond) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.save(diamond);
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
	        Diamond diamond = (Diamond) session.get(Diamond.class, id);
	        if (diamond != null) {
	            diamond.setStatus(false);
	            session.update(diamond);
	        }
	        transaction.commit();
	    } catch (Exception e) {
	        transaction.rollback();
	        throw e;
	    } finally {
	        session.close();
	    }
	}

	
	public void update(Diamond diamond) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.update(diamond);
			transaction.commit();
			System.out.println("Update succesfully");
		} catch (Exception e) {
			transaction.rollback();
			System.err.println("Error: " + e.getMessage());
		} finally {
			session.close();
		}
	}
	
	public List<Diamond> getAllDiamond() {
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		try {
			t.begin();
			List<Diamond> list = session.createQuery("SELECT *FROM [dbo].[DIAMOND]", Diamond.class).list();
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
	
	public Diamond findById(int id) {
		Session session = sessionFactory.openSession();
		try {
			return (Diamond) session.get(Diamond.class, id);
		} catch (Exception e) {
			throw e;
		} finally {
			session.close();
		}
	}
}
