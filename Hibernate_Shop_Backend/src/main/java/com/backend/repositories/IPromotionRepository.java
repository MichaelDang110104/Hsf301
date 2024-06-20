package com.backend.repositories;

import java.util.List;

import com.backend.pojos.Promotion;

public interface IPromotionRepository {
	public void save(Promotion promotion);
	public void delete(int id);
	public void update(Promotion promotion);
	public List<Promotion> getAllProduct();
	public Promotion findById(int id);
}
