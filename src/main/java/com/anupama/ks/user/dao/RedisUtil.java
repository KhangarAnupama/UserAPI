package com.anupama.ks.user.dao;
import org.springframework.stereotype.Service;

import redis.clients.jedis.Jedis; 

@Service
public class RedisUtil { 

	String registerMac = "00:0a:95:9d:68:16";

	private boolean isAuthentic(String macAddress) {
		boolean auth = false;
		if(registerMac.equals(macAddress))
			auth =  true;
		return auth;
	}

	public String readDataFromCache(String macAddress) {
		
		String data = "";
		if(isAuthentic(macAddress)) {
			Jedis jedis = new Jedis("localhost"); 
			System.out.println("Connection to redis server sucessfully"); 
			data = jedis.get(macAddress);
		}
		return data;
	}
	
	public static void main(String[] args) {
		RedisUtil redisUtil = new RedisUtil();
		String data =  redisUtil.readDataFromCache("00:0a:95:9d:68:16");
		System.out.println(data);
	}
	
}