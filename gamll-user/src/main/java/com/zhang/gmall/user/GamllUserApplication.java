package com.zhang.gmall.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.zhang.gmall.user.mapper")
public class GamllUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(GamllUserApplication.class, args);
	}

}
