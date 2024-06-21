package com.backend.services;

import java.util.List;

import com.backend.pojos.Product;
import com.backend.pojos.Promotion;
import com.backend.repositories.IPromotionRepository;
import com.backend.repositories.PromotionRepository;

public class PromotionService implements IPromotionService{
	private IPromotionRepository iPromotionRepo = null;
	public PromotionService(String configurationFile) {
		if(iPromotionRepo == null) {
			iPromotionRepo = new PromotionRepository(configurationFile);
		}
	}
	@Override
	public void save(Promotion promotion) {
		// TODO Auto-generated method stub
		iPromotionRepo.save(promotion);
	}
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		iPromotionRepo.delete(id);
	}
	@Override
	public void update(Promotion promotion) {
		// TODO Auto-generated method stub
		iPromotionRepo.update(promotion);
	}
	@Override
	public List<Promotion> getAll() {
		// TODO Auto-generated method stub
		return iPromotionRepo.getAll();
	}
	@Override
	public Promotion findById(int id) {
		// TODO Auto-generated method stub
		return iPromotionRepo.findById(id);
	}
	
}
