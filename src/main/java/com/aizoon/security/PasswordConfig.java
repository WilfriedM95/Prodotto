package com.aizoon.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
public class PasswordConfig {

	/**
	 * on creer la cler de codage*/
	@Bean
public  PasswordEncoder passwordEncoder(){
	return new BCryptPasswordEncoder(10);
	}
}