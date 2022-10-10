package com.registrer.users.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.registrer.users.dto.UserRegistrerDTO;
import com.registrer.users.services.UsersServices;

@Controller
@RequestMapping("/registro")
public class RegistrerUserControll {

	private UsersServices userService;

	public RegistrerUserControll(UsersServices userService) {
		super();
		this.userService = userService;
	}
	
	@ModelAttribute("usuario")
	public UserRegistrerDTO ReturnNewUserResDTO() {
		return new UserRegistrerDTO();
	}
	
	@GetMapping
	public String ShowFormRegis() {
		return "registro";
	}
	
	@PostMapping
	public String RegisAcount(@ModelAttribute("usuario") UserRegistrerDTO regisDTO) {
		userService.save(regisDTO);
		return "redirect:/registro?successful";
	}

}
