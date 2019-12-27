/**
 * 
 */
package com.lbw.data.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lbw.data.service.entity.Customer;
import com.lbw.data.service.mapper.CustomerMapper;
import com.lbw.data.service.repository.CustomerRepository;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private CustomerMapper customerMapper;

	@RequestMapping("/select")
	public Object select(Long id) {
		Customer selectById = customerMapper.selectById(id);
		return selectById;
	}

	@RequestMapping("/add")
	public Object add() {
		int insert = customerMapper.insert(new Customer(1l, 1l, "BaoWen", "Liu"));
		return insert;
	}

	@RequestMapping("/testcount")
	public Object testcount() {
		int count = customerMapper.count();
		return count;
	}

	@RequestMapping("/test")
	public Object test(Long id) {
		Customer findById = customerMapper.findById(id);
		return findById;
	}

	@RequestMapping("/save")
	public Object insert() {
		for (int i = 0; i < 100; i++) {
			Long valueOf = Long.valueOf(i);
			customerRepository.save(new Customer(valueOf, valueOf, "Chloe", "O'Brian"));
		}
		for (int i = 100; i < 200; i++) {
			Long valueOf = Long.valueOf(i);
			customerRepository.save(new Customer(valueOf, ++valueOf, "Chloe", "O'Brian"));
		}
		return "success";
	}

	@RequestMapping("/create")
	public Object create() {
		customerRepository.save(new Customer(1l, 1l, "Chloe", "O'Brian"));
		customerRepository.save(new Customer(2l, 2l, "Kim", "Bauer"));
		customerRepository.save(new Customer(3l, 3l, "David", "Palmer"));
		customerRepository.save(new Customer(4l, 4l, "Michelle", "Dessler"));
		customerRepository.save(new Customer(5l, 5l, "BaoWen", "Liu"));
		return "success";
	}

	@RequestMapping("queryById")
	private Object query(Long id) {
		return customerRepository.findById(id);
	}

	@RequestMapping("query")
	private Object query(String lastName) {
		return customerRepository.findByLastName(lastName);
	}

	@RequestMapping("queryAll")
	private Object queryAll() {
		return customerRepository.findAll();
	}

	@RequestMapping("deleteAll")
	private Object deleteAll() {
		customerRepository.deleteAll();
		return "success";
	}

	@RequestMapping("delete")
	private Object delete(Long id) {
		customerRepository.deleteById(id);
		return "success";
	}

	@RequestMapping(value = "insert")
	private Object insertGet(Long id, Long userId, String firstName, String lastName) {
		return customerRepository.save(new Customer(id, userId, firstName, lastName));
	}

	@RequestMapping(value = "insert", method = RequestMethod.POST)
	private Object insertPost(@RequestBody Customer customer) {
		return customerRepository.save(customer);
	}

	@RequestMapping("count")
	private Object count() {
		return customerRepository.count();
	}

}
