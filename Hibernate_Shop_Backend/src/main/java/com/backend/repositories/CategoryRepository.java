package com.backend.repositories;

import java.util.List;

import com.backend.dao.CategoryDAO;
import com.backend.pojos.Category;

public class CategoryRepository implements ICategoryRepository{
	private CategoryDAO catDAO = null;
	public CategoryRepository(String configurationFile) {
		if(catDAO == null) {
			catDAO = new CategoryDAO(configurationFile);
		}
	}
	@Override
	public void save(Category category) {
		catDAO.save(category);
	}

	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		return catDAO.getAll();
	}

	@Override
	public Category findById(int id) {
		// TODO Auto-generated method stub
		return catDAO.findById(id);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		catDAO.delete(id);
	}

	@Override
	public void update(Category category) {
		// TODO Auto-generated method stub
		catDAO.update(category);
	}

}
