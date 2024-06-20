package com.backend.repositories;

import java.util.List;

import com.backend.pojos.PurchaseOrder;

public interface IPurchaseOrderRepository {
	public void save(PurchaseOrder detail);
	public void delete(int id);
	public void update(PurchaseOrder purchaseOrder);
	public List<PurchaseOrder> getAllPurchaseOrder();
	public PurchaseOrder findById(int id);
}
