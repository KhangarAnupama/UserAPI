package com.anupama.ks.user.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.anupama.ks.user.model.DeviceEntity;
import com.anupama.ks.user.model.ParentEntity;
import com.anupama.ks.user.model.ParentTO;

//@Service
public interface UserRepository extends CrudRepository<ParentEntity, Integer>{

	

}
