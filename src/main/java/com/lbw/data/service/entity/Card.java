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
@Table(name = "card", indexes = { @Index(columnList = "id") })
@Data
public class Card implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(columnDefinition = "int8")
	private Long id;
	@Column(columnDefinition = "int2")
	private Long userId;
	@Column(columnDefinition = "varchar(20)")
	private String cardNo;

	protected Card() {
	}

	public Card(Long id, Long userId, String cardNo) {
		this.id = id;
		this.userId = userId;
		this.cardNo = cardNo;
	}

	@Override
	public String toString() {
		return String.format("Customer[id=%d, userId='%s', cardNo='%s']", id, userId, cardNo);
	}

}
