package com.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Data
@Table(name="UserSignup")
public class User {
	@Id
    private String email;
	@Column
	 private String firstName;
	@Column
	 private String middleName;
	@Column
	 private String lastName;
	
	@Column
    private String fullName;
	@Column
    private String phoneNumber;
	@Column
    private String password;

}
