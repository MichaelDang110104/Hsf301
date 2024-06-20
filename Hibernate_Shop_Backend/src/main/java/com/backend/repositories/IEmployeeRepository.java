package com.backend.repositories;

import java.util.List;

import com.backend.pojos.Diamond;
import com.backend.pojos.Employee;

public interface IEmployeeRepository {
	public void save(Employee employee);
	public void update(Employee employee);
	public Employee findById(int id);
	public void delete(int id);
	public List<Employee> getAll();
}
