/**
 * 
 */
package com.lbw.data.service.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author LiuBaoWen
 *
 */
@Entity
@Table(name = "t_order")
@Data
public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "int2")
	private Long orderId;

	@Column(columnDefinition = "int2")
	private Long userId;

}
