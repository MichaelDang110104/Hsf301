package com.backend.services;

import java.util.List;

import com.backend.pojos.Diamond;
import com.backend.repositories.DiamondRepository;
import com.backend.repositories.IDiamondRepository;

public class DiamondService implements IDiamondService{
	private IDiamondRepository iDiaRepo = null;
	public DiamondService(String configurationFile) {
		if(iDiaRepo == null) {
			iDiaRepo = new DiamondRepository(configurationFile);
		}
	}
	@Override
	public void save(Diamond diamond) {
		// TODO Auto-generated method stub
		iDiaRepo.save(diamond);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		iDiaRepo.delete(id);
	}

	@Override
	public void update(Diamond diamond) {
		// TODO Auto-generated method stub
		iDiaRepo.update(diamond);
	}

	@Override
	public List<Diamond> getAll() {
		// TODO Auto-generated method stub
		return iDiaRepo.getAll();
	}

	@Override
	public Diamond findById(int id) {
		// TODO Auto-generated method stub
		return iDiaRepo.findById(id);
	}

}
