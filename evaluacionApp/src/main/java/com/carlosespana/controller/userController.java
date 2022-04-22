package com.carlosespana.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.carlosespana.service.usuarioService;

@Controller
public class userController {
	
	@Autowired
	usuarioService usuarioService;
	
	@GetMapping("/")
	public String index(Model model) {
		
		return "index";
	}
}
