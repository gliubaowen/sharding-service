/**
 * 
 */
package com.lbw.data.service.entity.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import lombok.extern.slf4j.Slf4j;

/**
 * 项目启动后运行
 * 
 * @author LiuBaoWen
 *
 */
@Slf4j
public class CustomerApplicationRunner implements ApplicationRunner {

	/**
	 *
	 * @author LiuBaoWen
	 * @see org.springframework.boot.ApplicationRunner#run(org.springframework.boot.ApplicationArguments)
	 * @param args
	 * @throws Exception
	 */
	@Override
	public void run(ApplicationArguments args) throws Exception {
		log.info("通过实现ApplicationRunner接口，在spring boot项目启动后打印参数");
		String[] sourceArgs = args.getSourceArgs();
		for (String arg : sourceArgs) {
			log.info(arg + " ");
		}
	}

}
