/**
 * 
 */
package com.lbw.data.service.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lbw.data.service.entity.Customer;

/**
 * 客户查询Repository
 * 
 * @author LiuBaoWen
 *
 */
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

	List<Customer> findByLastName(String lastName);

}
