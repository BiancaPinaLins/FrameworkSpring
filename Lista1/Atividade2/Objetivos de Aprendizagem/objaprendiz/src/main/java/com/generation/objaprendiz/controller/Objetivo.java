package com.generation.objaprendiz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivo")
public class Objetivo {
	
	@GetMapping
	public String objetivo() {
		return "Aprender Java";
	}

}
