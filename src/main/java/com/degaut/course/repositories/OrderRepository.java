package com.degaut.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.degaut.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

}
