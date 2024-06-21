package com.backend.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.backend.pojos.Size;

public class SizeDAO {
	Configuration cf = null;
	SessionFactory sessionFactory = null;

	public SizeDAO(String configuratioFile) {
		cf = new Configuration();
		cf = cf.configure(configuratioFile);
		sessionFactory = cf.buildSessionFactory();
	}

	public void save(Size size) {
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		try {
			session.save(size);
			t.commit();
			System.out.println("Saved size successfully !");
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			t.rollback();
		} finally {
			session.close();
		}
	}
	
	public List<Size> getAll(){
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		try {
			List<Size> sizeList = session.createQuery("Select s from Size s").list();
			return sizeList;
		} catch (Exception e) {
			System.out.println("Error: "+e.getMessage());
			t.rollback();
			return null;
		}finally {
			session.close();
		}
	}
	
	
	public Size findById(int categoryID) {
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		try {
			Size size = session.get(Size.class, categoryID);
			return size;
		} catch (Exception e) {
			System.out.println("Error: "+e.getMessage());
			t.rollback();
			return null;
		}finally {
			session.close();
		}
	}
	
	public void delete(int categoryID) {
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		try {
			Size size = session.get(Size.class, categoryID);
			t.commit();
			System.out.println("Delete size successfully !");
		} catch (Exception e) {
			System.out.println("Error: "+e.getMessage());
			t.rollback();
		}finally {
			session.close();
		}
	}
	public void update(Size size ) {
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		try {
			session.update(size);
			t.commit();
			System.out.println("Update size successfully !");
		} catch (Exception e) {
			System.out.println("Error: "+e.getMessage());
			t.rollback();
		}finally {
			session.close();
		}
	}
	
}
