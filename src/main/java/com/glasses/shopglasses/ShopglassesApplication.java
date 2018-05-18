package com.glasses.shopglasses;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.glasses.shopglasses.mapper")
public class ShopglassesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopglassesApplication.class, args);
	}
}
