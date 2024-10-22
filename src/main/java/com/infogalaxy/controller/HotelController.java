package com.infogalaxy.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infogalaxy.entity.HotelEntity;
import com.infogalaxy.modellayer.HotelModelLayer;
import com.infogalaxy.service.HotelService;

@RestController
@RequestMapping("/hotelapi")
public class HotelController {

	HotelService hotelservice = new HotelService();

	@GetMapping("/getall")
	public List<HotelEntity> getAll() {
		return hotelservice.getAllFood();
	}

	@GetMapping("/fid")
	public String getfid() {

		return "Food Id";
	}

	@GetMapping("/fname")
	public String getfname() {
		return "food name";
	}

	@GetMapping("/fprice")
	public void getfprice() {
	}

	@PostMapping("/addfood")
	public void addFood(@RequestBody HotelModelLayer hotelModelLayer) {
		hotelservice.addNewFood(hotelModelLayer);

	}
}
