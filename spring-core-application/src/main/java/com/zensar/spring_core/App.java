package com.zensar.spring_core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring_core.beans.Product;


public class App 
{
    public static void main( String[] args )
    {
       //Product product=new Product(1,"Laptop",60000);// I don't to create object 
       
       //System.out.println(product);  container
    	
    	ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");// metadata
    	
    	Product bean1 = context.getBean("p1",Product.class);
    	
    	
    	System.out.println(bean1);
    	
    	
    }
}
