package com.backend.repositories;

import java.util.List;

import com.backend.dao.OrderDetailDAO;
import com.backend.pojos.OrderDetail;

public class OrderDetailRepository implements IOrderDetailRepository {
	OrderDetailDAO orderDetailDAO = null;

	public OrderDetailRepository(String configurationFile) {
		if (orderDetailDAO == null) {
			orderDetailDAO = new OrderDetailDAO(configurationFile);
		}
	}

	@Override
	public void save(OrderDetail detail) {
		// TODO Auto-generated method stub
		orderDetailDAO.save(detail);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		orderDetailDAO.delete(id);
	}

	@Override
	public void update(OrderDetail orderDetail) {
		// TODO Auto-generated method stub
		orderDetailDAO.update(orderDetail);
	}

	@Override
	public List<OrderDetail> getAll() {
		// TODO Auto-generated method stub
		return orderDetailDAO.getAll();
	}

	@Override
	public OrderDetail findById(int id) {
		// TODO Auto-generated method stub
		return orderDetailDAO.findById(id);
	}

}
