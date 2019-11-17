package com.anupama.ks.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anupama.ks.user.dao.DeviceRepository;
import com.anupama.ks.user.dao.RedisUtil;
import com.anupama.ks.user.dao.UserDTOImpl;
import com.anupama.ks.user.model.DeviceEntity;
import com.anupama.ks.user.model.ParentEntity;

import redis.clients.jedis.Jedis;

@RestController
public class UserApisImpl {
	
	@Autowired
	UserDTOImpl userDAO;
	
	@Autowired
	DeviceRepository deviceRepo;
	
	@Autowired
	RedisUtil redisUtil;
	
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
    
    @RequestMapping(value = "/user/current/location", method = RequestMethod.POST,
    produces = MediaType.APPLICATION_JSON_VALUE)
	public String currentLocation(@RequestParam(value = "mac", required = true)String macAddress) {
    	String data = redisUtil.readDataFromCache(macAddress);
		return data;
	}
    
    @RequestMapping(value = "/user/day/data", method = RequestMethod.POST,
    produces = MediaType.APPLICATION_JSON_VALUE)
	public String oneDayData(@RequestParam(value = "id", required = true) Integer id) {
		return "One day data called";
	}
    
    @RequestMapping(value = "/user/setLocation", method = RequestMethod.POST,
    produces = MediaType.APPLICATION_JSON_VALUE)
	public String setLocation() {
    	// TO_DO
		return "Set location successfully";
	}
    

}
