package com.backend.repositories;

import java.util.List;

import com.backend.dao.ShellMaterialDAO;
import com.backend.pojos.ShellMaterial;

public class ShellMaterialRepository implements IShellMaterialRepository{

	private ShellMaterialDAO shellDAO = null;
	public ShellMaterialRepository(String configurationFile) {
		if(shellDAO == null) {
			shellDAO = new ShellMaterialDAO(configurationFile);
		}
	}
	
	@Override
	public void save(ShellMaterial shellMaterial) {
		// TODO Auto-generated method stub
		shellDAO.save(shellMaterial);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		shellDAO.delete(id);
	}

	@Override
	public void update(ShellMaterial shellMaterial) {
		// TODO Auto-generated method stub
		shellDAO.update(shellMaterial);
	}

	@Override
	public List<ShellMaterial> getAll() {
		// TODO Auto-generated method stub
		return shellDAO.getAll();
	}

	@Override
	public ShellMaterial findById(int id) {
		// TODO Auto-generated method stub
		return shellDAO.findById(id);
	}

}
