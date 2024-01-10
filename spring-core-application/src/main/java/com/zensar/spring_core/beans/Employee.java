package com.zensar.spring_core.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee  {
	
	private int employeeId;
	
	private String employeeName;
	
	private double employeeAge;
	
	private List<Address> address;
	
	

	public Employee() {
		super();
		System.out.println("Inside public Employee()");
	}

	public Employee(int employeeId, String employeeName, double employeeAge) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		System.out.println("I am inside public Employee(int employeeId, String employeeName, double employeeAge) ");
	}
	
	

	

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public int getEmployeeId() {
		
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		System.out.println("I am in public int setEmployeeId()");
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(double employeeAge) {
		this.employeeAge = employeeAge;
	}

	

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAge=" + employeeAge
				+ ", address=" + address + "]";
	}

	@PostConstruct
	public void myInit() throws Exception {// callback method
		System.out.println("I am inside public void afterPropertiesSet() ");
		
	}

	@PreDestroy
	public void myDestroy() throws Exception {
		System.out.println("I am inside public void destroy()");
		
	}

	
	
	

}
