package com.sample.spring.security;

import org.springframework.security.crypto.password.PasswordEncoder;

public class CustomPasswordEncoder implements PasswordEncoder {
	
	@Override
	public String encode(CharSequence rawPassword) {
		// encode the raw password then return it 
		return rawPassword.toString();
	}

	@Override
	public boolean matches(CharSequence rawPassword, String encodedPassword) {
		// hash the row password and compare it with encoded password
		return rawPassword.equals(encodedPassword);
	}

}
