package com.backend.repositories;

import java.util.List;

import com.backend.dao.DiamondDAO;
import com.backend.pojos.Diamond;

public class DiamondRepository implements IDiamondRepository{
	private DiamondDAO diaDAO = null;
	public DiamondRepository(String configurationFile) {
		if(diaDAO == null) {
			diaDAO = new DiamondDAO(configurationFile);
		}
	}
	@Override
	public void save(Diamond diamond) {
		// TODO Auto-generated method stub
		diaDAO.save(diamond);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		diaDAO.delete(id);
	}

	@Override
	public void update(Diamond diamond) {
		// TODO Auto-generated method stub
		diaDAO.update(diamond);
	}

	@Override
	public List<Diamond> getAll() {
		// TODO Auto-generated method stub
		return diaDAO.getAll();
	}

	@Override
	public Diamond findById(int id) {
		// TODO Auto-generated method stub
		return diaDAO.findById(id);
	}

}
