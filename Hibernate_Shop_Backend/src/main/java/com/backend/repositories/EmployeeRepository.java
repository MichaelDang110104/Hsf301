package com.backend.repositories;

import java.util.List;

import com.backend.dao.EmployeeDAO;
import com.backend.pojos.Employee;

public class EmployeeRepository implements IEmployeeRepository {
	EmployeeDAO empDAO = null;

	public EmployeeRepository(String configurationFile) {
		if (empDAO == null) {
			empDAO = new EmployeeDAO(configurationFile);
		}
	}

	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		empDAO.save(employee);
	}

	@Override
	public void update(Employee employee) {
		// TODO Auto-generated method stub
		empDAO.update(employee);
	}

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		return empDAO.findById(id);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		empDAO.delete(id);
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return empDAO.getAll();
	}
}
