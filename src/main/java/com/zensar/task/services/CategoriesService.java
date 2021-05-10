package com.zensar.task.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.zensar.task.entities.Categories;

@Service
public interface CategoriesService {

	Optional<Categories> getCategory(int id);

	List<Categories> newcategory();

	String addCategory(Categories c);

	String createCategory(Categories c);

}
