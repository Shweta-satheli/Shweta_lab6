package com.glearning.sta.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class WebSecurityconfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("user").password("shweta").roles("USER").and().withUser("admin")
		.password("satheli").roles("ADMIN");
	}
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		 .antMatchers("/list","/403").hasAnyAuthority("USER","ADMIN")
         .antMatchers("/save","/showFormForAdd","/showFormForUpdate","/delete").hasAuthority("ADMIN")
		 .and()
		. formLogin()
		 .and()
		 .logout().logoutSuccessUrl("/login").permitAll()
		 .and()
		 .exceptionHandling().accessDeniedPage("/403")
		 .and()
         .cors().and().csrf().disable();
	}

}



}
