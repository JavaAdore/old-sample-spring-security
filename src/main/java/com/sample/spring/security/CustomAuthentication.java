package com.sample.spring.security;

import java.util.Collection;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

public class CustomAuthentication extends AbstractAuthenticationToken{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final String token;
	
 
	public CustomAuthentication(String token)
	{
		super(null);
		this.token=token;
		super.setAuthenticated(true);

	}
	
	
	
	public CustomAuthentication(String token , Collection<? extends GrantedAuthority> authorities) {
 		super(authorities);
 		this.token  = token;
 		
 	}

	
	
	@Override
	public Object getCredentials() {
 		return token;
	}

	@Override
	public Object getPrincipal() {
 		return token;
	}

}
