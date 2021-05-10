package com.zensar.task.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.zensar.task.entities.Advertises;
import com.zensar.task.repo.AdvertiseRepository;


@Service
public class AdvertiseServiceIMPL implements AdvertiseService{

	@Autowired
	public AdvertiseRepository advertiseRepo;
	
	@Override
	public Advertises createAdvertise(Advertises advertises) {
		
		return advertiseRepo.save(advertises);
	}

	@Override
	public Advertises updateAdvertise(Advertises advertises) 
	{
		Advertises existingAd=advertiseRepo.findById(advertises.getId()).orElse(null);
		existingAd.setId(advertises.getId());
		existingAd.setTitle(advertises.getTitle());
		existingAd.setPrice(advertises.getPrice());
		existingAd.setCategory_id(advertises.getCategory_id());
		existingAd.setDescription(advertises.getDescription());
		existingAd.setUser_id(advertises.getUser_id());
		return advertiseRepo.save(advertises);
	}

	@Override
	public Optional<Advertises> deleteAdv(int id) {
		advertiseRepo.deleteById(id);
		return null;
		 
	}

	@Override
	public List<Advertises> getAllAdv() {
		
		return advertiseRepo.findAll();
	}

	@Override
	public Optional<Advertises> getAdvertiseById(int id) {
		
		return advertiseRepo.findById(id);
	}

	@Override
	public List<Advertises> getAdvInRange(double min,double max) {
		
		return advertiseRepo.getAdvInRange(min,max);
	}


}