package com.registrer.users.services;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.registrer.users.dto.UserRegistrerDTO;
import com.registrer.users.model.User;
import com.registrer.users.model.miRol;
import com.registrer.users.repositore.UserRepository;

@Service
public class UsersServicesImpl implements UsersServices{
	
	private UserRepository userRepository;
	
	

	public UsersServicesImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}



	@Override
	public User save(UserRegistrerDTO registrerDTO) {
		User user = new User(registrerDTO.getNombre(),registrerDTO.getUsuario(),
				             registrerDTO.getPassword(),Arrays.asList(new miRol("ROLE_USER")));
		return userRepository.save(user);
	}

}
