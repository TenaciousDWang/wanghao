package com.wanghao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@ServletComponentScan
public class SpringbootWanghaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWanghaoApplication.class, args);
	}
}
