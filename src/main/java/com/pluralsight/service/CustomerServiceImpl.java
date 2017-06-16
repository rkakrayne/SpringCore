package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository custRepository;

	// This is for constructor injection

	public CustomerServiceImpl() {

	}

	public CustomerServiceImpl(CustomerRepository iCustomerRepository) {
		this.custRepository = iCustomerRepository;
	}

	public CustomerServiceImpl(CustomerRepository iCustomerRepository, String testParam) {
		this.custRepository = iCustomerRepository;
		System.out.println("parameterise construction: " + testParam);
	}

	public CustomerServiceImpl(CustomerRepository iCustomerRepository, String testParam, String testParam1) {
		this.custRepository = iCustomerRepository;
		System.out.println("parameterise construction: param 1 " + testParam);
		System.out.println("parameterise construction: param 2 " + testParam1);
	}

	// End

	// This is for setter injection

	public void setCustRepository(CustomerRepository custRepository) {
		this.custRepository = custRepository;
		System.out.println("Setter 1 is called..");
	}
	
	//This method is added for when autowire is set to byName as it exactly looks for the settername same as bean name in xml 
	//In our case bean name in xml is customerRepository and we have defined a setter method(above) with name "setCustRepository"
	//So, the above setter "setCustRepository" was working fine with autowire set to byType. But when it is changed to byName it failed due to unmatched setter method name
	//"setCustRepository" unlike bean name in xml "customerRepository"
	//NOTE:: So, to make things work either add setter or change bean name in Xml
	//Thus, byType looks for the type of arguments
	//byName looks for name of setter method
	public void setCustomerRepository(CustomerRepository custRepository) {
		this.custRepository = custRepository;
		System.out.println("Setter 2 is called..");
	}
	// End

	@Override
	public List<Customer> findAll() {
		return custRepository.findAll();
	}
}
