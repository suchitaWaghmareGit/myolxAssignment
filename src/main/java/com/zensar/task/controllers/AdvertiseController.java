package com.zensar.task.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.task.entities.Advertises;
import com.zensar.task.services.AdvertiseService;

@RestController
public class AdvertiseController {

	@Autowired
	private AdvertiseService advertiseservice;
	
	
	@PostMapping("/advertise")
	public Advertises createAdvertise(@RequestBody Advertises advertises)
	{
		return advertiseservice.createAdvertise(advertises);
		
	}
	
	@PutMapping("/advertise/{id}")
	public Advertises updateAdvertise(@RequestBody Advertises advertises)
	{
		return advertiseservice.updateAdvertise(advertises);
	}
	
	
	
	@DeleteMapping("/advertise/{id}")
	public Optional<Advertises> deleteAdv(@PathVariable int id)
	{
		return advertiseservice.deleteAdv(id);
		
	}
	
	@GetMapping("/advertise")
	public List<Advertises> getAllAdv()
	{
		return advertiseservice.getAllAdv();
		
	}
	
	@GetMapping("/advertise/{id}")
	public Optional<Advertises> getAdvertiseById(@PathVariable int id)
	{
		return advertiseservice.getAdvertiseById(id);
		
	}
 // SELECT IName, MIN(Price)"Minimum Price", MAX(Price)"Maximum Price" FROM ITEM GROUP BY IName; 
	
	@GetMapping("/advertise/{min}/{max}") //price?min=50&max=90
	public List<Advertises> getAdvInRange(@PathVariable("min") double min,@PathVariable("max")double max)
	{
			return advertiseservice.getAdvInRange(min,max);	
	}
}
