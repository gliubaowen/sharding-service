/**
 * 
 */
package com.lbw.data.service.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.shardingsphere.spi.keygen.ShardingKeyGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lbw.data.service.entity.Customer;
import com.lbw.data.service.entity.Order;
import com.lbw.data.service.mapper.CustomerMapper;
import com.lbw.data.service.mapper.OrderMapper;
import com.lbw.data.service.repository.OrderRepository;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private OrderMapper orderMapper;

	@Autowired
	private CustomerMapper CustomerMapper;

	@Autowired
	private ShardingKeyGenerator shardingKeyGenerator;

//	@Autowired
//	private KeyGenerator keyGenerator;

	@RequestMapping("/test")
	public Object test(Long orderId) {
		Map<String, Object> columnMap = new HashMap<>();
		columnMap.put("order_id", orderId);
		List<Order> selectByMap = orderMapper.selectByMap(columnMap);
		return selectByMap;
	}

	@RequestMapping("/testuser")
	public Object testuser(Long orderId) {
		Map<String, Object> columnMap = new HashMap<>();
		columnMap.put("id", orderId);
		List<Customer> selectByMap = CustomerMapper.selectByMap(columnMap);
		return selectByMap;
	}

	@RequestMapping("/find")
	public Object find(Long orderId) {
		return orderMapper.findByOrderId(orderId);
	}

	@RequestMapping("/create")
	public Object add() {
		for (int i = 0; i < 1000; i++) {
			Order order = new Order();
//			order.setId(Long.parseLong(i + ""));
			System.out.println(shardingKeyGenerator.generateKey());
			Comparable<?> generateKey = shardingKeyGenerator.generateKey();
			order.setId((Long) generateKey);
			order.setUserId((long) i);
			order.setOrderId((long) i);
			orderRepository.save(order);
		}
		for (int i = 1000; i < 2000; i++) {
			Order order = new Order();
//			order.setId(Long.parseLong(i + ""));
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

//	@RequestMapping("insert")
//	private Object insert() {
//		for (int i = 0; i < 30; i++) {
//			Order order = new Order();
//			order.setOrderId(keyGenerator.generateKey().longValue());
//			order.setUserId(keyGenerator.generateKey().longValue());
//			orderRepository.save(order);
//		}
//		return "success";
//	}

}
