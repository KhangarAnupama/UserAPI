package com.anupama.ks.user.dto;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.anupama.ks.user.model.DeviceEntity;

public interface DeviceRepository extends CrudRepository<DeviceEntity, Integer>{


	@Transactional
	@Modifying
	@Query("UPDATE DeviceEntity d SET d.activate = :status WHERE d.id = :id")
	int updateAddress(@Param("id") int id,  @Param("status") Boolean status);

	//UPDATE device d SET d.activate = :status WHERE c.id = :id")
}
