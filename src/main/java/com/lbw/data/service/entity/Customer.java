/**
 * 
 */
package com.lbw.data.service.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

import lombok.Data;

/**
 * 客户 Entity
 * 
 * @author LiuBaoWen
 *
 */
@Entity
@Table(name = "customer", indexes = { @Index(columnList = "id") })
@Data
public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(columnDefinition = "int8")
	private Long id;
	@Column(columnDefinition = "varchar(20)")
	private String firstName;
	@Column(columnDefinition = "varchar(20)")
	private String lastName;

	protected Customer() {
	}

	public Customer(Long id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return String.format("Customer[id=%d, firstName='%s', lastName='%s']", id, firstName, lastName);
	}

}
