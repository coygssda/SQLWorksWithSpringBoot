package com.tradesmanagement.stockexchange.repository;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="user")
public class UserDto {

	@Id
	String userId;
	
	@NotBlank
	String userName;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public UserDto(String userId, @NotBlank String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}
		
}
