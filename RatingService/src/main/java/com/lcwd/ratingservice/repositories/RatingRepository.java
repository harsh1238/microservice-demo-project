package com.lcwd.ratingservice.repositories;

import java.util.List;

import com.lcwd.ratingservice.entities.Rating;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<Rating, String>
{
	
	//custom finder methods
	List<Rating> findByUserId(String userId);
	
	List<Rating> findByHotelId(String hotelId);

}
 