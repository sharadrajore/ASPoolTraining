package com.zensar.spring_core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.zensar.spring_core.beans.Product;
import com.zensar.spring_core.config.JavaConfig;


public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
    	
    	
    	Product product = context.getBean("getProduct",Product.class);
    	
    	System.out.println(product);
    }
}
