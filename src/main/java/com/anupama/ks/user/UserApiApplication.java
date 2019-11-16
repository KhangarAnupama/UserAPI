package com.anupama.ks.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.anupama.ks.user.dto.DeviceRepository;
import com.anupama.ks.user.dto.UserRepository;

@SpringBootApplication
public class UserApiApplication {
	
	@Autowired
	UserRepository repository;
	
	@Autowired
	DeviceRepository deviceRepo;

	public static void main(String[] args) {
		SpringApplication.run(UserApiApplication.class, args);
	}

}
