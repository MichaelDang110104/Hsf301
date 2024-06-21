package com.backend.services;

import java.util.List;

import com.backend.pojos.Product;

public interface IProductService {
	public void save(Product product);
	public void delete(int id);
	public void update(Product product);
	public List<Product> getAll();
	public Product findById(int id);
}
