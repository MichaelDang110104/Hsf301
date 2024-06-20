package com.backend.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.backend.pojos.PurchaseOrder;

public class PurchaseOrderDAO {
	private SessionFactory sessionFactory = null;
	private Configuration cf = null;
	
	public PurchaseOrderDAO(String persitanceName) {
		cf = new Configuration();
		cf = cf.configure(persitanceName);
		sessionFactory = cf.buildSessionFactory();
	}
	
	public void save(PurchaseOrder detail) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.save(detail);
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
			PurchaseOrder purchaseOrder = (PurchaseOrder) session.get(PurchaseOrder.class, id);
			session.delete(purchaseOrder);
			transaction.commit();
			
		} catch (Exception e) {
			transaction.rollback();
			throw e;
		} finally {
			sessionFactory.close();
			session.close();
		}
	}
	
	public void update(PurchaseOrder purchaseOrder) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.update(purchaseOrder);
			transaction.commit();
			System.out.println("Update succesfully");
		} catch (Exception e) {
			transaction.rollback();
			System.err.println("Error: " + e.getMessage());
		} finally {
			session.close();
		}
	}
	
	public List<PurchaseOrder> getAllProduct() {
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		try {
			t.begin();
			List<PurchaseOrder> list = session.createQuery("SELECT *  FROM [dbo].[PURCHASEORDER]", PurchaseOrder.class).list();
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
	
	public PurchaseOrder findById(int id) {
		Session session = sessionFactory.openSession();
		try {
			return (PurchaseOrder) session.get(PurchaseOrder.class, id);
		} catch (Exception e) {
			throw e;
		} finally {
			session.close();
		}
	}
}
