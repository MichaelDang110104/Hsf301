package com.backend.repositories;

import java.util.List;

import com.backend.pojos.Warranty;

public interface IWarrantyRepository {
	public void save(Warranty warranty);
	public void delete(int id);
	public void update(Warranty warranty);
	public List<Warranty> getAll() ;
	public Warranty findById(int id);
}
