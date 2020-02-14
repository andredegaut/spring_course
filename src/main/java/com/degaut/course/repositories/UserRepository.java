package com.degaut.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.degaut.course.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{

}
