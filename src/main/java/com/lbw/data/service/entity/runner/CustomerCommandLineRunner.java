/**
 * 
 */
package com.lbw.data.service.entity.runner;

import org.springframework.boot.CommandLineRunner;

import lombok.extern.slf4j.Slf4j;

/**
 * 项目启动后运行
 * 
 * @author LiuBaoWen
 *
 */
@Slf4j
public class CustomerCommandLineRunner implements CommandLineRunner {

	/**
	 *
	 * @author LiuBaoWen
	 * @see org.springframework.boot.CommandLineRunner#run(java.lang.String[])
	 * @param args
	 * @throws Exception
	 */
	@Override
	public void run(String... args) throws Exception {
		log.info("通过实现CommandLineRunner接口，在spring boot项目启动后打印参数");
		for (String arg : args) {
			log.info(arg + " ");
		}

	}

}
