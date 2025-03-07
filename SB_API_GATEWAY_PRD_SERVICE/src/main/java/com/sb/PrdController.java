package com.sb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/prd")
public class PrdController {
	
	@GetMapping("/get")
	//@GetMapping
	public String getMethodName() {
	    return "Product Service";
	}
	
	@Autowired
	private RestTemplate rt;
	
	@GetMapping("/reg")
	public String getMethodNameOne() {
		return rt.getForObject("http://REG-SERVICE/reg/reg1", String.class);
	}
	
	@GetMapping("/err")
	public String getMethodNameErr() {
		String res = rt.getForObject("http://REG-SERVICE/reg/reg1111", String.class);
		return res;
	}
	
	@GetMapping("/eee")
    public ResponseEntity<String> fallback() {
        return ResponseEntity.ok("Fallback response: Service is currently unavailable.");
        //
    }
	
	
}
