/**
 * 
 */
package com.lbw.data.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lbw.data.service.entity.runner.CustomerApplicationRunner;
import com.lbw.data.service.entity.runner.CustomerCommandLineRunner;

/**
 * 项目配置类
 * 
 * @author LiuBaoWen
 *
 */
@Configuration
public class ShardingServiceConfiguration {

	/**
	 * ApplicationRunner
	 * 
	 * @author LiuBaoWen
	 * @return
	 */
	@Bean
	public CustomerApplicationRunner customerApplicationRunner() {
		return new CustomerApplicationRunner();
	}

	/**
	 * CommandLineRunner
	 * 
	 * @author LiuBaoWen
	 * @return
	 */
	@Bean
	public CustomerCommandLineRunner customerCommandLineRunner() {
		return new CustomerCommandLineRunner();
	}

}
