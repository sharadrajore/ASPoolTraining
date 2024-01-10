package com.zensar.spring_core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.zensar.spring_core.beans.Address;
import com.zensar.spring_core.beans.Employee;
import com.zensar.spring_core.beans.Product;


public class App 
{
    public static void main( String[] args )
    {


    	ApplicationContext context=new FileSystemXmlApplicationContext("./src/main/resources/context.xml");// metadata
    	
    	Address address = context.getBean("addr",Address.class);
    	
    	System.out.println(address);
    	
    	
    
    	
    	
    	
    	
    	
    
    	
    	
    }
}
