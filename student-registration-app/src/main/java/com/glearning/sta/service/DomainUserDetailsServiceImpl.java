package com.glearning.sta.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.glearning.sta.repository.UserRepository;

public class DomainUserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public userDetails loadUserByUsername(String username) throws UsernameNotFoundException{
		return this.userRepository
				.findByUsername(username)
				.map(DomainUserDetails::new)
				.orElseThrow)(()-> new UsernameNotFoundException("invalid username"));
	}

}
