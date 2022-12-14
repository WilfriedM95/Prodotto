package com.aizoon.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;


@Configuration
@EnableWebSecurity

public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter{

	
	private final PasswordEncoder passwordEncoder;
	
	@Autowired
	public ApplicationSecurityConfig(PasswordEncoder passwordEncoder) {
		this.passwordEncoder=passwordEncoder;
	}
	@Override
	protected void configure(HttpSecurity http)throws Exception{
		http.authorizeRequests()
		.antMatchers("/","index","/css/*")
		.permitAll()
		.antMatchers("/api/**").hasRole(ApplicationUserRole.STUDENT.name() )
        .anyRequest().
          authenticated().
           and().
            httpBasic();	
		}
	
	/**creation d'utilisateur avec password
	 * nom
	 * password doit etre coder sinon il y'aura erreur
	 * role
	 * ..*/
	@Override
	@Bean
	protected UserDetailsService userDetailsService() {
	
		UserDetails annaSmithUser=
				User.builder()
        .username("annasmith")
        .password(passwordEncoder.encode("password"))
        .roles(ApplicationUserRole.STUDENT.name())// ROLE_STUDENT
        .build();

		UserDetails lindaUser=User.builder().username("linda").
				password(passwordEncoder.encode("password123")).
<<<<<<< HEAD
				roles(ApplicationUserRole.ADMIN.name()).build();
		
		UserDetails tomUser=User.builder().username("tom").
				password(passwordEncoder.encode("password123")).
				roles(ApplicationUserRole.ADMINTRAINEE.name()).build();
		return new InMemoryUserDetailsManager(lindaUser,annaSmithUser,tomUser);
=======
				roles("ADMIN").build();
		return new InMemoryUserDetailsManager(lindaUser,annaSmithUser);
>>>>>>> f9e649d14d216e1456a56a8f86155a91c10e13fe
		
	}
	
	
}
