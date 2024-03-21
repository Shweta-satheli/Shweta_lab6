package com.glearning.sta.service;

public interface UserDetailsService {

	userDetails loadUserByUsername(String username) throws UsernameNotFoundException;

}
