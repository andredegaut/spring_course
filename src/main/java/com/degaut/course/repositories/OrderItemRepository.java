package com.degaut.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.degaut.course.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
