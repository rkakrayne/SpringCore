package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.pluralsight.model.Customer;
@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/* (non-Javadoc)
	 * @see com.pluralsight.repository.CustomerInterface#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		List<Customer> customer = new ArrayList<>();
		Customer cust= new Customer();
		
		cust.setFirstName("Renu");cust.setLastName("kakrayne");
		customer.add(cust);
		
		return customer;
		
	}
}
