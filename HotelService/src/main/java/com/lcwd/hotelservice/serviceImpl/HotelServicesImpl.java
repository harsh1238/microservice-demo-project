package com.lcwd.hotelservice.serviceImpl;

import java.util.List;
import java.util.UUID;

import com.lcwd.hotelservice.entity.Hotel;
import com.lcwd.hotelservice.exceptions.ResourceNotFoundException;
import com.lcwd.hotelservice.repositories.HotelRepository;
import com.lcwd.hotelservice.service.HotelServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelServicesImpl implements HotelServices
{
	
	@Autowired
	private HotelRepository hotelRepository;

	@Override
	public Hotel saveHotel(Hotel hotel)
	{
		// TODO Auto-generated method stub
		
		String hoteld = UUID.randomUUID().toString();
		hotel.setId(hoteld);
		return hotelRepository.save(hotel);	 
	}

	@Override
	public List<Hotel> getAllHotels()
	{
		// TODO Auto-generated method stub
		return hotelRepository.findAll();
		 
	}

	@Override
	public Hotel getHotelById(String id) {
		// TODO Auto-generated method stub
		
		return hotelRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Hotel not found "+ id));
	}

}
