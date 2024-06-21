package com.backend.services;

import java.util.List;

import com.backend.pojos.ShellMaterial;

public interface IShellMaterialService {
	public void save(ShellMaterial shellMaterial);
	public void delete(int id);
	public void update(ShellMaterial shellMaterial);
	public List<ShellMaterial> getAll();
	public ShellMaterial findById(int id);
}
