package com.degaut.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.degaut.course.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{

}
