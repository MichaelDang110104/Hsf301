package com.backend.repositories;

import java.util.List;

import com.backend.pojos.OrderDetail;

public interface IOrderDetailRepository {
	public void save(OrderDetail detail);
	public void delete(int id);
	public void update(OrderDetail orderDetail);
	public List<OrderDetail> getAll();
	public OrderDetail findById(int id);
}
