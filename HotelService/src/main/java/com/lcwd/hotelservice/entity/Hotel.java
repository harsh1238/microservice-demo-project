package com.lcwd.hotelservice.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Hotel {
	
	@Id
	private String id;
	private String name;
	private String location;
	private String about;
	
}
