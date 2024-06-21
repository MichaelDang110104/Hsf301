package com.backend.services;

import java.util.List;

import com.backend.pojos.Size;

public interface ISizeService {
	public void save(Size size);
	public List<Size> getAll();
	public Size findById(int categoryID);
	public void delete(int categoryID);
	public void update(Size size );
}
