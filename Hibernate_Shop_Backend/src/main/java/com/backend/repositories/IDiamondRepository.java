package com.backend.repositories;

import java.util.List;

import com.backend.pojos.Diamond;

public interface IDiamondRepository {
	public void save(Diamond diamond);
	public void delete(int id);
	public void update(Diamond diamond);
	public List<Diamond> getAll();
	public Diamond findById(int id);
}
