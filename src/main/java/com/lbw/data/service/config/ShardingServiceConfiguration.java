/**
 * 
 */
package com.lbw.data.service.config;

import org.apache.shardingsphere.core.strategy.keygen.SnowflakeShardingKeyGenerator;
import org.apache.shardingsphere.spi.keygen.ShardingKeyGenerator;
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
	 * 主键生成
	 * <p>
	 * 雪化算法
	 * </p>
	 * 
	 * @author LiuBaoWen
	 * @return
	 */
	@Bean
	public ShardingKeyGenerator keyGenerator() {
		return new SnowflakeShardingKeyGenerator();
	}

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
