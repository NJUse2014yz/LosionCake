package com.edu.nju.wel.dao;

import java.util.List;

import com.edu.nju.wel.model.Order;

/**
 * @author congye6
 *
 */
public interface OrderDao {

	/**
	 * 添加订单
	 * @param order
	 */
	public void addOrder(Order order);
	
	/**
	 * 根据用户id获取订单
	 * @param userId
	 * @return
	 */
	public List<Order> getOrders(int userId);
	
	/**
	 * 根据订单id获取订单
	 * @param orderId
	 * @return
	 */
	public Order getOrder(int orderId);
	
	/**
	 * 更新订单
	 * @param order
	 */
	public void updateOrder(Order order);
	
}
