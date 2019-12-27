/**
 * 
 */
package com.lbw.data.service.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lbw.data.service.entity.Order;

/**
 * CustomerMapper
 * 
 * @author LiuBaoWen
 *
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

	@Select("SELECT * FROM t_order WHERE id = #{id}")
	@Results({ @Result(property = "id", column = "id"), @Result(property = "userId", column = "user_id"),
			@Result(property = "orderId", column = "order_id") })
	Order findById(@Param("id") Long id);

	@Select("SELECT * FROM t_order WHERE order_id = #{orderId}")
	@Results({ @Result(property = "id", column = "id"), @Result(property = "userId", column = "user_id"),
			@Result(property = "orderId", column = "order_id") })
	Order findByOrderId(@Param("orderId") Long orderId);

	@Select("SELECT count(1) FROM t_order order by id")
	int count();

}
