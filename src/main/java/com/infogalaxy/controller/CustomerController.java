package com.infogalaxy.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infogalaxy.entity.CustomerEntity;
import com.infogalaxy.modellayer.CustomerModel;
import com.infogalaxy.service.CustomerService;

//import com.infogalaxy.entity.CustomerEntity;

@RestController
@RequestMapping("/costumerapi")
public class CustomerController {

	//@Autowired
	CustomerService customerservice = new CustomerService();
	
	//List<CustomerEntity> customerList = new ArrayList<CustomerEntity>();
	@GetMapping("/getallcust")
	public List<CustomerEntity> getAllCustomer() {
		return customerservice.getAllCustomer();
		
		
	}
		@PostMapping("/addCustomerr")
		public void addCustomer(@RequestBody CustomerModel customermodel) {
		customerservice.addCust(customermodel);
	//	return customerservice;

	}
		@GetMapping("/cid")
		public String getcid() {
			return "Get Customer information Using Id";
		}

		@GetMapping("/cname")
		public String getcname() {
			return "Customer Name";
		}

		@GetMapping("/emailid")
		public String getemailId() {
			return "EmailId";
		}


}
