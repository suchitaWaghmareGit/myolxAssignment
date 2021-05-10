package com.zensar.task.services;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.zensar.task.entities.Advertises;

public interface AdvertiseService {

	Advertises createAdvertise(Advertises advertises);

	Advertises updateAdvertise(Advertises advertises);

	Optional<Advertises> deleteAdv(int id);

	List<Advertises> getAllAdv();

	Optional<Advertises> getAdvertiseById(int id);

	List<Advertises> getAdvInRange(double min, double max);

}
