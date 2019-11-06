/**
 * 
 */
package com.lbw.data.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dangdang.ddframe.rdb.sharding.keygen.KeyGenerator;
import com.lbw.data.service.entity.Order;
import com.lbw.data.service.repository.OrderRepository;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private KeyGenerator keyGenerator;

	@RequestMapping("/create")
	public Object add() {
		for (int i = 0; i < 10; i++) {
			Order order = new Order();
			order.setUserId((long) i);
			order.setOrderId((long) i);
			orderRepository.save(order);
		}
		for (int i = 10; i < 20; i++) {
			Order order = new Order();
			order.setUserId((long) i + 1);
			order.setOrderId((long) i);
			orderRepository.save(order);
		}

		return "success";
	}

	@RequestMapping("query")
	private Object queryAll() {
		return orderRepository.findAll();
	}

	@RequestMapping("delete")
	private Object deleteAll() {
		orderRepository.deleteAll();
		return "success";
	}

	@RequestMapping("insert")
	private Object insert() {
		for (int i = 0; i < 30; i++) {
			Order order = new Order();
			order.setOrderId(keyGenerator.generateKey().longValue());
			order.setUserId(keyGenerator.generateKey().longValue());
			orderRepository.save(order);
		}
		return "success";
	}

}
