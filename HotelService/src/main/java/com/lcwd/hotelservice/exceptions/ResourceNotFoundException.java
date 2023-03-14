package com.lcwd.hotelservice.exceptions;

public class ResourceNotFoundException extends RuntimeException{
	
	public  ResourceNotFoundException (String s)
	{
		super(s);
	}
	
	ResourceNotFoundException()
	{
		
		super(" Hotel not found exception !! ");
	}

}
