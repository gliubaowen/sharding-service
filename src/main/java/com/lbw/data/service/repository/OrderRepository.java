/**
 * 
 */
package com.lbw.data.service.repository;

import org.springframework.data.repository.CrudRepository;

import com.lbw.data.service.entity.Order;

/**
 * @author LiuBaoWen
 *
 */
public interface OrderRepository extends CrudRepository<Order, Long> {

}