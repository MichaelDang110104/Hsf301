package com.backend.repositories;

import java.util.List;

import com.backend.pojos.Category;

public interface ICategoryRepository {
	public void save(Category category);
	public List<Category> getAll();
	public Category findById(int id);
	public void delete(int id);
	public void update(Category category);
}
