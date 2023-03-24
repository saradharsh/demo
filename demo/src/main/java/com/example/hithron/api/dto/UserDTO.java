package com.example.hithron.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserDTO {
	

	private Integer userId;
	
	private String firstName;
	
	private String lastName;
	
	private Integer age;
	
	private String gender;
	
	private String dateOfBirth;

}
