package com.backend.services;

import java.util.List;

import com.backend.pojos.OrderDetail;
import com.backend.repositories.IOrderDetailRepository;
import com.backend.repositories.OrderDetailRepository;
	
public class OrderDetailService implements IOrderDetailService{
	private IOrderDetailRepository iOrderDetailRepo = null;
	public OrderDetailService(String configurationFile) {
		if(iOrderDetailRepo == null) {
			iOrderDetailRepo = new OrderDetailRepository(configurationFile);
		}
	}
	@Override
	public void save(OrderDetail detail) {
		// TODO Auto-generated method stub
		iOrderDetailRepo.save(detail);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		iOrderDetailRepo.delete(id);
	}

	@Override
	public void update(OrderDetail orderDetail) {
		// TODO Auto-generated method stub
		iOrderDetailRepo.update(orderDetail);
	}

	@Override
	public List<OrderDetail> getAll() {
		// TODO Auto-generated method stub
		return iOrderDetailRepo.getAll();
	}

	@Override
	public OrderDetail findById(int id) {
		// TODO Auto-generated method stub
		return iOrderDetailRepo.findById(id);
	}

}
