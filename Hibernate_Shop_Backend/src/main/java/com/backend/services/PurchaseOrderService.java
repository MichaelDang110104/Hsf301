package com.backend.services;

import java.util.List;

import com.backend.pojos.PurchaseOrder;
import com.backend.repositories.IPurchaseOrderRepository;
import com.backend.repositories.PurchaseOrderRepository;

public class PurchaseOrderService implements IPurchaseOrderService{
	private IPurchaseOrderRepository iPurchaseOrderRepo = null;
	public PurchaseOrderService(String configurationFile) {
		if(iPurchaseOrderRepo ==  null) {
			iPurchaseOrderRepo = new PurchaseOrderRepository(configurationFile);
		}
	}
	@Override
	public void save(PurchaseOrder detail) {
		// TODO Auto-generated method stub
		iPurchaseOrderRepo.save(detail);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		iPurchaseOrderRepo.delete(id);
	}

	@Override
	public void update(PurchaseOrder purchaseOrder) {
		// TODO Auto-generated method stub
		iPurchaseOrderRepo.update(purchaseOrder);
	}

	@Override
	public List<PurchaseOrder> getAll() {
		// TODO Auto-generated method stub
		return iPurchaseOrderRepo.getAll();
	}

	@Override
	public PurchaseOrder findById(int id) {
		// TODO Auto-generated method stub
		return iPurchaseOrderRepo.findById(id);
	}

}
