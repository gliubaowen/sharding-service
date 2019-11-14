/**
 * 
 */
package com.lbw.data.service.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
public class CustomerRepositoryTest {

	private static final Logger log = LoggerFactory.getLogger(CustomerRepositoryTest.class);

	@Autowired
	private CustomerRepository repository;

	@Test
	public void testDemo() {
		// save a few customers
		Customer save = repository.save(new Customer(1l, "Jack", "Bauer"));
		repository.save(new Customer(2l, "Chloe", "O'Brian"));
		repository.save(new Customer(3l, "Kim", "Bauer"));
		repository.save(new Customer(4l, "David", "Palmer"));
		repository.save(new Customer(5l, "Michelle", "Dessler"));

		// fetch all customers
		log.info("Customers found with findAll():");
		log.info("-------------------------------");
		for (Customer customer : repository.findAll()) {
			log.info(customer.toString());
		}
		log.info("");

		// fetch an individual customer by ID
		Customer customer = repository.findById(save.getId()).get();
		log.info("Customer found with findById(1L):");
		log.info("--------------------------------");
		log.info(customer.toString());
		log.info("");

		// fetch customers by last name
		log.info("Customer found with findByLastName('Bauer'):");
		log.info("--------------------------------------------");
		repository.findByLastName("Bauer").forEach(bauer -> {
			log.info(bauer.toString());
		});
		// for (Customer bauer : repository.findByLastName("Bauer")) {
		// log.info(bauer.toString());
		// }
		log.info("");

		log.info("Customer found with count('Bauer'):");
		log.info("--------------------------------------------");
		long count = repository.count();
		log.info("{}", count);
		log.info("");
	}

	@Test
	public void testSave() {
		// save a few customers
		Customer save = repository.save(new Customer(6l, "BaoWen", "Liu"));

		Long id = save.getId();
		// fetch an individual customer by ID
		Customer customer = repository.findById(id).get();
		log.info("Customer found with findById({}):", id);
		log.info("--------------------------------");
		log.info(customer.toString());
		log.info("");

		log.info("Customer found with count('Bauer'):");
		log.info("--------------------------------------------");
		long count = repository.count();
		log.info("{}", count);
		log.info("");
	}

}
