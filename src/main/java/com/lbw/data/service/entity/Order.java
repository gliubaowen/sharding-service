/**
 * 
 */
package com.lbw.data.service.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author LiuBaoWen
 *
 */
@Entity
@Table(name = "t_order")
public class Order {

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "int2")
	private Long orderId;

	@Column(columnDefinition = "int2")
	private Long userId;

	/**
	 * @return the orderId
	 */
	public Long getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return the userId
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
