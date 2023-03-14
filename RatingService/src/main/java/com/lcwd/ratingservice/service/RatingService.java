package com.lcwd.ratingservice.service;

import java.util.List;

import com.lcwd.ratingservice.entities.Rating;

public interface RatingService 
{
	
	//create
	Rating create(Rating rating);
	
	//get all rating
	List<Rating> getAllRatings();
	
	//get all ratings by user id
	List<Rating> getRatingByUserId(String userId);
	
	////get all ratings by hotel id
	List<Rating> getRatingByHotelId(String hotelId);

}
