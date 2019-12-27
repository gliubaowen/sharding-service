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
import com.lbw.data.service.entity.Customer;

/**
 * CustomerMapper
 * 
 * @author LiuBaoWen
 *
 */
@Mapper
public interface CustomerMapper extends BaseMapper<Customer> {

	@Select("SELECT * FROM CUSTOMER WHERE id = #{id}")
	@Results({ @Result(property = "id", column = "id"), @Result(property = "userId", column = "user_id"),
			@Result(property = "firstName", column = "first_name"),
			@Result(property = "lastName", column = "last_name") })
	Customer findById(@Param("id") Long id);

	@Select("SELECT count(*) FROM customer")
	int count();

}
