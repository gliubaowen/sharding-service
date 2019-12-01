/**
 * 
 */
package com.lbw.data.service.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lbw.data.service.entity.Customer;

/**
 * @author LiuBaoWen
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerMapperTests {

	@Autowired
	private CustomerMapper customerMapper;

	/**
	 * 
	 * @author LiuBaoWen
	 * @return
	 */
	@Test
	public void testFindById() {
		Long id = 1l;
		Customer findById = customerMapper.findById(id);
		System.out.println(findById);
	}

	@Test
	public void testCount() {
		int count = customerMapper.count();
		System.out.println(count);
	}

}
