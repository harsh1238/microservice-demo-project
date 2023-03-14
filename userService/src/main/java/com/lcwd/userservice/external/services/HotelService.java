package com.lcwd.userservice.external.services;

import com.lcwd.userservice.entity.Hotel;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="HOTEL-SERVICE")
public interface HotelService
{
	@GetMapping("/api/hotel/gethotelbyid/{id}")
	Hotel getHotel(@PathVariable String id);

}
