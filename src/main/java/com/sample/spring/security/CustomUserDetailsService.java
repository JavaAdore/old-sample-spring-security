package com.sample.spring.security;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

 
public class CustomUserDetailsService implements UserDetailsService{

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// hit database and fetch users.. if it doesn't exist throw new UsernameNotFoundException
		CustomUserDetails customUserDetails = new CustomUserDetails();
		customUserDetails.getAuthorities().add(new SimpleGrantedAuthority("ADMIN"));
		customUserDetails.getAuthorities().add(new SimpleGrantedAuthority("USER"));
		customUserDetails.setPassword("test");
		customUserDetails.setUsername("test");
		
		return customUserDetails;
	}

}
