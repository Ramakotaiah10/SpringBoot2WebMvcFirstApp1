package com.nareshit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

	@GetMapping("/show")
	public String showPage()
	{
		return "index";
	}
}
