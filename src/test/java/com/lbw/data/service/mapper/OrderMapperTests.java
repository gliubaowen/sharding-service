/**
 * 
 */
package com.lbw.data.service.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lbw.data.service.entity.Order;
import com.lbw.data.service.repository.OrderRepository;

/**
 * @author LiuBaoWen
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMapperTests {

	@Autowired
	private OrderMapper orderMapper;

	@Autowired
	private OrderRepository orderRepository;

	/**
	 * 
	 * @author LiuBaoWen
	 * @return
	 */
	@Test
	public void testFindById() {
		Long id = 1l;
		Order findById = orderMapper.findById(id);
		System.out.println(findById);
	}

	@Test
	public void testCount() {
		int count = orderMapper.count();
		System.out.println(count);
	}

	@Test
	public void test() {
		long count = orderRepository.count();
		System.out.println(count);
	}

}
