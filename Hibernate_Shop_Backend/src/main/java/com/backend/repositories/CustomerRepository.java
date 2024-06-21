package com.backend.repositories;

import java.util.List;

import com.backend.dao.CustomerDAO;
import com.backend.pojos.Customer;

public class CustomerRepository implements ICustomerRepository{
	private CustomerDAO cusDAO = null;
	
	public CustomerRepository(String configurationFile) {
		if(cusDAO == null) {
			cusDAO = new CustomerDAO(configurationFile);
		}
	}
	
	@Override
	public void save(Customer account) {
		// TODO Auto-generated method stub
		cusDAO.save(account);
	}

	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return cusDAO.getAll();
	}

	@Override
	public Customer findCustomer(String email, String password) {
		// TODO Auto-generated method stub
		return cusDAO.findCustomer(email, password);
	}

	@Override
	public void delete(String email) {
		// TODO Auto-generated method stub
		cusDAO.delete(email);
	}

	@Override
	public void update(Customer account) {
		// TODO Auto-generated method stub
		cusDAO.update(account);
	}

}
