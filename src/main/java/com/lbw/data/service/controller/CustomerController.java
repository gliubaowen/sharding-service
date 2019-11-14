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
import com.lbw.data.service.repository.CustomerRepository;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerRepository customerRepository;

	@RequestMapping("/create")
	public Object create() {
		customerRepository.save(new Customer(1l, "Chloe", "O'Brian"));
		customerRepository.save(new Customer(2l, "Kim", "Bauer"));
		customerRepository.save(new Customer(3l, "David", "Palmer"));
		customerRepository.save(new Customer(4l, "Michelle", "Dessler"));
		customerRepository.save(new Customer(5l, "BaoWen", "Liu"));
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
	private Object insertGet(Long id, String firstName, String lastName) {
		return customerRepository.save(new Customer(id, firstName, lastName));
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
