package com.backend.repositories;

import java.util.List;

import com.backend.dao.PromotionDAO;
import com.backend.pojos.Promotion;

public class PromotionRepository implements IPromotionRepository{
	PromotionDAO promotionDAO = null;
	public PromotionRepository(String configurationFile) {
		if(promotionDAO == null) {
			promotionDAO = new PromotionDAO(configurationFile);
		}
	}
	@Override
	public void save(Promotion promotion) {
		// TODO Auto-generated method stub
		promotionDAO.save(promotion);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		promotionDAO.delete(id);
	}

	@Override
	public void update(Promotion promotion) {
		// TODO Auto-generated method stub
		promotionDAO.update(promotion);
	}

	@Override
	public List<Promotion> getAll() {
		// TODO Auto-generated method stub
		return promotionDAO.getAll();
	}

	@Override
	public Promotion findById(int id) {
		// TODO Auto-generated method stub
		return promotionDAO.findById(id);
	}
	
}
