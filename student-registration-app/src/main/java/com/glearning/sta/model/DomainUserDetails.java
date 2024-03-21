package com.glearning.sta.model;

import java.util.Collection;

import org.spring.framework.security.core.GrantedAuthority;
import org.spring.framework.security.core.authority.SimpleGrantedAuthority;

public class DomainUserDetails {

	private User user;
	public DomainUserDetails(User user) {
		this.user = user;
	}
	
	@Override
	public Collection<?extends GrantAuthority> getAuthorities(){
		return.this.user.getRoles()
						.stream()
						.map(Role::getRole)
						.map(SimpleGrantedAuthority::new)
						.collect(Collectors.toSet());
	}
	@Override
	public String getPassword() {
		return.this.user.getPassword();
	}
	
	@Override
	public String getUsername() {
		return.this.user.getUsername();
	}
	
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}
}
