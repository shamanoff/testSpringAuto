package com.example;

import com.example.entity.Developer;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestSpringAutoApplication {

	public static void main(String[] args) {
		BeanFactory beanFactory = SpringApplication.run(TestSpringAutoApplication.class, args);
		Developer dev = beanFactory.getBean(Developer.class);
		dev.displayInfo();


	}
}
