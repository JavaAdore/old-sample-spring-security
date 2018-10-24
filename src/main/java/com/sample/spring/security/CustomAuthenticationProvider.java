package com.sample.spring.security;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomAuthenticationProvider implements AuthenticationProvider {

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		CustomAuthentication customAuthentication =  (CustomAuthentication)authentication;
		String token = (String) customAuthentication.getCredentials();
		if(token !=null &&  token.equals("123"))
		{
			return new CustomAuthentication(token, AuthorityUtils.createAuthorityList("USER"));
		}else if(token !=null &&  token.equals("321"))
		{
			return new CustomAuthentication(token, AuthorityUtils.createAuthorityList("ADMIN"));
		}
		else if(token !=null &&  token.equals("000"))
		{
			return new CustomAuthentication(token, AuthorityUtils.createAuthorityList("anonymous"));
		}
		 throw new UsernameNotFoundException("invalid token");
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return CustomAuthentication.class.equals(authentication);
	}

}
