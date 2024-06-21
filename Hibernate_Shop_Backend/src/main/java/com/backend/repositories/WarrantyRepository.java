package com.backend.repositories;

import java.util.List;

import com.backend.dao.WarrantyDAO;
import com.backend.pojos.Warranty;

public class WarrantyRepository implements IWarrantyRepository {

	private WarrantyDAO warrDAO = null;

	public WarrantyRepository(String configurationFile) {
		if (warrDAO == null) {
			warrDAO = new WarrantyDAO(configurationFile);
		}
	}

	@Override
	public void save(Warranty warranty) {
		// TODO Auto-generated method stub
		warrDAO.save(warranty);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		warrDAO.delete(id);
	}

	@Override
	public void update(Warranty warranty) {
		// TODO Auto-generated method stub
		warrDAO.update(warranty);
	}

	@Override
	public List<Warranty> getAll() {
		// TODO Auto-generated method stub
		return warrDAO.getAll();
	}

	@Override
	public Warranty findById(int id) {
		// TODO Auto-generated method stub
		return warrDAO.findById(id);
	}

}
