package com.backend.services;

import java.util.List;

import com.backend.pojos.Size;
import com.backend.repositories.ISizeRepository;
import com.backend.repositories.SizeRepository;

public class SizeService implements ISizeService {
	private ISizeRepository iSizeRepo = null;

	public SizeService(String confrigurationFile) {
		if(iSizeRepo == null) {
			iSizeRepo = new SizeRepository(confrigurationFile);
		}
	}

	@Override
	public void save(Size size) {
		// TODO Auto-generated method stub
		iSizeRepo.save(size);
	}

	@Override
	public List<Size> getAll() {
		// TODO Auto-generated method stub
		return iSizeRepo.getAll();
	}

	@Override
	public Size findById(int categoryID) {
		// TODO Auto-generated method stub
		return iSizeRepo.findById(categoryID);
	}

	@Override
	public void delete(int categoryID) {
		// TODO Auto-generated method stub
		iSizeRepo.delete(categoryID);
	}

	@Override
	public void update(Size size) {
		// TODO Auto-generated method stub
		iSizeRepo.update(size);
	}

}
