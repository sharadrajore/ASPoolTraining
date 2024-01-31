package com.zensar.spring_core.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

//@Component
@Service
public class Employee  {
	
	@Value("${empId}")
	private int employeeId;
	@Value("${empName}")
	private String employeeName;
	@Value("${empAge}")
	private double employeeAge;
	
	@Autowired 
	@Qualifier(value = "address")
	private IAddress address;
	
	

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
	
	
	
 //  @Autowired  // constructor 
  // @Qualifier()// method level annotation
	public Employee(IAddress address) {
		super();
		this.address = address;
		System.out.println("I am inside public Employee(Address address)");
	}

	public IAddress getAddress() {
		return address;
	}

	//@Autowired   // method
	public void setAddress(Address address) {
		System.out.println("I am inside public void setAddress(Address address) ");
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
