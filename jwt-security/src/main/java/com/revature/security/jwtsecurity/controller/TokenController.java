package com.revature.security.jwtsecurity.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.security.jwtsecurity.model.JwtUser;
import com.revature.security.jwtsecurity.security.JwtGenerator;

@RestController
@RequestMapping("/token")
public class TokenController {
	
	private JwtGenerator jwtGenerator;
	
	public TokenController(JwtGenerator jwtGenerator) {
		this.jwtGenerator = jwtGenerator;
	}
	
	@PostMapping
	public String generate(@RequestBody final JwtUser jwtUser) {
		
		return jwtGenerator.generate(jwtUser);
		
	}

}
