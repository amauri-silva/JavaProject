package com.crypto.market;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication(scanBasePackages = "com.crypto.market")
public class MarketApplication {

	private String name;
	
	public static void main(String[] args) {
		SpringApplication.run(MarketApplication.class, args);
	}

}
