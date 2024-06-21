package com.backend.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.backend.pojos.ShellMaterial;

public class ShellMaterialDAO {
	Configuration cf = null;
	SessionFactory sessionFactory = null;

	public ShellMaterialDAO(String configurationFile) {
		cf = new Configuration();
		cf = cf.configure(configurationFile);
		sessionFactory = cf.buildSessionFactory();
	}

	public void save(ShellMaterial shellMaterial) {
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		try {
			session.save(shellMaterial);
			t.commit();
			System.out.println("Save shell material successfully !");
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			t.rollback();
		} finally {
			sessionFactory.close();
			session.close();
		}
	}

	public void delete(int id) {
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		try {
			ShellMaterial shellMaterial = session.get(ShellMaterial.class, id);
			if (shellMaterial != null) {
				shellMaterial.setStatus(false);
			}
			t.commit();
			System.out.println("Delete shell material successfully !");
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			t.rollback();
		} finally {
			session.close();
		}
	}

	public void update(ShellMaterial shellMaterial) {
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		try {
			session.update(shellMaterial);
			t.commit();
			System.out.println("Update shell material successfully !");
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			t.rollback();
		} finally {
			session.close();
		}
	}

	public List<ShellMaterial> getAll() {
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		try {
			List<ShellMaterial> shellMaterialList = session.createQuery("SELECT sm FROM ShellMaterial sm").list();
			return shellMaterialList;
		} catch (Exception e) {
			System.out.println("Error: "+e.getMessage());
			t.rollback();
		} finally {
			session.close();
		}
		return null;
	}
	
	public ShellMaterial findById(int id) {
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		try {
			return (ShellMaterial) session.get(ShellMaterial.class, id);
		} catch (Exception e) {
			System.out.println("Error: "+e.getMessage());
			t.rollback();
		}finally {
			session.close();
		}
		return null;
	}

}
