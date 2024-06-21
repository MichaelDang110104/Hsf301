package com.backend.services;

import java.util.List;

import com.backend.pojos.Warranty;
import com.backend.repositories.IWarrantyRepository;
import com.backend.repositories.WarrantyRepository;

public class WarrantyService implements IWarrantyService{
	private IWarrantyRepository iWarrantyRepo = null;
	public WarrantyService(String configurationFile) {
		if(iWarrantyRepo == null) {
			iWarrantyRepo = new WarrantyRepository(configurationFile);
		}
	}
	@Override
	public void save(Warranty warranty) {
		// TODO Auto-generated method stub
		iWarrantyRepo.save(warranty);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		iWarrantyRepo.delete(id);
	}

	@Override
	public void update(Warranty warranty) {
		// TODO Auto-generated method stub
		iWarrantyRepo.update(warranty);
	}

	@Override
	public List<Warranty> getAll() {
		// TODO Auto-generated method stub
		return iWarrantyRepo.getAll();
	}

	@Override
	public Warranty findById(int id) {
		// TODO Auto-generated method stub
		return iWarrantyRepo.findById(id);
	}

}
