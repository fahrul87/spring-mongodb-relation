package com.fahrul.springmongorelation.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
	
	private String city;
	private String state;
	private String pincode;
	

}
