package com.infogalaxy.service;

import java.util.ArrayList;
import java.util.List;

import com.infogalaxy.entity.CustomerEntity;
import com.infogalaxy.modellayer.CustomerModel;

public class CustomerService {
	
	List<CustomerEntity> customerList = new ArrayList<CustomerEntity>();
	
	public List<CustomerEntity> getAllCustomer() {
	
		return customerList;
		
	}

	public void addCust(CustomerModel customermodel) {
		CustomerEntity customerentity = new CustomerEntity();
		customerentity.setCid(customermodel.getCid());
		customerentity.setCname(customermodel.getCname());
		customerentity.setEmailid(customermodel.getEmailid());
		customerentity.setMobno(customermodel.getMobno());
		customerList.add(customerentity);
		//return customerList;
	}
}
