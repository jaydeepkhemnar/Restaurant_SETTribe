package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Entity.feedback;

public interface feedBack extends JpaRepository<feedback, String>{

	
}
