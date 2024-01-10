package com.zensar.spring_core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zensar.spring_core.beans.Product;

@Configuration
public class JavaConfig {
	
	
	@Bean
	public Product getProduct() {
		Product p=new Product(1, "HDD", 5000);
		return p;
	}

}
