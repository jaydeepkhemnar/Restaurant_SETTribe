package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Entity.feedback;
import com.dao.UserRepository;
import com.demo.User;
import com.demo.dao.feedBack;




@RestController

@CrossOrigin(origins = "http://localhost:3000")

public class UserController {
	 @Autowired
	 UserRepository userRepository;
	 
	 @Autowired
	 feedBack fee;
	 
	    @PostMapping("/api/signup")
	    public User signUp(@RequestBody User user) {
	        return userRepository.save(user);
	    }
	    @PostMapping("/api/feedback")
	    public feedback  feed(@RequestBody feedback feedba) {
	    	return fee.save(feedba);
	    	
	    }
	    
	    
	    
	   
		
		
	   
}
