package com.example.main;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecutityController {
	@RequestMapping(value="access/public/{pin}")
	public String publicDetails(@PathVariable final int pin)
	{
		
		return ("This is not an authorized access");
		
	}
	
	@RequestMapping(value="access/user/{pin}")
	public String userDetails(@PathVariable final int pin)
	{
		
		return ("You are an authorized user");
		
	}
	
	@RequestMapping(value="access/admin/{pin}")
	public String adminDetails(@PathVariable final int pin)
	{
		
		return ("You are an authorized administrator");
		
	}

}
