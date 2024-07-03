package com.example.SpringFirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringFirstApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(SpringFirstApplication.class, args);
		Home h1 = context.getBean(Home.class);
		h1.connect();
		Home h2 = context.getBean(Home.class);
		h2.connect();
	}

}
