package com.backend.repositories;

import java.util.List;

import com.backend.dao.PurchaseOrderDAO;
import com.backend.pojos.PurchaseOrder;

public class PurchaseOrderRepository implements IPurchaseOrderRepository{
	PurchaseOrderDAO purchaseOrderDAO = null;
	public PurchaseOrderRepository(String configuratioFile) {
		if(purchaseOrderDAO == null) {
			purchaseOrderDAO = new PurchaseOrderDAO(configuratioFile);
		}
	}
	@Override
	public void save(PurchaseOrder detail) {
		// TODO Auto-generated method stub
		purchaseOrderDAO.save(detail);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		purchaseOrderDAO.delete(id);
	}

	@Override
	public void update(PurchaseOrder purchaseOrder) {
		// TODO Auto-generated method stub
		purchaseOrderDAO.update(purchaseOrder);
	}

	@Override
	public List<PurchaseOrder> getAll() {
		// TODO Auto-generated method stub
		return purchaseOrderDAO.getAll();
	}

	@Override
	public PurchaseOrder findById(int id) {
		// TODO Auto-generated method stub
		return purchaseOrderDAO.findById(id);
	}

}
