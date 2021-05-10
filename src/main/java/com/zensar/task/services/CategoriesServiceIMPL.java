package com.zensar.task.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.zensar.task.entities.Categories;
import com.zensar.task.repo.CategoriesRepository;

@Service
public class CategoriesServiceIMPL implements CategoriesService{

	@Autowired
	CategoriesRepository CategoriesRepo;
	
	@Override
	public Optional<Categories> getCategory(int id) {
		
		return CategoriesRepo.findById(id);
	}

	@Override
	public List<Categories>  newcategory() {
		List<Categories> categories=new ArrayList<Categories>();
			Categories c=new Categories(1, "furniture", "we take customized order for furniture");
			Categories c1=new Categories(2, "cars", "brand new as well as second hand cars available");
			Categories c2=new Categories(3, "housing", "semi furnished 2 bhk available");
			Categories c3=new Categories(4, "toys", "soft toys for kids available ");
					categories.add(c);
					categories.add(c1);
					categories.add(c2);
					categories.add(c3);
		return CategoriesRepo.saveAll(categories);
		
	}
	

	@Override
	public String createCategory(Categories c) 
	{
		CategoriesRepo.save(c);
		return "createds";
	}

	@Override
	public String addCategory(Categories c) {
		CategoriesRepo.save(c);
		return "added";
	}

}
