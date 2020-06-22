package com.fahrul.springmongorelation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fahrul.springmongorelation.model.User;
import com.fahrul.springmongorelation.repository.FlipkartRepository;

@RestController
@RequestMapping("/order-service")
public class FlipkartOMController {
	
	@Autowired
	private FlipkartRepository repository;

	@PostMapping("/placeOrderNow")
	public String placeOrder(@RequestBody User user) {
		repository.save(user);
		return "Order place Successs";
	}
	
	@GetMapping("/getUserByName/{name}")
	public List<User> getUserByName(@PathVariable String name){
		return repository.findByName(name);
		
	}
	
	@GetMapping("/getUserByAddress/{city}")
	public List<User> getUserByAddress(@PathVariable String city){
		return repository.findByCity(city);
	}
}
