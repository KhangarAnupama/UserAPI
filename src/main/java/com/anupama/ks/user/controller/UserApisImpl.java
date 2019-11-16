package com.anupama.ks.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anupama.ks.user.dto.DeviceRepository;
import com.anupama.ks.user.dto.UserDTOImpl;
import com.anupama.ks.user.dto.UserRepository;
import com.anupama.ks.user.model.DeviceEntity;
import com.anupama.ks.user.model.ParentEntity;


@RestController
public class UserApisImpl {
	
	@Autowired
	UserDTOImpl userDAO;
	
	@Autowired
	DeviceRepository deviceRepo;
	
    @RequestMapping(value = "/user/register", method = RequestMethod.POST,
    consumes = MediaType.APPLICATION_JSON_VALUE,
    produces = MediaType.APPLICATION_JSON_VALUE)
	public String registerUser(@RequestBody ParentEntity user) {
		userDAO.saveUser(user);
		return "User registered successfully";
	}
    
    @RequestMapping(value = "/device/activate", method = RequestMethod.POST,
    consumes = MediaType.APPLICATION_JSON_VALUE,
    produces = MediaType.APPLICATION_JSON_VALUE)
	public String activateDevice(@RequestBody DeviceEntity device) {
		userDAO.saveDevice(device);
		return "Device registered successfully";
	}
    
    @RequestMapping(value = "/device/deactivate", method = RequestMethod.PUT)
	public String deactivateDevice(@RequestParam(value = "id", required = true) Integer id, @RequestParam (value = "status", required = true)Boolean status) {
    	deviceRepo.updateAddress(id, status);
		return "Device updated successfully";
	}

}
