package com.infogalaxy.service;

import java.util.ArrayList;
import java.util.List;

import com.infogalaxy.entity.HotelEntity;
import com.infogalaxy.modellayer.HotelModelLayer;

public class HotelService {
	List<HotelEntity> hotelEntities = new ArrayList<HotelEntity>();

	public List<HotelEntity> getAllFood() {
		return hotelEntities;
	}

	public void addNewFood(HotelModelLayer hotelModelLayer) {
		HotelEntity hotelEntity = new HotelEntity();
		hotelEntity.setFid(hotelModelLayer.getFid());
		hotelEntity.setFname(hotelModelLayer.getFname());
		hotelEntity.setFprice(hotelModelLayer.getFprice());
		hotelEntity.setQty(hotelModelLayer.getQty());
		hotelEntities.add(hotelEntity);

	}
}
