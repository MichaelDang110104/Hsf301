package com.backend.repositories;

import java.util.List;

import com.backend.pojos.Customer;

public interface ICustomerRepository {
	public void save(Customer account);
	public List<Customer> getAll();
	public Customer findCustomer(String email, String password);
	public void delete(String email);
	public void update(Customer account);
}
