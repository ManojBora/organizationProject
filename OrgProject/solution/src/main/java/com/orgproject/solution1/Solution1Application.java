package com.orgproject.solution1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@EnableTransactionManagement
@SpringBootApplication
public class Solution1Application {

	public static void main(String[] args) {
		SpringApplication.run(Solution1Application.class, args);
	}

}

