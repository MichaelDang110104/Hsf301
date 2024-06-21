package com.backend.services;

import java.util.List;

import com.backend.pojos.ShellMaterial;
import com.backend.repositories.IShellMaterialRepository;
import com.backend.repositories.ShellMaterialRepository;

public class ShellMaterialService implements IShellMaterialService {
	private IShellMaterialRepository iShellMaterialRepo = null;
	public ShellMaterialService(String configurationFile) {
		if(iShellMaterialRepo == null) {
			iShellMaterialRepo = new ShellMaterialRepository(configurationFile);
		}
	}
	
	@Override
	public void save(ShellMaterial shellMaterial) {
		// TODO Auto-generated method stub
		iShellMaterialRepo.save(shellMaterial);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		iShellMaterialRepo.delete(id);
	}

	@Override
	public void update(ShellMaterial shellMaterial) {
		// TODO Auto-generated method stub
		iShellMaterialRepo.update(shellMaterial);
	}

	@Override
	public List<ShellMaterial> getAll() {
		// TODO Auto-generated method stub
		return iShellMaterialRepo.getAll();
	}

	@Override
	public ShellMaterial findById(int id) {
		// TODO Auto-generated method stub
		return iShellMaterialRepo.findById(id);
	}

}
