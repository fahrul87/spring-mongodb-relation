package com.fahrul.springmongorelation.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.fahrul.springmongorelation.model.User;

public interface FlipkartRepository extends MongoRepository<User, Integer>{
	
	List<User> findByName(String name);
	
	@Query("{'Address.city':?0}")
	List<User> findByCity(String city);

}
