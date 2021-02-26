package com.zhss.eshop;

import com.zhss.eshop.common.config.DruidDataSourceConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 系统启动类
 * @author suyuan
 *
 */
@SpringBootApplication
//@EnableScheduling
//@ServletComponentScan
@Import(DruidDataSourceConfig.class)
@MapperScan("com.zhss.eshop.*.mapper")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(com.zhss.eshop.Application.class, args);
	}

}
