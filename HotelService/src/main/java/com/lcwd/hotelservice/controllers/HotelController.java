package com.lcwd.hotelservice.controllers;

import java.util.List;

import com.lcwd.hotelservice.entity.Hotel;
import com.lcwd.hotelservice.service.HotelServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hotel")
public class HotelController 
{
	@Autowired
	private HotelServices hotelServices;

	//create new the users
	@PostMapping("/savehotel")
	public ResponseEntity<Hotel> savehotel(@RequestBody Hotel hotel)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(hotelServices.saveHotel(hotel));
	}
	
	//get all hotel
	@GetMapping("/getallhotels")
	public  ResponseEntity<List<Hotel>> getAllHotels()
	{
		return ResponseEntity.ok(hotelServices.getAllHotels());
	}
	
	//get single by id
	@GetMapping("/gethotelbyid/{id}")
	public  ResponseEntity<Hotel> getHotelById(@PathVariable String id)
	{
		return ResponseEntity.ok(hotelServices.getHotelById(id));
	}
}
