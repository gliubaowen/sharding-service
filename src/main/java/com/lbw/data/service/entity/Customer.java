/**
 * 
 */
package com.lbw.data.service.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 客户 Entity
 * 
 * @author LiuBaoWen
 *
 */
@Entity
@Table(name = "customer")
public class Customer {

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "int2")
	private Long id;
	@Column(columnDefinition = "varchar(20)")
	private String firstName;
	@Column(columnDefinition = "varchar(20)")
	private String lastName;

	protected Customer() {
	}

	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return String.format("Customer[id=%d, firstName='%s', lastName='%s']", id, firstName, lastName);
	}

	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

}
