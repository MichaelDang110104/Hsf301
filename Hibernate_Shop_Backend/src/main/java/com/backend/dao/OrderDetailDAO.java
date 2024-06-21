package com.backend.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.backend.pojos.OrderDetail;

public class OrderDetailDAO {
	private SessionFactory sessionFactory = null;
	private Configuration cf = null;
	
	public OrderDetailDAO(String persitanceName) {
		cf = new Configuration();
		cf = cf.configure(persitanceName);
		sessionFactory = cf.buildSessionFactory();
	}
	
	public void save(OrderDetail detail) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.save(detail);
			transaction.commit();
			System.out.println("Save order detail successfully !");
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
			OrderDetail orderDetail = (OrderDetail) session.get(OrderDetail.class, id);
			if(orderDetail!=null) {
				orderDetail.setStatus(false);
			}
			transaction.commit();
			System.out.println("Delete order detail successfully !");
		} catch (Exception e) {
			transaction.rollback();
			throw e;
		} finally {
			sessionFactory.close();
			session.close();
		}
	}
	
	public void update(OrderDetail orderDetail) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.update(orderDetail);
			transaction.commit();
			System.out.println("Update order detail succesfully");
		} catch (Exception e) {
			transaction.rollback();
			System.err.println("Error: " + e.getMessage());
		} finally {
			session.close();
		}
	}
	
	public List<OrderDetail> getAll() {
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		try {
			t.begin();
			List<OrderDetail> list = session.createQuery("SELECT od FROM OrderDetail od", OrderDetail.class).list();
			return list;
		} catch (Exception e) {
			t.rollback();
			System.out.println("Error: " + e.getMessage());
		} finally {
			session.close();
		}
		return null;
	}
	
	public OrderDetail findById(int id) {
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		try {
			return (OrderDetail) session.get(OrderDetail.class, id);
		} catch (Exception e) {
			System.out.println("Error: "+e.getMessage());
			t.rollback();
			return null;
		} finally {
			session.close();
		}
	}
}
