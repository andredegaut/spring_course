package com.degaut.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.degaut.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}
