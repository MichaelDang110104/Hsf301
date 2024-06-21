package com.backend.services;

import java.util.List;

import com.backend.pojos.Product;
import com.backend.repositories.IProductRepository;
import com.backend.repositories.ProductRepository;

public class ProductService implements IProductService{
	private IProductRepository iProRepo = null;
	public ProductService(String configurationFile) {
		if(iProRepo == null) {
			iProRepo = new ProductRepository(configurationFile);
		}
	}
	@Override
	public void save(Product product) {
		// TODO Auto-generated method stub
		iProRepo.save(product);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		iProRepo.delete(id);
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		iProRepo.update(product);
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return iProRepo.getAll();
	}

	@Override
	public Product findById(int id) {
		// TODO Auto-generated method stub
		return iProRepo.findById(id);
	}
	
}
