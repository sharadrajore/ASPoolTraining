package com.zensar.spring_core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;


public class App 
{
    public static void main( String[] args )
    {
       //Product product=new Product(1,"Laptop",60000);// I don't to create object 
       
       //System.out.println(product);  container
    	
    	//ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");// metadata

    	ApplicationContext context=new FileSystemXmlApplicationContext("./src/main/resources/context.xml");// metadata
    	
    	
    	//Employee employee = context.getBean("employee",Employee.class);

    	//Address address = context.getBean("address",Address.class);
    	
    	//System.out.println(employee.getAddress().hashCode());
    	
    	
    	//Employee employee2 = context.getBean("employee",Employee.class);

    	//Address address = context.getBean("address",Address.class);
    	
    	//System.out.println(employee2.getAddress().hashCode());
    	
    	
    	
    	
    	//System.out.println(address);
    	
    //	((AbstractApplicationContext) context).close();
    	
    	
    	
    	
		/*
		 * ApplicationContext context2=new
		 * FileSystemXmlApplicationContext("./src/main/resources/context.xml");
		 * 
		 * Employee employee3 = context2.getBean("employee",Employee.class);
		 * 
		 * //Address address = context.getBean("address",Address.class);
		 * 
		 * System.out.println(employee3.getAddress().hashCode());
		 * 
		 * 
		 * Employee employee4 = context2.getBean("employee",Employee.class);
		 * 
		 * //Address address = context.getBean("address",Address.class);
		 * 
		 * System.out.println(employee4.getAddress().hashCode());
		 */
    	
    	
    	
    	
    	
    	
    	
    	//beanFactory.getBean("employee");
    	
    
    	
    	
    }
}
