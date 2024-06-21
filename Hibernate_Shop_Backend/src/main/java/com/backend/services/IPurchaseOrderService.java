package com.backend.services;

import java.util.List;

import com.backend.pojos.PurchaseOrder;

public interface IPurchaseOrderService {
	public void save(PurchaseOrder detail);
	public void delete(int id);
	public void update(PurchaseOrder purchaseOrder);
	public List<PurchaseOrder> getAll();
	public PurchaseOrder findById(int id);
}
