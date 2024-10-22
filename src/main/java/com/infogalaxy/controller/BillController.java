package com.infogalaxy.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infogalaxy.entity.BillEntity;
import com.infogalaxy.modellayer.BillModel;
import com.infogalaxy.service.BillService;

@RestController
@RequestMapping("/billapi")
public class BillController {

	BillService billservice = new BillService();
	
	@GetMapping("/getbill")
	public List<BillEntity> getBill() {
		return billservice.getBillCustomer();
	}
	
	@PostMapping("/addbill")
	public void addBill(@RequestBody BillModel billmodel) {
		 billservice.addBillCustomer(billmodel);
	}
}
