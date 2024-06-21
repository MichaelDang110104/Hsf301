package com.backend.services;

import java.util.List;

import com.backend.pojos.Customer;
import com.backend.repositories.CustomerRepository;
import com.backend.repositories.ICustomerRepository;

public class CustomerService implements ICustomerService{
	private ICustomerRepository iCustRepo = null;
	public CustomerService(String configurationFile) {
		if(iCustRepo == null) {
			iCustRepo = new CustomerRepository(configurationFile);
		}
	}

	@Override
	public void save(Customer account) {
		// TODO Auto-generated method stub
		iCustRepo.save(account);
	}

	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return iCustRepo.getAll();
	}

	@Override
	public Customer findCustomer(String email, String password) {
		// TODO Auto-generated method stub
		return iCustRepo.findCustomer(email, password);
	}

	@Override
	public void delete(String email) {
		// TODO Auto-generated method stub
		iCustRepo.delete(email);
	}

	@Override
	public void update(Customer account) {
		// TODO Auto-generated method stub
		iCustRepo.update(account);
	}
}
