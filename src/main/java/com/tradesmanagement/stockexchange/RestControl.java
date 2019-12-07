package com.tradesmanagement.stockexchange;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tradesmanagement.stockexchange.repository.UserDto;
import com.tradesmanagement.stockexchange.repository.UserRepository;

@RestController
public class RestControl {
	
	@Autowired
	UserRepository userRepository;

	@RequestMapping("/users/add")
	public ResponseEntity<UserDto> addUser(@RequestBody UserDto user){
		
		UserDto userDto=new UserDto(user.getUserId(),user.getUserName());
		
		userRepository.save(userDto);
		return new ResponseEntity<>(userDto, HttpStatus.OK);
		
	}
}
