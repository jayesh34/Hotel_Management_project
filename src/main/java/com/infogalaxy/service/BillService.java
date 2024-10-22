package com.infogalaxy.service;

import java.util.ArrayList;
import java.util.List;

import com.infogalaxy.entity.BillEntity;
import com.infogalaxy.modellayer.BillModel;

public class BillService {
	
	List<BillEntity> billList = new ArrayList<>();
	
	public List<BillEntity> getBillCustomer() {
		return billList;
	}
	
	public void addBillCustomer(BillModel billModel) {
		BillEntity billEntity = new BillEntity();
		billEntity.setBid(billModel.getBid());
		billEntity.setBdate(billModel.getBdate());
		billEntity.setBamount(billModel.getBamount());
		billList.add(billEntity);
	}
}
