package com.anupama.ks.user.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anupama.ks.user.model.DeviceEntity;
import com.anupama.ks.user.model.ParentEntity;

@Service
public class UserDTOImpl {
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	DeviceRepository deviceRepo;

	public void saveUser(ParentEntity dto) {
		userRepo.save(dto);
	}
	
	public void saveDevice(DeviceEntity device) {
		deviceRepo.save(device);
	}
	
	
	
	

}
