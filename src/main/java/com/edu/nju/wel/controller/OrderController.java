package com.edu.nju.wel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.edu.nju.wel.dao.OrderDao;
import com.edu.nju.wel.model.Order;
import com.edu.nju.wel.util.Message;

/**
 * @author congye6
 *
 */
public class OrderController {
	
	@Autowired
	private OrderDao dao;
	
	@RequestMapping(value="/insert_order",method=RequestMethod.POST)
	public @ResponseBody Message addOrder(@RequestBody Order order) {
		Message message=new Message();
		dao.addOrder(order);
		message.setMsg("添加成功");
		return message;
	}

	@RequestMapping(value="/get_orders",method=RequestMethod.GET)
	public @ResponseBody List<Order> getOrders(int userId) {
		
		return dao.getOrders(userId);
	}
	
	@RequestMapping(value="/get_order",method=RequestMethod.GET)
	public @ResponseBody Order getOrder(int orderId) {

		return dao.getOrder(orderId);
	}

	@RequestMapping(value="/get_order",method=RequestMethod.POST)
	public @ResponseBody Message updateOrder(@RequestBody Order order) {
		Message message=new Message();
		dao.updateOrder(order);
		message.setMsg("更新成功");
		return message;
		
	}
}
