package com.backend.services;

import java.util.List;

import com.backend.pojos.Promotion;

public interface IPromotionService {
	public void save(Promotion promotion);
	public void delete(int id);
	public void update(Promotion promotion);
	public List<Promotion> getAll();
	public Promotion findById(int id);
}
