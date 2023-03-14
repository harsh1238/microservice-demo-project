package com.lcwd.ratingservice.serviceimpl;

import java.util.List;
import java.util.UUID;

import com.lcwd.ratingservice.entities.Rating;
import com.lcwd.ratingservice.repositories.RatingRepository;
import com.lcwd.ratingservice.service.RatingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RatingServiceImpl implements RatingService
{
	
	@Autowired
	private RatingRepository ratingRepository;

	@Override
	public Rating create(Rating rating) 
	{
		// TODO Auto-generated method stub
		
		String ratingId = UUID.randomUUID().toString();
		rating.setRatingId(ratingId);
		return ratingRepository.save(rating);
	}

	@Override
	public List<Rating> getAllRatings()
	{
		// TODO Auto-generated method stub
		return ratingRepository.findAll();
	}

	@Override
	public List<Rating> getRatingByUserId(String userId)
	{
		// TODO Auto-generated method stub
		return ratingRepository.findByUserId(userId);
	}

	@Override
	public List<Rating> getRatingByHotelId(String hotelId)
	{
		// TODO Auto-generated method stub
		return ratingRepository.findByHotelId(hotelId);
	}
}
