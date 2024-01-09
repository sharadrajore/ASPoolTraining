package com.zensar.spring_core.beans;

public class Employee {
	
	private int employeeId;
	
	private String employeeName;
	
	private double employeeAge;
	
	private Address address;
	
	

	public Employee() {
		super();
		System.out.println("Inside public Employee()");
	}

	public Employee(int employeeId, String employeeName, double employeeAge) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
	}
	
	

	public Employee(int employeeId, String employeeName, double employeeAge, Address address) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.address = address;
	}
	
	
	
	
	

	public Employee(Address address) {
		super();
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
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

	
	
	

}