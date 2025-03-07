package com.sb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reg")
public class RegController {
	
	@GetMapping("/get")
	public String getMethodName() {
		return "Registration Service";
	}
	
	@GetMapping("/reg1")
	public String getMethodNameOne() {
		return "Micro Call";
	}
	
	

}
