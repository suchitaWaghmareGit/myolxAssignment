package com.zensar.task.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;

import com.zensar.task.entities.Advertises;

public interface AdvertiseRepository extends JpaRepository<Advertises, Integer>{

@Query("from Advertises where price between :min and :max")
	List<Advertises> getAdvInRange(@Param("min")double min,@Param("max") double max);

}
