package com.revature.security.jwtsecurity.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;

import com.revature.security.jwtsecurity.model.JwtAuthenticationToken;

public class JwtAuthenticationTokenFilter extends AbstractAuthenticationProcessingFilter {
	
	
	public JwtAuthenticationTokenFilter() {
		super("/rest/**");
	}

	@Override
	public Authentication attemptAuthentication(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		
		String header = httpServletRequest.getHeader("Authorization");
		
		if(header == null || header.startsWith("Token ")) {
			throw new RuntimeException("JWT is missing");
		}
		
		String authenticationToken = header.substring(6);
		
		JwtAuthenticationToken token = new JwtAuthenticationToken(authenticationToken);
		return getAuthenticationManager().authenticate(token);
	}
	
	@Override
	protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws ServletException, IOException {
		super.successfulAuthentication(request, response, chain, authResult);
		chain.doFilter(request, response);
	}

}
