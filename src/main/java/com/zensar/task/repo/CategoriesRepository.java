package com.zensar.task.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.task.entities.Categories;
@Repository
public interface CategoriesRepository extends JpaRepository<Categories, Integer>{



}
