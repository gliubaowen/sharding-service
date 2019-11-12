/**
 * 
 */
package com.lbw.data.service.entity.runner;

import org.springframework.boot.CommandLineRunner;

/**
 * 项目启动后运行
 * 
 * @author LiuBaoWen
 *
 */
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
		System.out.println("通过实现CommandLineRunner接口，在spring boot项目启动后打印参数");
		for (String arg : args) {
			System.out.print(arg + " ");
		}

	}

}
