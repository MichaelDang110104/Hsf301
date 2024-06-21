package com.backend.repositories;

import java.util.List;

import com.backend.dao.ProductDAO;
import com.backend.pojos.Product;

public class ProductRepository implements IProductRepository{
	ProductDAO proDAO = null;
	public ProductRepository(String configurationFile) {
		if(proDAO == null) {
			proDAO = new ProductDAO(configurationFile);
		}
	}
	@Override
	public void save(Product product) {
		// TODO Auto-generated method stub
		proDAO.save(product);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		proDAO.delete(id);
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		proDAO.update(product);
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return proDAO.getAll();
	}

	@Override
	public Product findById(int id) {
		// TODO Auto-generated method stub
		return proDAO.findById(id);
	}

}
