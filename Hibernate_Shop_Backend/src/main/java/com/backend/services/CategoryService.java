package com.backend.services;

import java.util.List;

import com.backend.pojos.Category;
import com.backend.repositories.CategoryRepository;
import com.backend.repositories.ICategoryRepository;

public class CategoryService implements ICategoryService {
	private ICategoryRepository iCateRepo = null;

	public CategoryService(String configurationFile) {
		if (iCateRepo == null) {
			iCateRepo = new CategoryRepository(configurationFile);
		}
	}

	@Override
	public void save(Category category) {
		// TODO Auto-generated method stub
		iCateRepo.save(category);
	}

	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		return iCateRepo.getAll();
	}

	@Override
	public Category findById(int id) {
		// TODO Auto-generated method stub
		return iCateRepo.findById(id);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		iCateRepo.delete(id);
	}

	@Override
	public void update(Category category) {
		// TODO Auto-generated method stub
		iCateRepo.update(category);
	}

}
