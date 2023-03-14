package com.lcwd.hotelservice.service;

import java.util.List;

import com.lcwd.hotelservice.entity.Hotel;

public interface HotelServices 
{
	
	//create
	Hotel saveHotel(Hotel hotel);
	
	//getAll Hotels
	List<Hotel> getAllHotels();
	
	//getSingle Hotel
	Hotel getHotelById(String id);

}
