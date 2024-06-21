package com.backend.repositories;

import java.util.List;

import com.backend.dao.SizeDAO;
import com.backend.pojos.Size;

public class SizeRepository implements ISizeRepository {

	private SizeDAO sizeDAO = null;

	public SizeRepository(String configurationFile) {
		if (sizeDAO == null) {
			sizeDAO = new SizeDAO(configurationFile);
		}
	}

	@Override
	public void save(Size size) {
		// TODO Auto-generated method stub
		sizeDAO.save(size);
	}

	@Override
	public List<Size> getAll() {
		// TODO Auto-generated method stub
		return sizeDAO.getAll();
	}

	@Override
	public Size findById(int categoryID) {
		// TODO Auto-generated method stub
		return sizeDAO.findById(categoryID);
	}

	@Override
	public void delete(int categoryID) {
		// TODO Auto-generated method stub
		sizeDAO.delete(categoryID);
	}

	@Override
	public void update(Size size) {
		// TODO Auto-generated method stub
		sizeDAO.update(size);
	}

}
