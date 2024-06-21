package com.backend.services;

import java.util.List;

import com.backend.pojos.Diamond;

public interface IDiamondService {
	public void save(Diamond diamond);
	public void delete(int id);
	public void update(Diamond diamond);
	public List<Diamond> getAll();
	public Diamond findById(int id);
}
