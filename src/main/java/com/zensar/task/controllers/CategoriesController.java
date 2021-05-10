package com.zensar.task.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.task.entities.Categories;
import com.zensar.task.services.CategoriesService;



@RestController
public class CategoriesController {
	
	@Autowired
	CategoriesService categoryservice;
	
@GetMapping("/category")
	public List<Categories> addCategories()
	{
	List<Categories> categories=new ArrayList<Categories>();
	
	Categories c=new Categories(1, "furniture", "we take customized order for furniture");
	Categories c1=new Categories(2, "cars", "brand new as well as second hand cars available");
	Categories c2=new Categories(3, "housing", "semi furnished 2 bhk available");
	Categories c3=new Categories(4, "toys", "soft toys for kids available ");
			categories.add(c);
			categories.add(c1);
			categories.add(c2);
			categories.add(c3);
	return categories;
	}
	@GetMapping("/category/{id}")
public Optional<Categories> getCategory(@PathVariable int id)
{
	return categoryservice.getCategory(id);
	
}

@PostMapping("/category")
public String createCategory(@RequestBody Categories c) 
{
	return categoryservice.createCategory(c);
}

}
