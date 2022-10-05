package com.seleniumexpress.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {
	
	//Want to create some user details
	//username, password, roles 
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception
	{
		//this will store user into in-memory i.e. server memory
		auth.inMemoryAuthentication().withUser("neha").password("neha123").roles("admin");
	}
	
	//this will encode my password, if I don't write this, the spring will give error that no 
	//password encoder has been used to encode the password
	@Bean
	PasswordEncoder getPasswordEncoder()
	{
		//this NoOpPasswordEncode does not encrypt pswd, it only saves the pswd in clear text form
		//this can be used only for demo purpose
		return NoOpPasswordEncoder.getInstance();
	}

}
