package com.backend.services;

import java.util.List;

import com.backend.pojos.Employee;
import com.backend.repositories.EmployeeRepository;
import com.backend.repositories.IEmployeeRepository;

public class EmployeeService implements IEmployeeService{
	private IEmployeeRepository iEmpRepo = null;
	public EmployeeService(String configurationFile) {
		if(iEmpRepo == null) {
			iEmpRepo = new EmployeeRepository(configurationFile);
		}
	}
	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		iEmpRepo.save(employee);
	}

	@Override
	public void update(Employee employee) {
		// TODO Auto-generated method stub
		iEmpRepo.update(employee);
	}

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		return iEmpRepo.findById(id);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		iEmpRepo.delete(id);
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return iEmpRepo.getAll();
	}

}
