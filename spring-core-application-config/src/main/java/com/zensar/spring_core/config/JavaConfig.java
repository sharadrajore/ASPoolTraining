package com.zensar.spring_core.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.zensar.spring_core.beans")
@PropertySource("app.properties")
public class JavaConfig {
	
	
	/*@Bean(value = "product")
	public Product getProduct() {
		Product p=new Product(1, "HDD", 5000);
		return p;
	}*/

}
