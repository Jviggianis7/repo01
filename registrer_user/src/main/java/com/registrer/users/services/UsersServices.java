package com.registrer.users.services;

import com.registrer.users.dto.UserRegistrerDTO;
import com.registrer.users.model.User;

public interface UsersServices {
	
	public User save(UserRegistrerDTO registrerDTO);
}
